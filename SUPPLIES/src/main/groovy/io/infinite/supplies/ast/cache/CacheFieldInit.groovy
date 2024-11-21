package io.infinite.supplies.ast.cache

import org.codehaus.groovy.transform.GroovyASTTransformationClass

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

/**
 * Caches the initialization of annotated field.<br>
 * Cache is on class level (cache is static and shared across all instances).<br>
 * Setting cached field reference to different object does not affect other users of this cached field. <br>
 * Field should not be static.<br>
 * This is an eager cache.<br>
 * Polymorphism is not supported - cache is global per class hierarchy.<br>
 *
 * Example usage:<br>
 * <pre><code>
 *     &#64;Cache
 *     File fileField = new File("./readme.txt")
 * </code></pre>
 * Is transformed to:<br>
 * <pre><code>
 *     static ClosureCacheMap closureCacheMap = new ClosureCacheMap()
 *     File fileField = closureCacheMap.passThrough('fileField', {
 *         new File("./readme.txt")
 *     }, this)
 * </code></pre>
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@GroovyASTTransformationClass("io.infinite.supplies.ast.cache.CacheTransformation")
@interface CacheFieldInit {

}