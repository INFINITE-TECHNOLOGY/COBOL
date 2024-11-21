package io.infinite.supplies.ast.marker

import groovy.transform.CompileStatic
import io.infinite.supplies.ast.other.ASTUtils
import org.codehaus.groovy.ast.ASTNode
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.transform.AbstractASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformation

@CompileStatic
@GroovyASTTransformation(phase = CompilePhase.SEMANTIC_ANALYSIS)
class MarkerTransformation extends AbstractASTTransformation {

    ASTUtils astUtils = new ASTUtils()

    @Override
    void visit(ASTNode[] astNodes, SourceUnit sourceUnit) {
        if (astUtils.isSkipGlobalTransformation(sourceUnit)) {
            return
        }
        this.sourceUnit = sourceUnit
        sourceUnit.getAST().getClasses().each {
            new MarkerRewriter(sourceUnit, it.name).visitClass(it)
        }
    }
}
