package io.infinite.blackbox

class MethodMetaData {

    String className
    String methodName
    Integer lineNumber
    Integer lastLineNumber
    Integer columnNumber
    Integer lastColumnNumber

    MethodMetaData(
            String className,
            String methodName,
            Integer lineNumber,
            Integer lastLineNumber,
            Integer columnNumber,
            Integer lastColumnNumber
    ) {
        this.className = className
        this.methodName = methodName
        this.lineNumber = lineNumber
        this.lastLineNumber = lastLineNumber
        this.columnNumber = columnNumber
        this.lastColumnNumber = lastColumnNumber
    }

    String toString() {
        return className + "." + methodName + "#L$lineNumber-$lastLineNumber"
    }

}
