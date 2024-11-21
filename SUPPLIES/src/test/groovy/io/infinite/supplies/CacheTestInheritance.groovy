package io.infinite.supplies

import org.testng.annotations.Test

class CacheTestInheritance extends TestBase {

    @Test
    void test() {
        runScriptFromResource("tests", "CacheTestInheritance.groovy")
    }

}
