package io.infinite.supplies.ast.metadata

import groovy.transform.ToString
import org.codehaus.groovy.ast.ASTNode
import org.codehaus.groovy.ast.ClassNode
import org.codehaus.groovy.ast.MethodNode

@ToString(includeNames = true, includeFields = true)
abstract class MetaDataASTNode {

    Integer lineNumber
    Integer lastLineNumber
    Integer columnNumber
    Integer lastColumnNumber
    String methodName
    String className

    void initUsingMetaDataFields(
            Integer lineNumber,
            Integer lastLineNumber,
            Integer columnNumber,
            Integer lastColumnNumber
    ) {
        this.lineNumber = lineNumber
        this.lastLineNumber = lastLineNumber
        this.columnNumber = columnNumber
        this.lastColumnNumber = lastColumnNumber
    }

    void initUsingAstNode(ASTNode astNode) {
        initUsingMetaDataFields(
                astNode.getLineNumber(),
                astNode.getLastLineNumber(),
                astNode.getColumnNumber(),
                astNode.getLastColumnNumber()
        )
    }

    void initMethodAndClassMetaData(
            MethodNode methodNode,
            ClassNode classNode
    ) {
        this.methodName = methodNode.getName()
        this.className = classNode.getName()
    }

    void initMethodAndClassMetaData(
            String methodName,
            String className
    ) {
        this.methodName = methodName
        this.className = className
    }

    void initClassMetaData(ClassNode classNode) {
        this.className = classNode.getName()
    }

}
