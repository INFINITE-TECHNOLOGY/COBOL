package io.infinite.cobol

enum LineBreakEnum {

    CRLF([(byte) 13, (byte) 10], "CRLF"),
    CR([(byte) 13], "CR"),
    LF([(byte) 10], "LF"),
    LFCR([(byte) 10, (byte) 13], "LFCR"),
    NL([(byte) 21], "NL"),
    NONE([], "NONE")

    private final String label

    private final List<Byte> bytes

    LineBreakEnum(List<Byte> bytes, String label) {
        this.label = label
        this.bytes = bytes
    }

    List<Byte> asBytes() {
        return bytes
    }

    String asLabel() {
        return label
    }

}