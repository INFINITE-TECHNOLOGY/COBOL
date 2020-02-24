package io.infinite.cobol

interface CobolApi {

    void fileStart()

    void fileEnd()

    void importField(CobolGroup cobolGroup, String fieldValue)

    void recordStart(String recordName)

    void recordEnd(String recordName)

    void groupStart(CobolGroup cobolGroup)

    void groupEnd(CobolGroup cobolGroup)

    void occurrenceStart(CobolGroup cobolGroup)

    void occurrenceEnd(CobolGroup cobolGroup)

    void redefinitionStart(CobolGroup cobolGroup)

    void redefinitionEnd(CobolGroup cobolGroup)

    void importConstant(CobolGroup cobolGroup, String constantValue)

}
