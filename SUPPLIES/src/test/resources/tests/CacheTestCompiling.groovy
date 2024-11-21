package tests

import groovy.transform.ToString
import io.infinite.supplies.ast.cache.CacheFieldInit

@ToString(includeFields = true, includeNames = true)
class CacheTestBasic {

    @CacheFieldInit
    final String nullString

    @CacheFieldInit
    final String string = "test string"

    @CacheFieldInit
    final String uuid = UUID.randomUUID().toString()

}
