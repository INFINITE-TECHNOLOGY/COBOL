package io.infinite.supplies

import org.testng.annotations.Test

class MarkerTest extends TestBase {

    @Test
    void test() {
        runScriptFromResource("tests", "MarkerTest.groovy")
    }

}
