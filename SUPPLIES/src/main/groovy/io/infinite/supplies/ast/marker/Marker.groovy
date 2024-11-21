package io.infinite.supplies.ast.marker


import io.infinite.supplies.ast.metadata.MetaDataASTNode
import org.codehaus.groovy.ast.MethodNode

/**
 * Constructor call:
 * <pre><code>
 *     new Marker()
 * </code></pre>
 * Is automatically transformed (by global AST Transformation "MarkerTransformation") to:<br>
 * <pre><code>
 *     new Marker([lineNumber], [lastLineNumber], [columnNumber], [lastColumnNumber], [className], [sourceUnitName])
 * </code></pre>
 * - adding compile-time AST meta-data constructor arguments.
 *
 * In practice this helps to avoid manually placing logging/debugging markers:
 *
 *  <pre><code>
 *      println("1")
 *      println("2")
 *  </code></pre>
 *
 * you can now simply place just
 *  <pre><code>
 *      println(new Marker())
 *      println(new Marker())
 *  </code></pre>
 * anywhere in your code, and it will automatically display line numbers and class names.
 */
class Marker extends MetaDataASTNode {

    String sourceUnitName

    /**
     * This constructor should NOT be used by the users.
     * This is used in automatically generated code only.
     */
    Marker(
            Integer lineNumber,
            Integer lastLineNumber,
            Integer columnNumber,
            Integer lastColumnNumber,
            String className,
            String sourceUnitName
    ) {
        initUsingMetaDataFields(
                lineNumber,
                lastLineNumber,
                columnNumber,
                lastColumnNumber
        )
        this.className = className
        this.sourceUnitName = sourceUnitName
    }

    /**
     * This constructor should be used by the users.
     * It will be automatically enriched with arguments during compilation stage.
     */
    Marker() {

    }

    String toString() {
        return "Marker: className=$className, lineNumber=$lineNumber, columnNumber=$columnNumber, sourceUnitName=$sourceUnitName"
    }

}
