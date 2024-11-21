package io.infinite.supplies

import io.infinite.supplies.conf.ResourceLookup
import org.testng.annotations.Test

class ResourceLookupTest {

    @Test
    void test() {
        assert new ResourceLookup("supplies", "dummy/dummy.resource", true).getResourceAsString() != null
        new ResourceLookup("supplies", "dummy/dummy.resource", true).getResourceAsString() == "Z"
    }

}
