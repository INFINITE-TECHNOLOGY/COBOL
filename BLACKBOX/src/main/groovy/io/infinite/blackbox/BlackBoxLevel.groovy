package io.infinite.blackbox

enum BlackBoxLevel {

    METHOD(200),
    ERROR(100),
    NONE(0)

    private final int blackBoxLevel

    BlackBoxLevel(int blackBoxLevel) {
        this.blackBoxLevel = blackBoxLevel
    }

    int value() {
        return blackBoxLevel
    }

}