# Infinite Technology ∞ Supplies 📦

**Misc commons/utilities/tools**

Release info:

|Attribute\Release type|Latest|Stable|
|----------------------|------|------|
|Version|2.0.0-SNAPSHOT|1.1.x|
|Branch|[master](https://github.com/INFINITE-TECHNOLOGY/SUPPLIES)|[SUPPLIES_1_1_X](https://github.com/INFINITE-TECHNOLOGY/SUPPLIES/tree/SUPPLIES_1_1_X)|
|CI Build status|[![Build Status](https://travis-ci.com/INFINITE-TECHNOLOGY/SUPPLIES.svg?branch=master)](https://travis-ci.com/INFINITE-TECHNOLOGY/SUPPLIES)|[![Build Status](https://travis-ci.com/INFINITE-TECHNOLOGY/SUPPLIES.svg?branch=SUPPLIES_1_1_X)](https://travis-ci.com/INFINITE-TECHNOLOGY/SUPPLIES)|
|Test coverage|[![codecov](https://codecov.io/gh/INFINITE-TECHNOLOGY/SUPPLIES/branch/master/graphs/badge.svg)](https://codecov.io/gh/INFINITE-TECHNOLOGY/SUPPLIES/branch/master/graphs)|[![codecov](https://codecov.io/gh/INFINITE-TECHNOLOGY/SUPPLIES/branch/SUPPLIES_1_1_X/graphs/badge.svg)](https://codecov.io/gh/INFINITE-TECHNOLOGY/SUPPLIES/branch/SUPPLIES_1_1_X/graphs)|
|Library (Maven)|[oss.jfrog.org snapshot](https://oss.jfrog.org/artifactory/webapp/#/artifacts/browse/tree/General/oss-snapshot-local/io/infinite/supplies/2.0.0-SNAPSHOT)|[ ![Download](https://api.bintray.com/packages/infinite-technology/io.i-t/supplies/images/download.svg) ](https://bintray.com/infinite-technology/io.i-t/supplies/_latestVersion)|

> ❇ Supplies are available both in `JCenter` and `Maven Central` repositories.

## Gradle

```groovy
    compile "io.i-t:supplies:1.1.11"
```

## Maven

> ❗ Note that there is no `<type>pom</type>`

```xml
        <dependency>
            <groupId>io.i-t</groupId>
            <artifactId>supplies</artifactId>
            <version>1.1.11</version>
        </dependency>
```

## `@CacheFieldInit`

Caches the initialization of annotated field.  
Cache is on class level (cache is static and shared across all instances).  
Setting cached field reference to different object does not affect other users of this cached field.  
Field should not be static. This is an eager cache. Polymorphism is not supported - cache is global per class hierarchy.  
Example usage:
```groovy
       @Cache
       File fileField = new File("./readme.txt")
```
Is transformed to:
```groovy
       static ClosureCacheMap closureCacheMap = new ClosureCacheMap()
       File fileField = closureCacheMap.passThrough('fileField', {
           new File("./readme.txt")
       }, this)
```

## Marker

> ❗ Since 1.1.0

Constructor call:  
```groovy
       new Marker()
```
Is automatically transformed (by global AST Transformation "MarkerTransformation") to:  
```groovy
       new Marker([lineNumber], [lastLineNumber], [columnNumber], [lastColumnNumber], [className], [sourceUnitName])
```
- adding compile-time AST meta-data constructor arguments.  
In practice this helps to avoid manually placing logging/debugging markers:  
```groovy
        println("1")
        println("2")
```
- you can now simply place just:
```groovy
        println(new Marker())
        println(new Marker())
```    
anywhere in your code, and it will automatically display line numbers and class names, and it will output:
```
Marker: className=tests.MarkerTest, lineNumber=16, columnNumber=9, sourceUnitName=file:/C:/Users/.../IdeaProjects/SUPPLIES/build/resources/test/tests/MarkerTest.groovy
Marker: className=tests.MarkerTestClass, lineNumber=7, columnNumber=21, sourceUnitName=file:/C:/Users/.../IdeaProjects/SUPPLIES/build/resources/test/tests/MarkerTest.groovy
```

## Try it now!

Just run in the Groovy Console (requires Groovy 2.5.4):

```groovy
@Grab('io.i-t:supplies:1.1.11')
import io.infinite.supplies.ast.marker.Marker
import io.infinite.supplies.ast.cache.CacheFieldInit
import java.util.UUID

class TryMe {

    @CacheFieldInit
    final String cachedField = UUID.randomUUID().toString()
    
    void tryMe() {
        println(toString() + ":" + cachedField + ":" + new Marker())
    }

}

new TryMe().tryMe()
new TryMe().tryMe()
```

Output:

```
TryMe@a294eb:ba2a0eb9-1210-467e-9c03-1199e69f4e30:Marker: className=TryMe, lineNumber=12, columnNumber=56, sourceUnitName=ConsoleScript5
TryMe@554d0f4:ba2a0eb9-1210-467e-9c03-1199e69f4e30:Marker: className=TryMe, lineNumber=12, columnNumber=56, sourceUnitName=ConsoleScript5
```
