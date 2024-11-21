package io.infinite.blackbox

import groovy.inspect.swingui.AstNodeToScriptVisitor
import groovy.transform.ToString
import groovy.util.logging.Slf4j
import jdk.internal.org.objectweb.asm.Opcodes
import org.codehaus.groovy.ast.*
import org.codehaus.groovy.ast.expr.*
import org.codehaus.groovy.ast.stmt.*
import org.codehaus.groovy.ast.tools.GeneralUtils
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.transform.AbstractASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformation
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.slf4j.MDC

@ToString(includeNames = true, includeFields = true, includePackage = false)
@GroovyASTTransformation(
        phase = CompilePhase.SEMANTIC_ANALYSIS
)
@Slf4j
class BlackBoxTransformation extends AbstractASTTransformation {

    private static Integer uniqueClosureParamCounter = 0

    boolean suppressExceptions

    AnnotationNode annotationNode

    BlackBoxLevel blackBoxLevel

    MethodNode methodNode

    // MAIN ENTRY POINT \/\/\/\/\/\/\/\/
    void visit(ASTNode[] iAstNodeArray, SourceUnit iSourceUnit) {
        try {
            init(iAstNodeArray, iSourceUnit)
            if (iAstNodeArray[1] instanceof MethodNode) {
                AnnotationNode methodAnnotationNode = iAstNodeArray[0] as AnnotationNode
                visitMethod(iAstNodeArray[1] as MethodNode, methodAnnotationNode)
            } else if (iAstNodeArray[1] instanceof ClassNode) {
                AnnotationNode classAnnotationNode = iAstNodeArray[0] as AnnotationNode
                visitClassNode(iAstNodeArray[1] as ClassNode, classAnnotationNode)
            } else {
                throw new BlackBoxTransformationException(iAstNodeArray[1], "Unsupported Annotated Node; Only [Class, Method, Constructor] are supported.")
            }
        } catch (Exception exception) {
            log.error(exception.message, exception)
            throw new BlackBoxTransformationException(iAstNodeArray[1], exception)
        }
    }
    // MAIN ENTRY POINT /\/\/\/\/\/\/\/\

    void visitClassNode(ClassNode classNode, AnnotationNode classAnnotationNode) {
        classNode.methods.each {
            if (!it.annotations.collect { it.classNode }.contains(classAnnotationNode.classNode)) {
                visitMethod(it, it.getAnnotations(classAnnotationNode.getClassNode())[0] ?: classAnnotationNode)
            }
        }
        classNode.declaredConstructors.each {
            if (!it.annotations.collect { it.classNode }.contains(classAnnotationNode.classNode)) {
                visitMethod(it, it.getAnnotations(classAnnotationNode.getClassNode())[0] ?: classAnnotationNode)
            }
        }
    }

    void visitMethod(MethodNode methodNode, AnnotationNode methodAnnotationNode) {
        if (methodNode.isAbstract() || excludeMethodNode(methodNode)) {
            return
        }
        uniqueClosureParamCounter = 0
        this.annotationNode = methodAnnotationNode
        this.methodNode = methodNode
        try {
            if (methodNode.declaringClass.outerClass != null) {
                throw new BlackBoxTransformationException(methodNode, "BlackBox currently does not support annotations in Inner Classes.")
            }
            if (codeString(methodNode.code).contains(runtimeVarName)) {
                throw new BlackBoxTransformationException(methodNode, "$runtimeVarName is already declared.")
            }
            classDeclarations(methodNode.declaringClass)
            String methodName = methodNode.name
            String className = methodNode.declaringClass.nameWithoutPackage
            MDC.put("unitName", "CARBURETOR_$className.${methodName.replace("<", "").replace(">", "")}")
            blackBoxLevel = getAnnotationParameter("level", BlackBoxLevel.ERROR, methodAnnotationNode) as BlackBoxLevel
            getAnnotationParameters()
            transformMethod(methodNode)
            /*sourceUnit.AST.classes.each {
                new VariableScopeVisitor(sourceUnit, true).visitClass(it)
            }*/
            log.debug(codeString(methodNode.code))
        } catch (Exception exception) {
            log.error(exception.message, exception)
            throw new BlackBoxTransformationException(methodNode, exception)
        }
    }

    Boolean excludeMethodNode(MethodNode methodNode) {
        return (methodNode.name == "toString")
    }

    Class getEngineFactoryClass() {
        return BlackBoxRuntime.class
    }


    Expression getEngineInitArgs() {
        GeneralUtils.args(GeneralUtils.fieldX(methodNode.declaringClass, loggerVarName))
    }

    void getAnnotationParameters() {
        suppressExceptions = getAnnotationParameter("suppressExceptions", false, annotationNode)
    }

