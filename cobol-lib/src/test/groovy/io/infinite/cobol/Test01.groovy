package io.infinite.cobol.cobol

import io.infinite.cobol.CobolApiXml
import io.infinite.cobol.CobolCompiler
import io.infinite.cobol.CobolRuntime
import io.infinite.cobol.CopybookStructureEnum
import io.proleap.cobol.preprocessor.CobolPreprocessor

class Test01 {

    static void main(String[] args) {
        File copybookFile = new File("cobol-test/copybook.cbl")
        CobolCompiler cobolCompiler = new CobolCompiler()
        CobolRuntime cobolRuntime = cobolCompiler.compileCobol(copybookFile.getText(), CobolPreprocessor.CobolSourceFormatEnum.FIXED)
        File dataFile = new File("cobol-test/copybook.cbl")
        File resultFile = new File("cobol-test/datafile.bin.xml")
        cobolRuntime.run(
                dataFile.length(),
                dataFile.newInputStream(),
                "037",
                [],
                new CobolApiXml(resultFile.newOutputStream()),
                CopybookStructureEnum.DETAILS
        )
    }

}
