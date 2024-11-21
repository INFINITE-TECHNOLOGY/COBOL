package io.infinite.supplies.ast.exceptions

import io.infinite.supplies.ast.metadata.MetaDataASTNode

class SuppliesRuntimeException extends Exception {

    SuppliesRuntimeException(String var1) {
        super(var1)
    }

    SuppliesRuntimeException(String var1, Exception exception) {
        super(var1, exception)
        this.setStackTrace([] as StackTraceElement[])
    }

    SuppliesRuntimeException(MetaDataASTNode metaDataASTNode, Exception exception) {
        super(metaDataASTNode.toString(), exception)
        this.setStackTrace([] as StackTraceElement[])
    }

}