    String getLoggerVarName() {
        return "automaticLog"
    }

    String getRuntimeVarName() {
        return "blackBoxRuntime"
    }

    Statement createThrowStatement() {
        if (!suppressExceptions) {
            ThrowStatement throwStatement = GeneralUtils.throwS(GeneralUtils.varX("automaticException"))
            throwStatement.sourcePosition = annotationNode
            return throwStatement
        } else {
            return new EmptyStatement()
        }
    }

    void classDeclarations(ClassNode classNode) {
        //ACC_PUBLIC to workaround MissingPropertyException SpringBootApp$$EnhancerBySpringCGLIB$$<..>
        if (classNode.getDeclaredField(loggerVarName) == null) {
            classNode.addField(loggerVarName,
                    Opcodes.ACC_FINAL | Opcodes.ACC_TRANSIENT | Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC,
                    ClassHelper.make(Logger.class),
                    GeneralUtils.callX(
                            new ClassExpression(ClassHelper.make(LoggerFactory.class)),
                            loggerFactoryMethodName,
                            GeneralUtils.constX(classNode.name)
                    ))
        }
        if (classNode.getDeclaredField(runtimeVarName) == null) {
            classNode.addField(runtimeVarName,
                    Opcodes.ACC_FINAL | Opcodes.ACC_TRANSIENT | Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC,
                    ClassHelper.make(BlackBoxRuntime.class),
                    GeneralUtils.callX(
                            GeneralUtils.ctorX(ClassHelper.make(getEngineFactoryClass())),
                            getEngineFactoryMethodName(),
                            getEngineInitArgs()
                    )
            )
        }
    }

    Object getAnnotationParameter(String annotationName, Object defaultValue, AnnotationNode annotationNode) {
        Object result
        Expression memberExpression = annotationNode.getMember(annotationName)
        log.debug(annotationNode.classNode.name + ":" + annotationNode.lineNumber)
        if (memberExpression instanceof PropertyExpression) {
            log.debug("PropertyExpression")
            ConstantExpression constantExpression = memberExpression.getProperty() as ConstantExpression
            result = constantExpression.value
        } else if (memberExpression instanceof ConstantExpression) {
            log.debug("ConstantExpression")
            result = memberExpression.getValue()
        } else if (memberExpression == null) {
            log.debug("defaultValue")
            result = defaultValue
        } else {
            throw new BlackBoxTransformationException(memberExpression, "Unsupported annotation \"$annotationName\" member expression class: " + memberExpression.class.canonicalName + " for method " + MDC.get("unitName"))
        }
        log.debug(annotationName + "=" + result)
        return result
    }

    Statement checkSuperConstructorCall(MethodNode iMethodNode) {
        Statement firstStatement = new EmptyStatement()
        if (iMethodNode instanceof ConstructorNode) {
            def initialFirstStatement = ((BlockStatement) iMethodNode.code).statements[0]
            if (initialFirstStatement instanceof ExpressionStatement) {
                if (initialFirstStatement.getExpression() instanceof ConstructorCallExpression) {
                    if (((ConstructorCallExpression) initialFirstStatement.getExpression()).isSuperCall()) {
                        firstStatement = initialFirstStatement
                        ((BlockStatement) iMethodNode.code).statements.remove(initialFirstStatement)
                    }
                }
            }
        }
        return firstStatement
    }

    void transformMethod(MethodNode methodNode) {
        if (blackBoxLevel.value() == BlackBoxLevel.NONE.value()) {
            return
        }
        Statement firstStatement = checkSuperConstructorCall(methodNode)
        Statement methodExecutionOpen = createMethodLogStatement(methodBeginName, methodNode, methodNode.parameters, Optional.empty())
        Statement methodException = createMethodLogStatement(methodExceptionName, methodNode, methodNode.parameters, Optional.of(GeneralUtils.varX("automaticException")))
        if (blackBoxLevel.value() == BlackBoxLevel.METHOD.value()) {
            methodLevelTransformation(methodNode, firstStatement, methodExecutionOpen, methodException)
        } else if (blackBoxLevel.value() == BlackBoxLevel.ERROR.value()) {
            errorLevelTransformation(methodNode, firstStatement, methodException)
        } else {
            throw new BlackBoxTransformationException(methodNode, "Unsupported BlackBox Level: " + blackBoxLevel.toString())
        }
    }

