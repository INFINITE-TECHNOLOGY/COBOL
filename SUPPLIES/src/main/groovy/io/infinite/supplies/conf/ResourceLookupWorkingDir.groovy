package io.infinite.supplies.conf

class ResourceLookupWorkingDir extends ResourceLookupThread {

    ResourceLookupWorkingDir(String moduleName, String resourceName, Boolean proceedSearch) {
        super(moduleName, resourceName, proceedSearch)
    }

    ResourceLookupWorkingDir(String moduleName, String resourceName) {
        super(moduleName, resourceName)
    }

    String getResourceAsString() {
        report("Searching for ${resourceName} in: " + confPath + " (full path: ${new File(confPath).getCanonicalPath()})")
        File file = new File(confPath)
        if (file.exists()) {
            report("Found: " + file.getCanonicalPath())
            return file.getText()
        } else {
            report("Not found.")
            if (proceedSearch) {
                super.getResourceAsString()
            } else {
                return null
            }
        }
    }

    String getWorkingDir() {
        return "./"
    }

    String getConfPath() {
        return getWorkingDir() + getResourceName()
    }

}
