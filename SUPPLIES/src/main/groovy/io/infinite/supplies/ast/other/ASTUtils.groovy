package io.infinite.supplies.ast.other

import groovy.inspect.swingui.AstNodeToScriptVisitor
import io.infinite.supplies.ast.exceptions.SuppliesCompileException
import io.infinite.supplies.ast.metadata.MetaDataExpression
import io.infinite.supplies.ast.metadata.MetaDataMethodNode
import io.infinite.supplies.ast.metadata.MetaDataStatement
import org.codehaus.groovy.ast.ASTNode
import org.codehaus.groovy.ast.AnnotationNode
import org.codehaus.groovy.ast.MethodNode
import org.codehaus.groovy.ast.expr.ConstantExpression
import org.codehaus.groovy.ast.expr.Expression
import org.codehaus.groovy.ast.expr.PropertyExpression
import org.codehaus.groovy.ast.stmt.Statement
import org.codehaus.groovy.control.SourceUnit

import java.lang.reflect.Field

class ASTUtils {

    String codeString(ASTNode iAstNode) {
        StringWriter stringWriter = new StringWriter()
        iAstNode.visit(new AstNodeToScriptVisitor(stringWriter))
        return stringWriter.getBuffer().toString()
    }

    void ensureClosureEquivalency(Closure closure, Object owner) {
        Field thisObjectField = Closure.getDeclaredField('thisObject')
        Field ownerField = Closure.getDeclaredField('owner')
        thisObjectField.setAccessible(true)
        ownerField.setAccessible(true)
        thisObjectField.set(closure, owner)
        ownerField.set(closure, owner)
        closure.setDelegate(owner)
        closure.setResolveStrategy(Closure.DELEGATE_ONLY)
        ownerField.setAccessible(false)
        thisObjectField.setAccessible(false)
    }

    String prepareExceptionMessage(ASTNode astNode) {
        String message
        switch (astNode) {
            case MethodNode:
                message = new MetaDataMethodNode(astNode as MethodNode).toString()
                break
            case Statement:
                message = new MetaDataStatement(astNode as Statement).toString()
                break
            case Expression:
                message = new MetaDataExpression(astNode as Expression).toString()
                break
            default:
                message = astNode.toString()
        }
        return message
    }

    Object getAnnotationParameter(AnnotationNode annotationNode, String annotationName, Object defaultValue) {
        Expression memberExpression = annotationNode.getMember(annotationName)
        if (memberExpression instanceof PropertyExpression) {
            ConstantExpression constantExpression = memberExpression.getProperty() as ConstantExpression
            return constantExpression.getValue()
        } else if (memberExpression instanceof ConstantExpression) {
            return memberExpression.getValue()
        } else if (memberExpression == null) {
            return defaultValue
        } else {
            throw new SuppliesCompileException(annotationNode, "Unsupported annotation \"$annotationName\" type: " + memberExpression.getClass().getCanonicalName() + " for annotation: " + annotationName)
        }
    }

    Boolean methodArgumentsPresent(Object iArgs) {
        if (iArgs != null) {
            if (iArgs instanceof Collection) {
                return iArgs.size() > 0
            } else if (iArgs instanceof Object[]) {
                return ((Object[]) iArgs).length > 0
            } else if (iArgs instanceof Map) {
                return ((Map) iArgs).size() > 0
            } else {
                return false
            }
        } else {
            return false
        }
    }

    /**
     * Taken from: com.virtualdogbert.ast.EnterpriseGroovyASTTransformation
     */
    Boolean isSkipGlobalTransformation(SourceUnit sourceUnit) {
        return (sourceUnit.name == 'embedded_script_in_groovy_Ant_task' ||
                sourceUnit.name.startsWith('Script') ||
                sourceUnit.name.startsWith('script') ||
                sourceUnit.name.startsWith('GStringTemplateScript')
        )
    }

}
