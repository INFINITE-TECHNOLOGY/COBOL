package io.infinite.supplies.ast.cache

import io.infinite.supplies.ast.other.ASTUtils

import java.util.concurrent.ConcurrentHashMap

class ClosureCacheMap extends ConcurrentHashMap {

    ASTUtils astUtils = new ASTUtils()

    Object passThrough(String key, Closure closure, Object owner) {
        if (!containsKey(key)) {
            astUtils.ensureClosureEquivalency(closure, owner)
            Object result = closure.call()

            if (result != null) {
                put(key, result)
            }

            return result
        } else {
            return get(key)
        }
    }

}
