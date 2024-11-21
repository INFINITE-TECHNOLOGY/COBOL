package io.infinite.blackbox

import groovy.transform.CompileDynamic
import groovy.util.logging.Slf4j
import org.slf4j.Logger

@Slf4j
/**
 * - Supports usage in static context (BlackBoxRuntime var is declared as static)
 * - Thread safe
 */
class BlackBoxRuntime {


    static {
        staticInit()
    }

    @CompileDynamic
    static void staticInit() {
        Exception.metaClass.isLoggedByBlackBox = null
        Exception.metaClass.uuid = null
    }

    Logger internalLogger

    BlackBoxRuntime() {
    }

    BlackBoxRuntime(Logger internalLogger) {
        this.internalLogger = internalLogger
    }

    BlackBoxRuntime getInstance(Logger automaticLog) {
        return new BlackBoxRuntime(automaticLog)
    }

    void methodEnd(MethodMetaData methodMetaData) {
        internalLogger.debug("METHOD END", methodMetaData)
    }

    void methodBegin(MethodMetaData methodMetaData, Map<String, Object> methodArgumentMap) {
        if (methodArgumentMap != null) {
            internalLogger.debug("METHOD BEGIN", methodMetaData, methodArgumentMap)
        } else {
            internalLogger.debug("METHOD BEGIN", methodMetaData)
        }
    }

    @CompileDynamic
    void methodException(MethodMetaData methodMetaData, Map<String, Object> methodArgumentMap, Exception exception) {
        if (methodArgumentMap != null) {
            internalLogger.debug("METHOD EXCEPTION", methodMetaData, methodArgumentMap)
        } else {
            internalLogger.debug("METHOD EXCEPTION", methodMetaData)
        }
        if (exception.isLoggedByBlackBox != true) {
            exception.uuid = UUID.randomUUID().toString()
            internalLogger.error("EXCEPTION ($exception.uuid)", exception)
            exception.isLoggedByBlackBox = true
        } else {
            internalLogger.error("EXCEPTION ($exception.uuid)", "additional occurrence")
        }
    }

    void methodResult(MethodMetaData methodMetaData, Object methodResult) {
        internalLogger.debug("METHOD RESULT", methodMetaData, methodResult)
    }

}
