package io.infinite.supplies.ast.exceptions


import org.codehaus.groovy.runtime.StackTraceUtils

class ExceptionUtils {

    String stacktrace(Throwable throwable) {
        if (throwable != null) {
            StringWriter stringWriter = new StringWriter()
            throwable.printStackTrace(new PrintWriter(stringWriter))
            return stringWriter.toString()
        } else {
            return ""
        }
    }

    String sanitizedStacktrace(Throwable throwable) {
        if (throwable != null) {
            if (throwable.cause != null) {
                new StackTraceUtils().sanitizeRootCause(throwable)
            }
            return stacktrace(new StackTraceUtils().sanitize(throwable))
        } else {
            return ""
        }
    }

}
