package io.infinite.blackbox


import java.util.concurrent.atomic.AtomicInteger

class BlackBoxTestCase {

    private static final AtomicInteger counter = new AtomicInteger(0)

    public static final String TEST_SCRIPT_NAME_PREFIX = "TestScript"

    protected static String genericScriptName() {
        return TEST_SCRIPT_NAME_PREFIX + (counter.getAndIncrement()) + ".groovy"
    }

    static void assertScript(final String script) throws Exception {
        GroovyShell shell = new GroovyShell()
        shell.evaluate(script, genericScriptName())
    }

}
