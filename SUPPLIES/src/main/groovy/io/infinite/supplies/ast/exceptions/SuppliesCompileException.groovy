package io.infinite.supplies.ast.exceptions

import io.infinite.supplies.ast.other.ASTUtils
import org.codehaus.groovy.ast.ASTNode

class SuppliesCompileException extends Exception {

    SuppliesCompileException(ASTNode astNode, Exception exception) {
        super(new ASTUtils().prepareExceptionMessage(astNode), exception)
        this.setStackTrace([] as StackTraceElement[])
    }

    SuppliesCompileException(ASTNode astNode, String message) {
        super(message + "\n" + new ASTUtils().prepareExceptionMessage(astNode))
    }

}