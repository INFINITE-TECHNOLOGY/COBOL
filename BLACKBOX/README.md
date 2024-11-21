

## Introduction
`BlackBox` is a `Groovy` AST transformation that adds logging code into annotated methods.

## In short
`@BlackBox` Annotation adds logging code into annotated Groovy methods/constructors.

Detalization is controlled using `level` annotation parameter:

- `BlackBoxLevel.METHOD` - to log each method call with its arguments
- `BlackBoxLevel.ERROR` - only to log unhandled method exceptions (including associated method arguments as well).

## Gradle

> ❗ Via **JCenter** repository

```groovy
compile "io.i-t:blackbox:2.2.0"
```

## Example

The following method annotated with `@BlackBox`:

```groovy
@BlackBox(level = BlackBoxLevel.METHOD)
String foobar(String foo) {
    String bar = "bar"
    String foobar = foo + bar
    return foobar
}
```

Is transformed into:

```groovy
    @io.infinite.blackbox.BlackBox(level = io.infinite.blackbox.BlackBoxLevel.METHOD)
    public java.lang.String foobar(java.lang.String foo) {
        java.lang.Object resultPlaceHolder 
        blackBoxRuntime.methodBegin(new io.infinite.blackbox.MethodMetaData('Foobar', 'foobar', 8, 13, 1, 2), ['foo': foo ])
        try {
            java.lang.String bar = 'bar'
            java.lang.String foobar = foo + bar 
            return resultPlaceHolder = foobar 
        } 
        catch (java.lang.Exception automaticException) {
            blackBoxRuntime.methodException(new io.infinite.blackbox.MethodMetaData('Foobar', 'foobar', 8, 13, 1, 2), ['foo': foo ], automaticException)
            throw automaticException 
        } 
        finally { 
            blackBoxRuntime.methodResult(new io.infinite.blackbox.MethodMetaData('Foobar', 'foobar', 8, 13, 1, 2), resultPlaceHolder)
            blackBoxRuntime.methodEnd(new io.infinite.blackbox.MethodMetaData('Foobar', 'foobar', 8, 13, 1, 2))
        } 
    }
```
