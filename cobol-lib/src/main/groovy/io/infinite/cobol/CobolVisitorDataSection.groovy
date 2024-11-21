package io.infinite.cobol

import groovy.transform.CompileDynamic
import groovy.util.logging.Slf4j
import io.infinite.blackbox.BlackBox
import io.infinite.blackbox.BlackBoxLevel
import io.proleap.cobol.CobolParser
import io.proleap.cobol.asg.metamodel.Literal
import io.proleap.cobol.asg.metamodel.Program
import io.proleap.cobol.asg.metamodel.call.DataDescriptionEntryCall
import io.proleap.cobol.asg.metamodel.data.datadescription.*
import io.proleap.cobol.asg.metamodel.valuestmt.IntegerLiteralValueStmt
import io.proleap.cobol.asg.metamodel.valuestmt.LiteralValueStmt
import io.proleap.cobol.asg.metamodel.valuestmt.ValueStmt
import org.antlr.v4.runtime.tree.ParseTree
import org.apache.commons.lang3.StringUtils

@Slf4j
@BlackBox(level = BlackBoxLevel.ERROR)
class CobolVisitorDataSection extends CobolVisitorGeneral {

    Program program

    CobolStackElement currentFrame = new CobolStackElement()

    String sourceCode = ""

    void write(String what) {
        String line = "".padLeft(currentFrame.depth * 4) + what
        sourceCode += line + "\n"
        log.debug(line)
    }

    CobolVisitorDataSection(Program program) {
        this.program = program
    }

    @BlackBox(level = BlackBoxLevel.NONE)
    private CobolVisitorDataSection() {
    }

    void closeClosure(String comment) {
        if (currentFrame.redefine && currentFrame.reoccur) {
            throw new CobolExceptionCompile("Unsupported redefine and occurs at the same time: " + currentFrame.entry.name ?: "FILLER")
        }
        String groupName = ""
        if (currentFrame.entry != null) {
            groupName = "(end of group: ${currentFrame.entry.name ?: "FILLER"})"
        }
        if (currentFrame.redefine) {
            write "  }//" + comment + "(end of redefine of ${currentFrame.redefineWhat})"
            write "}//" + comment + groupName
        } else if (currentFrame.reoccur) {
            write "  }//" + comment + "(end of reoccur ${currentFrame.reoccurHowMany} times)"
            write "}//" + comment + groupName
        } else {
            write "}//" + comment + groupName
        }
    }

    @Override
    Boolean visitDataDivisionSection(CobolParser.DataDivisionSectionContext ctx) {
        return super.visitDataDivisionSection(ctx)
    }

    @Override
    Boolean visitWorkingStorageSection(CobolParser.WorkingStorageSectionContext ctx) {
        write """readFile() {"""
        Boolean result = super.visitWorkingStorageSection(ctx)
        while (currentFrame.prev != null) {
            closeClosure("<<<<")
            currentFrame = currentFrame.pop()
        }
        closeClosure("<<<<<")
        return result
    }

    @Override
    Boolean visitDataDescriptionEntry(CobolParser.DataDescriptionEntryContext ctx) {
        return super.visitDataDescriptionEntry(ctx)
    }

    @Override
    Boolean visitDataDescriptionEntryFormat1(CobolParser.DataDescriptionEntryFormat1Context ctx) {
        processDataDescriptionEntry(ctx)
        return super.visitDataDescriptionEntryFormat1(ctx)
    }

    @Override
    Boolean visitDataName(CobolParser.DataNameContext ctx) {
        return super.visitDataName(ctx)
    }

    @Override
    @CompileDynamic
    Boolean visitDataPictureClause(CobolParser.DataPictureClauseContext ctx) {
        PictureClause entry = (PictureClause) program.getASGElementRegistry().getASGElement(ctx)
        def (length, comp3length, scale) = calculateLengths(entry.pictureString)
        write """    setDataPicture("""
        write """        depth: ${currentFrame.depth},"""
        write """        pictureString: "${entry.pictureString}","""
        write """        length: ${length},"""
        write """        comp3length: ${comp3length},"""
        write """        scale: ${scale},"""
        Boolean result = super.visitDataPictureClause(ctx)
        write """    )"""
        return result
    }

