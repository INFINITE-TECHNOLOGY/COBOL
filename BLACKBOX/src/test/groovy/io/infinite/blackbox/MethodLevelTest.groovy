package io.infinite.blackbox


class MethodLevelTest extends BlackBoxTestCase {


    static void main(String[] args) {
        assertScript("""import io.infinite.blackbox.BlackBox
import io.infinite.blackbox.BlackBoxLevel

@BlackBox(level = BlackBoxLevel.METHOD)
abstract class Foo extends Thread {

    Foo() {
       
    }

    @BlackBox(level = BlackBoxLevel.METHOD)
    String foo() {
        println "foo"
        "foo"
    }

}

class Bar extends Foo {
    
    @BlackBox(level = BlackBoxLevel.METHOD)
    Bar() {
        super()
    }

    @BlackBox
    String bar(String iBar) {
        String result = foo() + "bar"
        println result
        throw new Exception("z")
        return result
    }

}

new Bar().bar("q")
""")
    }


}