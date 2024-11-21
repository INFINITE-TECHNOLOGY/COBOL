package io.infinite.supplies.conf

import java.security.AccessController
import java.security.PrivilegedAction

class ResourceLookupThread extends ResourceLookupSystem {

    ResourceLookupThread(String moduleName, String resourceName, Boolean proceedSearch) {
        super(moduleName, resourceName, proceedSearch)
    }

    ResourceLookupThread(String moduleName, String resourceName) {
        super(moduleName, resourceName)
    }

    String getResourceAsString() {
        report("Searching for ${getResourceName()} in application resource files using Thread classloader.")
        URL url = AccessController.doPrivileged(new PrivilegedAction<URL>() {
            URL run() {
                return getClassLoader().getResource(resourceName)
            }
        })
        if (url != null) {
            report("Found: " + url.toExternalForm())
            return new Scanner(getClassLoader().getResourceAsStream(resourceName)).useDelimiter("\\A").next()
        }
        report("Not found.")
        if (proceedSearch) {
            return super.getResourceAsString()
        } else {
            return null
        }
    }

    ClassLoader getClassLoader() {
        return Thread.currentThread().getContextClassLoader()
    }

}
