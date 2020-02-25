package io.infinite.cobol

import groovy.util.logging.Slf4j
import io.infinite.blackbox.BlackBox
import io.proleap.cobol.preprocessor.CobolPreprocessor
import picocli.CommandLine

import java.util.concurrent.Callable

@BlackBox
@Slf4j
@CommandLine.Command(name = "COBOL-CLI", mixinStandardHelpOptions = true, description = "Convert COBOL data file to XML.", version = "1.0.0")
class Main implements Callable<Integer> {

    @CommandLine.Parameters(index = "0", description = "Copybook file.")
    File copybookFile

    @CommandLine.Parameters(index = "1", description = "COBOL data file")
    File dataFile

    @CommandLine.Parameters(index = "2", description = "Result XML file")
    File resultFile

    @CommandLine.Option(names = ["-e", "--encoding"], description = "COBOL data file character encoding, i.e. 037 (EBCDIC), ASCII, etc", defaultValue = "037", showDefaultValue = CommandLine.Help.Visibility.ALWAYS)
    String encoding

    @CommandLine.Option(names = ["-s", "--structure"], description = "Copybook structure.\nUse if your file has header and/or trailer.\nDefault: \${DEFAULT-VALUE}\nSupported: \${COMPLETION-CANDIDATES}")
    CopybookStructureEnum structure = CopybookStructureEnum.DETAILS

    @CommandLine.Option(names = ["-l", "--lineBreak"], description = "Specify line break sequence\nUse if COBOL data file is already split by lines.\nDefault: \${DEFAULT-VALUE}\nSupported: \${COMPLETION-CANDIDATES}")
    LineBreakEnum lineBreak = LineBreakEnum.NONE

    @CommandLine.Option(names = ["-f", "--copybookFormat"], description = "Copybook format\nDefault: \${DEFAULT-VALUE}\nSupported: \${COMPLETION-CANDIDATES}")
    CobolPreprocessor.CobolSourceFormatEnum copybookFormat = CobolPreprocessor.CobolSourceFormatEnum.FIXED

    static void main(String[] args) {
        log.info("Welcome to Infinite Technology COBOL.")
        log.info("This is Open Source software, free for usage and modification.")
        log.info("By using this software you accept License and User Agreement.")
        log.info("Visit our web site: https://i-t.io/Cobol")
        int exitCode = new CommandLine(new Main()).execute(args)
        System.exit(exitCode)
    }

    Integer call() throws Exception {
        CobolCompiler cobolCompiler = new CobolCompiler()
        CobolRuntime cobolRuntime = cobolCompiler.compileCobol(copybookFile.getText(), copybookFormat)
        cobolRuntime.run(
                dataFile.length(),
                dataFile.newInputStream(),
                encoding,
                lineBreak.asBytes(),
                new CobolApiXml(resultFile.newOutputStream()),
                structure
        )
        return 0
    }

}
