package io.infinite.blackbox

import org.codehaus.groovy.ast.ASTNode

class BlackBoxTransformationException extends Exception {

    BlackBoxTransformationException(ASTNode astNode, Exception exception) {
        super(astNode.toString(), exception)
        this.stackTrace = [] as StackTraceElement[]
    }

    BlackBoxTransformationException(ASTNode astNode, String message) {
        super("$message (${astNode.toString()})")
    }

}