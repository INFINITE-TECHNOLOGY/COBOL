package io.infinite.cobol

enum CopybookStructureEnum {

    DETAILS("DETAILS"),
    HEADER_DETAILS("HEADER_DETAILS"),
    DETAILS_TRAILER("DETAILS_TRAILER"),
    HEADER_DETAILS_TRAILER("HEADER_DETAILS_TRAILER")

    private final String copybookStructure

    CopybookStructureEnum(String copybookStructure) {
        this.copybookStructure = copybookStructure
    }

    String value() {
        return copybookStructure
    }

}