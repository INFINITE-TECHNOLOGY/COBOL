package io.infinite.blackbox


import groovy.transform.ToString
import org.codehaus.groovy.ast.CodeVisitorSupport
import org.codehaus.groovy.ast.stmt.ReturnStatement
import org.codehaus.groovy.ast.tools.GeneralUtils

@ToString(includeNames = true, includeFields = true)
class BlackBoxVisitor extends CodeVisitorSupport {

    BlackBoxTransformation blackBoxTransformation

    BlackBoxVisitor(BlackBoxTransformation blackBoxTransformation) {
        this.blackBoxTransformation = blackBoxTransformation
    }

    @Override
    void visitReturnStatement(ReturnStatement returnStatement) {
        super.visitReturnStatement(returnStatement)
        if (!returnStatement.isReturningNullOrVoid()) {
            returnStatement.expression = GeneralUtils.assignX(
                    GeneralUtils.varX(blackBoxTransformation.resultPlaceholderVarName),
                    returnStatement.expression
            )
        }
    }

}
