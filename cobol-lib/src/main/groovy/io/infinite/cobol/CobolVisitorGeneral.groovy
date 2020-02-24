package io.infinite.cobol

import groovy.util.logging.Slf4j
import io.proleap.cobol.CobolParser

@Slf4j
//@BlackBox(level = CarburetorLevel.METHOD)
class CobolVisitorGeneral extends CobolVisitorUnsupported {

    @Override
    Boolean visitCompilationUnit(CobolParser.CompilationUnitContext ctx) {
        return super.visitCompilationUnit(ctx)
    }

    @Override
    Boolean visitProgramUnit(CobolParser.ProgramUnitContext ctx) {
        return super.visitProgramUnit(ctx)
    }

    @Override
    Boolean visitIdentificationDivision(CobolParser.IdentificationDivisionContext ctx) {
        return super.visitIdentificationDivision(ctx)
    }

    @Override
    Boolean visitProgramIdParagraph(CobolParser.ProgramIdParagraphContext ctx) {
        return super.visitProgramIdParagraph(ctx)
    }

    @Override
    Boolean visitProgramName(CobolParser.ProgramNameContext ctx) {
        return super.visitProgramName(ctx)
    }

    @Override
    Boolean visitCobolWord(CobolParser.CobolWordContext ctx) {
        return super.visitCobolWord(ctx)
    }

    @Override
    Boolean visitEnvironmentDivision(CobolParser.EnvironmentDivisionContext ctx) {
        return super.visitEnvironmentDivision(ctx)
    }

    @Override
    Boolean visitEnvironmentDivisionBody(CobolParser.EnvironmentDivisionBodyContext ctx) {
        return super.visitEnvironmentDivisionBody(ctx)
    }

    @Override
    Boolean visitConfigurationSection(CobolParser.ConfigurationSectionContext ctx) {
        return super.visitConfigurationSection(ctx)
    }

    @Override
    Boolean visitConfigurationSectionParagraph(CobolParser.ConfigurationSectionParagraphContext ctx) {
        return super.visitConfigurationSectionParagraph(ctx)
    }


    @Override
    Boolean visitSpecialNamesParagraph(CobolParser.SpecialNamesParagraphContext ctx) {
        return super.visitSpecialNamesParagraph(ctx)
    }

    @Override
    Boolean visitSpecialNameClause(CobolParser.SpecialNameClauseContext ctx) {
        return super.visitSpecialNameClause(ctx)
    }

    @Override
    Boolean visitDecimalPointClause(CobolParser.DecimalPointClauseContext ctx) {
        return super.visitDecimalPointClause(ctx)
    }

    @Override
    Boolean visitInputOutputSection(CobolParser.InputOutputSectionContext ctx) {
        return super.visitInputOutputSection(ctx)
    }

    @Override
    Boolean visitDataDivision(CobolParser.DataDivisionContext ctx) {
        return super.visitDataDivision(ctx)
    }

    @Override
    Boolean visitDataOccursIndexed(CobolParser.DataOccursIndexedContext ctx) {
        return super.visitDataOccursIndexed(ctx)
    }

    @Override
    Boolean visitIndexName(CobolParser.IndexNameContext ctx) {
        return super.visitIndexName(ctx)
    }

    @Override
    Boolean visitFigurativeConstant(CobolParser.FigurativeConstantContext ctx) {
        return super.visitFigurativeConstant(ctx)
    }

}
