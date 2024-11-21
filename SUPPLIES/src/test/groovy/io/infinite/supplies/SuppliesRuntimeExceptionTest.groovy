package io.infinite.supplies

import io.infinite.supplies.ast.exceptions.ExceptionUtils
import io.infinite.supplies.ast.exceptions.SuppliesRuntimeException
import org.testng.annotations.Test

class SuppliesRuntimeExceptionTest {

    @Test
    void runTest() {
        try {
            throw new SuppliesRuntimeException("Test exception")
        } catch (SuppliesRuntimeException r) {
            println(new ExceptionUtils().stacktrace(r))
        }
    }

}
