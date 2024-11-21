package io.infinite.supplies.ast.cache

import groovy.transform.CompileDynamic
import io.infinite.supplies.ast.exceptions.SuppliesCompileException
import jdk.internal.org.objectweb.asm.Opcodes
import org.codehaus.groovy.ast.*
import org.codehaus.groovy.ast.expr.ConstantExpression
import org.codehaus.groovy.ast.stmt.ExpressionStatement
import org.codehaus.groovy.ast.tools.GeneralUtils
import org.codehaus.groovy.classgen.VariableScopeVisitor
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.transform.AbstractASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformation

@CompileDynamic
@GroovyASTTransformation(
        phase = CompilePhase.SEMANTIC_ANALYSIS
)
class CacheTransformation extends AbstractASTTransformation {

    AnnotationNode annotationNode

    static {
        ClassNode.getMetaClass().staticMapDeclared = null
        ClassNode.getMetaClass().staticMapName = null
    }

    void visit(ASTNode[] iAstNodeArray, SourceUnit iSourceUnit) {
        try {
            init(iAstNodeArray, iSourceUnit)
            setAnnotationNode(iAstNodeArray[0] as AnnotationNode)
            if (iAstNodeArray[1] instanceof FieldNode) {
                transformFieldNode(iAstNodeArray[1] as FieldNode)
            } else {
                throw new SuppliesCompileException(iAstNodeArray[1], "Unsupported Annotated Node; Only FieldNode is supported.")
            }
        } catch (Exception exception) {
            throw new SuppliesCompileException(iAstNodeArray[1], exception)
        }
    }

    void transformFieldNode(FieldNode fieldNode) {
        if (fieldNode.isStatic()) {
            throw new SuppliesCompileException(fieldNode, "Field must not be static.")
        }
        declareStaticMapIfNeeded(fieldNode)
        setInitialValueExpression(fieldNode)
        sourceUnit.AST.classes.each {
            new VariableScopeVisitor(sourceUnit, true).visitClass(it)
        }
        //println(new ASTUtils().codeString(fieldNode.getInitialValueExpression()))
    }

    void setInitialValueExpression(FieldNode fieldNode) {
        fieldNode.setInitialValueExpression(
                GeneralUtils.callX(
                        GeneralUtils.varX(getDeclaredMapVarName(fieldNode)),
                        "passThrough",
                        GeneralUtils.args(
                                GeneralUtils.constX(fieldNode.getName()),
                                GeneralUtils.closureX(
                                        new ExpressionStatement(
                                                fieldNode.getInitialValueExpression() ?: new ConstantExpression(null)
                                        )
                                ),
                                GeneralUtils.varX("this")
                        )
                )
        )
    }

    void declareStaticMapIfNeeded(FieldNode fieldNode) {
        if (!fieldNode.getDeclaringClass().staticMapDeclared) {
            String mapVarName = prepareMapVarName()
            fieldNode.getDeclaringClass().addField(mapVarName,
                    Opcodes.ACC_FINAL | Opcodes.ACC_TRANSIENT | Opcodes.ACC_STATIC | Opcodes.ACC_PRIVATE,
                    ClassHelper.make(getMapImplementation()),
                    GeneralUtils.ctorX(ClassHelper.make(getMapImplementation()))
            )
            fieldNode.getDeclaringClass().staticMapDeclared = true
            fieldNode.getDeclaringClass().staticMapName = mapVarName
        }
    }

    Class getMapImplementation() {
        return ClosureCacheMap.class
    }

    String prepareMapVarName() {
        return "closureCacheMap"
    }

    String getDeclaredMapVarName(FieldNode fieldNode) {
        return fieldNode.getDeclaringClass().staticMapName
    }

}
