package io.infinite.supplies

import io.infinite.supplies.ast.other.ASTUtils
import org.testng.annotations.Test

@Test
class MethodArgumentsPresentTest {

    @Test
    void test() {
        def httpRequest = 1
        assert new ASTUtils().methodArgumentsPresent(['httpRequest': httpRequest ])
    }

}
