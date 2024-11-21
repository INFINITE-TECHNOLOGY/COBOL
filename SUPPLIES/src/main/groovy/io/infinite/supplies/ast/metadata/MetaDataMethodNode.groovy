package io.infinite.supplies.ast.metadata

import groovy.transform.ToString
import org.codehaus.groovy.ast.MethodNode

@ToString(includeNames = true, includeFields = true, includeSuper = true)
class MetaDataMethodNode extends MetaDataASTNode {

    MetaDataMethodNode(MethodNode methodNode) {
        initUsingAstNode(methodNode)
    }

    MetaDataMethodNode(
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
    }

}
