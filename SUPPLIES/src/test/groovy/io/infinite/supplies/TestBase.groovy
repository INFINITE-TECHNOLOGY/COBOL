package io.infinite.supplies

import groovy.transform.Memoized

class TestBase {

    GroovyClassLoader groovyClassLoader = new GroovyClassLoader()

    @Memoized
    def getTestObjectFromResource(String sectionName, String testScriptName) {
        def testInstance = groovyClassLoader.parseClass(getTestFile(sectionName, testScriptName)).newInstance()
        return testInstance
    }

    File getTestFile(String sectionName, String testScriptName) {
        ClassLoader classLoader = getClass().getClassLoader()
        File file = new File(classLoader.getResource(sectionName + "/" + testScriptName).getFile())
        return file
    }

    def runScriptFromResource(String sectionName, String testScriptName) {
        File testScriptFile = getTestFile(sectionName, testScriptName)
        GroovyScriptEngine groovyScriptEngine = new GroovyScriptEngine(testScriptFile.getParentFile().getCanonicalPath())
        return groovyScriptEngine.run(testScriptName, new Binding())
    }

}
