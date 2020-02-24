package io.infinite.cobol

class CobolApiXml implements CobolApi {

    OutputStream outputStream

    CobolApiXml() {
        outputStream = System.out
    }

    CobolApiXml(OutputStream outputStream) {
        this.outputStream = outputStream
    }

    void fileStart() {
        outputStream << "<file>\n"
    }

    void fileEnd() {
        outputStream << "</file>\n"
    }

    void importField(CobolGroup cobolGroup, String fieldValue) {
        if (cobolGroup.groupName != "FILLER") {
            outputStream << "".padLeft(cobolGroup.depth * 4 + 4) + fieldValue + "\n"
        }
    }

    void recordStart(String recordName) {
        outputStream << """<$recordName>""" + "\n"
    }

    void recordEnd(String recordName) {
        outputStream << """</$recordName>""" + "\n"
    }

    void groupStart(CobolGroup cobolGroup) {
        outputStream << "".padLeft(cobolGroup.depth * 4) + """<$cobolGroup.groupName>""" + "\n"
    }

    void groupEnd(CobolGroup cobolGroup) {
        outputStream << "".padLeft(cobolGroup.depth * 4) + """</$cobolGroup.groupName>""" + "\n"
    }

    void occurrenceStart(CobolGroup cobolGroup) {
        outputStream << "".padLeft(cobolGroup.depth * 4) + """  <occurrence>""" + "\n"
    }

    void occurrenceEnd(CobolGroup cobolGroup) {
        outputStream << "".padLeft(cobolGroup.depth * 4) + """  </occurrence>""" + "\n"
    }

    void redefinitionStart(CobolGroup cobolGroup) {
        outputStream << "".padLeft(cobolGroup.depth * 4) + """  <redefinition>""" + "\n"
    }

    void redefinitionEnd(CobolGroup cobolGroup) {
        outputStream << "".padLeft(cobolGroup.depth * 4) + """  </redefinition>""" + "\n"
    }

    void importConstant(CobolGroup cobolGroup, String constantValue) {
        outputStream << "".padLeft(cobolGroup.depth * 4 + 4) + constantValue + "\n"
    }

}
