package io.infinite.supplies.conf

class ResourceLookup extends ResourceLookupWorkingDir {

    ResourceLookup(String moduleName, String resourceName, Boolean proceedSearch) {
        super(moduleName, resourceName, proceedSearch)
    }

    ResourceLookup(String moduleName, String resourceName) {
        super(moduleName, resourceName)
    }

    @Override
    String getResourceAsString() {
        report("Application working dir: " + new File("./").getCanonicalPath())
        return super.getResourceAsString()
    }

}
