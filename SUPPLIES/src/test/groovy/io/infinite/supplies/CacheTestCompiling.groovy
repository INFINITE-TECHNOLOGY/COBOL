package io.infinite.supplies

import groovy.transform.CompileDynamic
import io.infinite.supplies.ast.cache.ClosureCacheMap
import org.testng.annotations.Test

class CacheTestCompiling extends TestBase {

    ClosureCacheMap closureCacheMap = new ClosureCacheMap()

    String nullString = closureCacheMap.passThrough('nullString', {
        null
    }, this)
    String string = closureCacheMap.passThrough('string', {
        'test string2'
    }, this)
    String uuid = closureCacheMap.passThrough('uuid', {
        UUID.randomUUID().toString()
    }, this)

    @Test
    @CompileDynamic
    void test() {
        def staticInitTestSource = getTestObjectFromResource("tests", "CacheTestCompiling.groovy")
        assert staticInitTestSource.nullString == null
        assert staticInitTestSource.string == "test string"
        def staticInitTestSource2 = getTestObjectFromResource("tests", "CacheTestCompiling.groovy")
        assert staticInitTestSource.uuid == staticInitTestSource2.uuid
        assert staticInitTestSource.toString() == staticInitTestSource2.toString()
        Thread thread1 = new Thread({
            def staticInitTestSourceThread = getTestObjectFromResource("tests", "CacheTestCompiling.groovy")
            assert staticInitTestSourceThread.uuid == staticInitTestSource2.uuid
        })
        thread1.start()
        thread1.join()

    }

}