    @CompileDynamic
    List<Integer> calculateLengths(String dataPictureString) {
        Integer length = 0
        Integer comp3length
        Integer scale
        List<Integer> lengths = []
        String pictureString = dataPictureString
        pictureString.eachMatch("\\d*") {
            if (it != null && it != "") {
                lengths.add(Integer.valueOf(StringUtils.stripStart(it, "0")))
            }
        }
        if (pictureString.startsWith("S")) {
            pictureString = pictureString.substring(1)
        }
        String delimiter
        if (pictureString.matches("^9\\(\\d*\\)\$")) {
            //unescaped: ^9\(\d*\)$
            //e.g. 9(06)
            length = lengths.last() as Integer
            scale = 0
        } else if (pictureString.matches("^9\\(\\d*\\)V9*") || pictureString.matches("^9\\(\\d*\\)\\.9*")) {
            //unescaped: ^9\(\d*\)V9*
            //e.g. 9(15)V99999
            length = lengths[1] //15
            length += lengths.last().toString().length() //99999 -> 5
            length += StringUtils.countMatches(pictureString, ".")
            scale = lengths.last().toString().length()
        } else if (pictureString.matches("^9*V9*\$") || pictureString.matches("^9*\\.9*\$")) {
            //unescaped: ^9*V9*$
            //e.g. 999V99999
            length += lengths.first().toString().length() //999 -> 3
            length += lengths.last().toString().length() //99999 -> 5
            length += StringUtils.countMatches(pictureString, ".")
            scale = lengths.last().toString().length()
        } else if (pictureString.matches("^9*V9\\(\\d*\\)\$") || pictureString.matches("^9*\\.9\\(\\d*\\)\$")) {
            //unescaped: ^9*V9\(\d*\)$
            //e.g. 999V9(3)
            length += lengths.first().toString().length() //999 -> 3
            length += lengths.last() //3
            length += StringUtils.countMatches(pictureString, ".")
            scale = lengths.last()
        } else if (pictureString.matches("^9\\(\\d*\\)V9\\(\\d*\\)\$") || pictureString.matches("^9\\(\\d*\\)\\.9\\(\\d*\\)\$")) {
            //unescaped: ^9\(\d*\)V9\(\d*\)$
            //e.g. 9(2)V9(3)
            length = lengths[1] //2
            length += lengths.last() //3
            length += StringUtils.countMatches(pictureString, ".")
            scale = lengths.last()
        } else if (pictureString.matches("^X\\(\\d*\\)\$")) {
            //unescaped: ^X\(\d*\)$
            //e.g. X(02)
            length = lengths.first()
            scale = 0
        } else if (pictureString == "X") {
            length = 1
            scale = 0
        } else {
            throw new CobolExceptionRuntime("Unsupported data picture clause: " + pictureString)
        }

        //http://www.3480-3590-data-conversion.com/article-packed-fields.html
        //To calculate the number of bytes from the PIC, add 1 (for the sign) to the total number of digits, divide by 2, and round up if necessary.
        //    PIC S9(7) COMP-3.     Byte size = (7 + 1) / 2 = 4
        //
        //    PIC S9(5)V99 COMP-3.  Byte size = (5 + 2 + 1) / 2 = 4
        //
        //    PIC S9(6) COMP-3.     Byte size = (6 + 1) / 2 = 3.5, rounded to 4
        //Comp-3 fields reserve a nybble for the sign, even for "unsigned" values, so the following fields are still 4 bytes:
        //
        //    PIC 9(7) COMP-3.     Byte size = (7 + 1) / 2 = 4
        //
        //    PIC 9(6) COMP-3.     Byte size = (6 + 1) / 2 = 3.5, rounded to 4
        comp3length = (Integer) Math.ceil((double) (length + 1) / 2)
        if (length == 0) {
            throw new CobolExceptionCompile("Failed to calculate length for picture string: " + pictureString)
        }
        return [length, comp3length, scale]
    }

    @Override
    Boolean visitPictureString(CobolParser.PictureStringContext ctx) {
        return super.visitPictureString(ctx)
    }

    @Override
    Boolean visitPictureChars(CobolParser.PictureCharsContext ctx) {
        return super.visitPictureChars(ctx)
    }

    @Override
    Boolean visitDataValueInterval(CobolParser.DataValueIntervalContext ctx) {
        return super.visitDataValueInterval(ctx)
    }

    @Override
    Boolean visitDataUsageClause(CobolParser.DataUsageClauseContext ctx) {
        UsageClause entry = (UsageClause) program.getASGElementRegistry().getASGElement(ctx)
        write """    setUsageType("${entry.usageClauseType}")"""
        Boolean result = super.visitDataUsageClause(ctx)
        return result
    }

    @Override
    Boolean visitIntegerLiteral(CobolParser.IntegerLiteralContext ctx) {
        return super.visitIntegerLiteral(ctx)
    }

