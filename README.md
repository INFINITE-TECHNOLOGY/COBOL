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
- Supports configurable line-break sequences

# Usage

## As library

```groovy
        File copybookFile = new File("./test_files/copybook_multirecord.cbl")
        CobolCompiler cobolCompiler = new CobolCompiler()
        CobolRuntime cobolRuntime = cobolCompiler.compileCobol(copybookFile.getText(), FIXED)
        File dataFile = new File("./test_files/COBOLDATAFILE.TXT")
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

## As executable (command-line)

Prerequisites: Java 8 installed.

This COBOL CLI converts COBOL data file into XML.

1) Download file:
https://bintray.com/infinite-technology/io.i-t/download_file?file_path=io%2Fi-t%2Fcobol-cli%2F1.0.0%2Fcobol-cli-1.0.0.jar

2) Run it from command line using:
`java -jar cobol-cli-1.0.0.jar <copybookFile> <dataFile> <resultFile>`

Example:
`java -jar cobol-cli-1.0.0.jar java -jar cobol-cli-1.0.0.jar copybook.cbl datafile.bin datafile.bin.xml`


Help:
```
Usage: COBOL-CLI [-hV] [-e=<encoding>] [-f=<copybookFormat>] [-l=<lineBreak>]
                 [-s=<structure>] <copybookFile> <dataFile> <resultFile>
Convert COBOL data file to XML.
      <copybookFile>   Copybook file.
      <dataFile>       COBOL data file
      <resultFile>     Result XML file
  -e, --encoding=<encoding>
                       COBOL data file character encoding, i.e. 037 (EBCDIC),
                         ASCII, etc
                         Default: 037
  -f, --copybookFormat=<copybookFormat>
                       Copybook format
                       Default: FIXED
                       Supported: FIXED, TANDEM, VARIABLE
  -h, --help           Show this help message and exit.
  -l, --lineBreak=<lineBreak>
                       Specify line break sequence
                       Use if COBOL data file is already split by lines.
                       Default: NONE
                       Supported: CRLF, CR, LF, LFCR, NL, NONE
  -s, --structure=<structure>
                       Copybook structure.
                       Use if your file has header and/or trailer.
                       Default: DETAILS
                       Supported: DETAILS, HEADER_DETAILS, DETAILS_TRAILER,
                         HEADER_DETAILS_TRAILER
  -V, --version        Print version information and exit.
```