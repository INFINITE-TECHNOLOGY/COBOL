package io.infinite.cobol

import groovy.transform.CompileDynamic
import groovy.util.logging.Slf4j
import io.proleap.cobol.asg.metamodel.CompilationUnit
import io.proleap.cobol.asg.metamodel.Program
import io.proleap.cobol.asg.runner.impl.CobolParserRunnerImpl
import io.proleap.cobol.preprocessor.CobolPreprocessor

@Slf4j
class CobolCompiler {

    /**
     * Compiles COBOL code into executable Cobol Runtime<br>
     *     Any valid COBOL code/copybook is supported.<br>
     *         All three COBOL code formats are supported (FIXED, TANDEM, VARIABLE)<br>
     *             At current time only Data Section is supported.
     *
     * @param cobolCode cobol code.
     * @param format (FIXED, TANDEM, VARIABLE) - usually FIXED is used.
     * @return Cobol Runtime, executable using run() method
     * io.infinite.cobol.CobolRuntime
     */
    @CompileDynamic
    CobolRuntime compileCobol(String cobolCode, CobolPreprocessor.CobolSourceFormatEnum format) {
        Program program = new CobolParserRunnerImpl().analyzeCopybook(cobolCode, new File("./test").getAbsoluteFile(), format);
        CobolVisitorDataSection cobolVisitorDataSection = new CobolVisitorDataSection(program)
        for (final CompilationUnit compilationUnit : program.getCompilationUnits()) {
            cobolVisitorDataSection.visit(compilationUnit.getCtx());
        }
        String sourceCode = cobolClosureRuntimeTemplate.replace("%SOURCE_CODE%", cobolVisitorDataSection.sourceCode)
        log.debug(sourceCode)
        GroovyClassLoader groovyClassLoader = new GroovyClassLoader(CobolRuntime.getClassLoader())
        Class cobolClosureRuntimeClass = groovyClassLoader.parseClass(sourceCode)
        CobolRuntime cobolClosureRuntime = cobolClosureRuntimeClass.newInstance() as CobolRuntime
        return cobolClosureRuntime
    }

    private String getCobolClosureRuntimeTemplate() {
        return """import groovy.transform.CompileStatic
import io.infinite.cobol.CobolRuntime
import io.infinite.cobol.CobolApi
import io.infinite.cobol.CopybookStructureEnum

@CompileStatic
class CobolClosureRuntime extends CobolRuntime {

    @Override
    void run(Long totalSize, InputStream inputStream, String charsetName, List<Byte> lineBreakBytes, CobolApi cobolApi, CopybookStructureEnum copybookStructure) {
        super.setup(totalSize, inputStream, charsetName, lineBreakBytes, cobolApi, copybookStructure)
%SOURCE_CODE%
    }

}"""
    }

}
