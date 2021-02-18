package com.hubiao.kotlindemo.methods.generic

import java.io.IOException

class GenericFunctionTestMain<T> {

    fun <T> function1(tag: String, vararg vars: T) {
        println("function1() $tag:")
        for (i in vars.indices) {
            println("args[$i] = ${vars[i].toString()}")
        }
    }

    fun function2(arg1:String) {
        fun functionLocal(localArg1:String) {
            println("GenericFunctionTestMain.function2().functionLocal() arg1 is $arg1, localArg is $localArg1")
        }

        println("GenericFunctionTestMain.function2()")

        // 使用局部函数时，必须在前面声明局部函数，才能使用
        functionLocal("Java")
    }

    fun function3(arg1:Int, arg2:Int) {
        val resultFunction = fun(localArg1:Int, localArg2:Int):Int = localArg1 * localArg2

        println("anonymousMethod's value is ${resultFunction(arg1, arg2)}")
    }

    fun function4():Unit {
        println("GenericFunctionTestMain.function4()")

        return Unit
    }

    fun function5():Nothing {
        println("GenericFunctionTestMain.function5() return Nothing")

        throw IOException("GenericFunctionTestMain.function5() 233 666")
    }
}

fun main() {
    genericFunction1("233", 1, 2, 3, "Kotlin")

    GenericFunctionTestMain<String>().function1("666", "Java", "Kotlin", "Android")
    GenericFunctionTestMain<String>().function2("Kotlin")
    GenericFunctionTestMain<String>().function3(2, 3)
    GenericFunctionTestMain<String>().function4()
    GenericFunctionTestMain<String>().function5()
}

fun <T> genericFunction1(tag: String, vararg vars: T) {
    println("genericFunction1() $tag:")
    for (i in vars.indices) {
        println("args[$i] = ${vars[i].toString()}")
    }
}