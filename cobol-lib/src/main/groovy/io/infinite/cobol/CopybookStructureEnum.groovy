package io.infinite.cobol

enum CopybookStructureEnum {

    ONE_RECORD("ONE_RECORD"),
    TWO_RECORD_H("TWO_RECORD_H"),
    TWO_RECORD_T("TWO_RECORD_T"),
    THREE_RECORD("THREE_RECORD")

    private final String copybookStructure

    CopybookStructureEnum(String copybookStructure) {
        this.copybookStructure = copybookStructure
    }

    String value() {
        return copybookStructure
    }

}