    ExpressionStatement createMethodLogStatement(
            String blackBoxMethodName,
            MethodNode methodNode,
            Parameter[] methodParameters,
            Optional<VariableExpression> optionalVariableExpression
    ) {
        ArgumentListExpression args = GeneralUtils.args(methodMetaData(methodNode))
        if (methodParameters.size() > 0) {
            args.addExpression(
                    new MapExpression(
                            methodParameters.collect { parameter ->
                                new MapEntryExpression(GeneralUtils.constX(parameter.name), GeneralUtils.varX(parameter.name))
                            }
                    )
            )
        } else {
            args.addExpression(new ConstantExpression(null))
        }
        if (optionalVariableExpression.present) {
            args.addExpression(optionalVariableExpression.get())
        }
        return new ExpressionStatement(
                GeneralUtils.callX(
                        GeneralUtils.varX(runtimeVarName),
                        blackBoxMethodName,
                        args
                )
        )
    }

    ConstructorCallExpression methodMetaData(MethodNode methodNode) {
        return GeneralUtils.ctorX(
                ClassHelper.make(MethodMetaData.class),
                GeneralUtils.args(
                        GeneralUtils.constX(methodNode.declaringClass.name),
                        GeneralUtils.constX(methodNode.name),
                        GeneralUtils.constX(methodNode.lineNumber),
                        GeneralUtils.constX(methodNode.lastLineNumber),
                        GeneralUtils.constX(methodNode.columnNumber),
                        GeneralUtils.constX(methodNode.lastColumnNumber)
                )
        )
    }

    void methodLevelTransformation(MethodNode methodNode, Statement firstStatement, ExpressionStatement methodExecutionOpen, Statement methodExecutionOpenException) {
        methodNode.code.visit(new BlackBoxVisitor(this))//<<<<<<<<<<<<<<VISIT<<<<<
        methodNode.code = GeneralUtils.block(
                firstStatement,
                GeneralUtils.declS(
                        GeneralUtils.localVarX(resultPlaceholderVarName),
                        new EmptyExpression()
                ),
                methodExecutionOpen,
                {
                    TryCatchStatement tryCatchStatement = new TryCatchStatement(
                            methodNode.code,
                            {
                                Statement finallyStatement = GeneralUtils.block()
                                if (!methodNode.isVoidMethod()) {
                                    finallyStatement.addStatement(
                                            new ExpressionStatement(
                                                    GeneralUtils.callX(
                                                            GeneralUtils.varX(runtimeVarName),
                                                            methodResultName,
                                                            GeneralUtils.args(
                                                                    methodMetaData(methodNode),
                                                                    GeneralUtils.varX(resultPlaceholderVarName)
                                                            )
                                                    )
                                            )
                                    )
                                }
                                finallyStatement.addStatement(
                                        GeneralUtils.block(
                                                new ExpressionStatement(
                                                        GeneralUtils.callX(
                                                                GeneralUtils.varX(runtimeVarName),
                                                                methodEndName,
                                                                GeneralUtils.args(methodMetaData(methodNode))
                                                        )
                                                )
                                        )
                                )
                                return finallyStatement
                            }.call() as Statement
                    )
                    tryCatchStatement.addCatch(
                            GeneralUtils.catchS(
                                    GeneralUtils.param(ClassHelper.make(Exception.class), exceptionVarName),
                                    GeneralUtils.block(
                                            methodExecutionOpenException,
                                            createThrowStatement()
                                    )
                            )
                    )
                    return tryCatchStatement
                }.call() as TryCatchStatement
        )
    }

    void errorLevelTransformation(MethodNode iMethodNode, Statement firstStatement, Statement methodException) {
        iMethodNode.code = GeneralUtils.block(
                firstStatement,
                {
                    TryCatchStatement tryCatchStatement = new TryCatchStatement(iMethodNode.code, EmptyStatement.INSTANCE)
                    tryCatchStatement.addCatch(
                            GeneralUtils.catchS(
                                    GeneralUtils.param(ClassHelper.make(Exception.class), exceptionVarName),
                                    GeneralUtils.block(
                                            methodException,
                                            createThrowStatement()
                                    )
                            )
                    )
                    return tryCatchStatement
                }.call() as TryCatchStatement
        )
    }


    String getMethodBeginName() {
        "methodBegin"
    }

    String getMethodEndName() {
        "methodEnd"
    }

    String getMethodExceptionName() {
        "methodException"
    }

    String getMethodResultName() {
        "methodResult"
    }

    String getEngineFactoryMethodName() {
        "getInstance"
    }

    String getLoggerFactoryMethodName() {
        "getLogger"
    }

    String getResultPlaceholderVarName() {
        "resultPlaceHolder"
    }

    String getExceptionVarName() {
        "automaticException"
    }

    String codeString(ASTNode iAstNode) {
        StringWriter stringWriter = new StringWriter()
        iAstNode.visit(new AstNodeToScriptVisitor(stringWriter))
        return stringWriter.getBuffer().toString()
    }

}
