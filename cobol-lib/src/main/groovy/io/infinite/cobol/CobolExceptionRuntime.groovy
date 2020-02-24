package io.infinite.cobol

class CobolExceptionRuntime extends Exception {

    CobolExceptionRuntime() {
    }

    CobolExceptionRuntime(String var1) {
        super(var1)
    }

    CobolExceptionRuntime(String var1, Throwable var2) {
        super(var1, var2)
    }

    CobolExceptionRuntime(Throwable var1) {
        super(var1)
    }

    CobolExceptionRuntime(String var1, Throwable var2, boolean var3, boolean var4) {
        super(var1, var2, var3, var4)
    }
}
