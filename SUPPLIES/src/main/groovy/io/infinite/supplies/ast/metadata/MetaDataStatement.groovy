package io.infinite.supplies.ast.metadata

import groovy.transform.ToString
import org.codehaus.groovy.ast.MethodNode
import org.codehaus.groovy.ast.stmt.Statement

@ToString(includeNames = true, includeFields = true, includeSuper = true)
class MetaDataStatement extends MetaDataASTNode {

    String statementClassName

    MetaDataStatement(Statement statement, MethodNode methodNode) {
        initUsingAstNode(statement)
        additionalStatementInit(statement.getClass().getSimpleName())
        initMethodAndClassMetaData(methodNode, methodNode.getDeclaringClass())
    }

    MetaDataStatement(Statement statement) {
        initUsingAstNode(statement)
        additionalStatementInit(statement.getClass().getSimpleName())
    }

    void additionalStatementInit(
            String statementClassName
    ) {
        this.statementClassName = statementClassName
    }

    MetaDataStatement(
            String statementClassName,
            Integer lineNumber,
            Integer lastLineNumber,
            Integer columnNumber,
            Integer lastColumnNumber,
            String methodName,
            String className
    ) {
        initUsingMetaDataFields(
                lineNumber,
                lastLineNumber,
                columnNumber,
                lastColumnNumber
        )
        initMethodAndClassMetaData(methodName, className)
        additionalStatementInit(
                statementClassName
        )
    }

}
