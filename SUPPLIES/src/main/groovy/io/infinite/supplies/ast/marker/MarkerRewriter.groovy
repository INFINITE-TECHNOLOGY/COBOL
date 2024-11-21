package io.infinite.supplies.ast.marker

import org.codehaus.groovy.ast.ClassCodeExpressionTransformer
import org.codehaus.groovy.ast.expr.ConstructorCallExpression
import org.codehaus.groovy.ast.expr.Expression
import org.codehaus.groovy.ast.tools.GeneralUtils
import org.codehaus.groovy.control.SourceUnit

class MarkerRewriter extends ClassCodeExpressionTransformer {

    private final SourceUnit sourceUnit
    private final String className

    MarkerRewriter(SourceUnit sourceUnit, String className) {
        this.sourceUnit = sourceUnit
        this.className = className
    }

    @Override
    protected SourceUnit getSourceUnit() {
        return sourceUnit
    }

    @Override
    Expression transform(Expression expression) {
        if (expression instanceof ConstructorCallExpression) {
            ConstructorCallExpression constructorCallExpression = expression
            if (constructorCallExpression.type.getName() == Marker.getCanonicalName()) {
                return enhancedMarker(constructorCallExpression)
            }
        }
        return super.transform(expression)
    }

    ConstructorCallExpression enhancedMarker(ConstructorCallExpression constructorCallExpression) {
        Expression metaDataArguments = GeneralUtils.args(
                GeneralUtils.constX(constructorCallExpression.lineNumber),
                GeneralUtils.constX(constructorCallExpression.lastLineNumber),
                GeneralUtils.constX(constructorCallExpression.columnNumber),
                GeneralUtils.constX(constructorCallExpression.lastColumnNumber),
                GeneralUtils.constX(className),
                GeneralUtils.constX(sourceUnit.name)
        )
        return new ConstructorCallExpression(constructorCallExpression.type, metaDataArguments)
    }

}
