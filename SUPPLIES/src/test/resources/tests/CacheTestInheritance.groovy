package tests

import groovy.transform.ToString
import io.infinite.supplies.ast.cache.CacheFieldInit

class Foo {
    String foo

    Foo(String foo) {
        this.foo = foo
    }


    @Override
    String toString() {
        return foo
    }
}

@ToString(includeFields = true, includeNames = true)
class SuperClass {

    @CacheFieldInit
    final Foo inheritedField = new Foo("Super Class String")

}

@ToString(includeFields = true, includeNames = true)
class SubClass extends SuperClass {

    @CacheFieldInit
    final Foo inheritedField = new Foo("Sub Class String")

}

SuperClass superClass = new SuperClass()
assert superClass.inheritedField.toString() == "Super Class String"
SubClass subClass = new SubClass()
assert subClass.inheritedField.toString() != "Sub Class String"//no static polymorphism
assert subClass.inheritedField.toString() == "Super Class String"
superClass.inheritedField.foo = "super changed"
assert superClass.inheritedField.foo == "super changed"
assert subClass.inheritedField.foo == "super changed"
subClass.inheritedField.foo = "sub changed"
assert subClass.inheritedField.foo == "sub changed"
assert superClass.inheritedField.foo == "sub changed"