# COBOL

Groovy Cobol Transpiler, Runtime environment and API

- The only existing Open Source implementation of COBOL in Java (Groovy)
- Powered by best available COBOL source code parser [proleap.io](https://github.com/uwol/proleap-cobol-parser)
- Supports `COMP-3` data picture
- Currently supports only `Data Section Division`
- Supports `Redefines`
- Supports `Occurs`
- Works great with hierarchical APIs, e.g. XML (provided)
- Supports `copybooks` with 1, 2 or 3 records structure
- Supports different data file encodings, including EBCDIC (IBM 037)

Usage:

```groovy
        File copybookFile = new File("./test_files/copybook_multirecord.cbl")
        CobolCompiler cobolCompiler = new CobolCompiler()
        CobolRuntime cobolRuntime = cobolCompiler.compileCobol(copybookFile.getText(), FIXED)
        File dataFile = new File("./test_files/PROD_SG_DCDDA_EMBS_20190905.TXT")
        File resultFile = new File("./test_files/multirecord.xml")
        cobolRuntime.run(
                dataFile.length(),
                dataFile.newInputStream(),
                "037",
                [],
                new CobolApiXml(resultFile.newOutputStream()),
                CopybookStructureEnum.THREE_RECORD
        )
```