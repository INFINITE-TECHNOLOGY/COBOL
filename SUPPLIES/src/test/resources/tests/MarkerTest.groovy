package tests

import io.infinite.supplies.ast.marker.Marker

class MarkerTestClass {

    Marker marker = new Marker()

    void foo(Marker marker) {
        println(marker)
        println(new Marker())
    }

}

println(new Marker())
println new MarkerTestClass().marker
new MarkerTestClass().foo(new Marker())