    @Override
    Boolean visitDataRedefinesClause(CobolParser.DataRedefinesClauseContext ctx) {
        RedefinesClause redefinesClause = (RedefinesClause) program.getASGElementRegistry().getASGElement(ctx)
        if (!redefinesClause.redefinesCall instanceof DataDescriptionEntryCall) {
            throw new CobolExceptionCompile("Unsupported redefines call: " + redefinesClause.redefinesCall.getClass().getSimpleName())
        }
        DataDescriptionEntryCall dataDescriptionEntryCall = redefinesClause.redefinesCall as DataDescriptionEntryCall
        write """  redefineGroup("${dataDescriptionEntryCall.dataDescriptionEntry.name}") {"""
        currentFrame.redefine = true
        currentFrame.redefineWhat = dataDescriptionEntryCall.dataDescriptionEntry.name
        return super.visitDataRedefinesClause(ctx)
    }

    @Override
    Boolean visitDataDescriptionEntryFormat3(CobolParser.DataDescriptionEntryFormat3Context ctx) {
        write "//visitDataDescriptionEntryFormat3"
        processDataDescriptionEntry(ctx)
        return super.visitDataDescriptionEntryFormat3(ctx)
    }

    boolean processDataDescriptionEntry(ParseTree ctx) {
        DataDescriptionEntry entry = (DataDescriptionEntry) program.getASGElementRegistry().getASGElement(ctx)
        if (currentFrame.level == entry.levelNumber) {
            closeClosure("<")
            currentFrame = currentFrame.pop()
            currentFrame = currentFrame.push(entry)
        } else if (currentFrame.level < entry.levelNumber) {
            currentFrame = currentFrame.push(entry)
        } else {
            closeClosure("<<")
            while (currentFrame.level > entry.levelNumber) {
                currentFrame = currentFrame.pop()
                closeClosure("<<<")
            }
            currentFrame = currentFrame.pop()
            currentFrame = currentFrame.push(entry)
        }
        if (entry.levelNumber == 1) {
            write """createRecord("${entry.name}") {"""
        } else {
            if (entry.name == null) {
                write """createGroup(${currentFrame.depth}, "FILLER") {"""
            } else {
                write """createGroup(${currentFrame.depth}, "${entry.name}") {"""
            }
        }
    }

    @Override
    Boolean visitConditionName(CobolParser.ConditionNameContext ctx) {
        return super.visitConditionName(ctx)
    }

    @Override
    Boolean visitDataValueClause(CobolParser.DataValueClauseContext ctx) {
        write """    addValues(["""
        Boolean result = super.visitDataValueClause(ctx)
        ValueClause valueClause = (ValueClause) program.getASGElementRegistry().getASGElement(ctx)
        if (!valueClause instanceof LiteralValueStmt) {
            throw new CobolExceptionCompile("Unsupported value clause: " + valueClause.getClass().getSimpleName())
        }
        valueClause.valueIntervals.each {
            if (!it.fromValueStmt instanceof LiteralValueStmt) {
                throw new CobolExceptionCompile("Unsupported value clause interval: " + it.getClass().getSimpleName())
            }
            LiteralValueStmt literalValueStmt = (LiteralValueStmt) it.fromValueStmt
            if (literalValueStmt.literal.literalType == Literal.LiteralType.NON_NUMERIC) {
                write """        "${literalValueStmt.literal.nonNumericLiteral}", """
            } else if (literalValueStmt.literal.literalType == Literal.LiteralType.FIGURATIVE_CONSTANT) {
                write """        //${literalValueStmt.literal.figurativeConstant.figurativeConstantType} """
            } else {
                throw new CobolExceptionCompile("Unsupported literal type: " + literalValueStmt.literal.literalType)
            }
        }
        write "    ])"
        return result
    }

    @Override
    Boolean visitDataValueIntervalFrom(CobolParser.DataValueIntervalFromContext ctx) {
        return super.visitDataValueIntervalFrom(ctx)
    }

    @Override
    Boolean visitLiteral(CobolParser.LiteralContext ctx) {
        return super.visitLiteral(ctx)
    }

    @Override
    Boolean visitDataOccursClause(CobolParser.DataOccursClauseContext ctx) {
        OccursClause occursClause = (OccursClause) program.getASGElementRegistry().getASGElement(ctx)
        ValueStmt valueStmt = occursClause.from
        if (!valueStmt instanceof IntegerLiteralValueStmt) {
            throw new CobolExceptionCompile("Unsupported value clause interval: " + valueStmt.getClass().getSimpleName())
        }
        IntegerLiteralValueStmt integerLiteralValueStmt = (IntegerLiteralValueStmt) valueStmt
        write """  reoccurGroup(${integerLiteralValueStmt.literal.value}) {"""
        currentFrame.reoccur = true
        currentFrame.reoccurHowMany = integerLiteralValueStmt.literal.value
        return super.visitDataOccursClause(ctx)
    }

}
