package com.hubiao.kotlindemo.methods.generic

class GenericFunctionTestMain<T> {

    fun <T> function1(tag: String, vararg vars: T) {
        println("function1() $tag:")
        for (i in vars.indices) {
            println("args[$i] = ${vars[i].toString()}")
        }
    }
}

fun main() {
    genericFunction1("233", 1, 2, 3, "Kotlin")

    GenericFunctionTestMain<String>().function1("666", "Java", "Kotlin", "Android")
}

fun <T> genericFunction1(tag: String, vararg vars: T) {
    println("genericFunction1() $tag:")
    for (i in vars.indices) {
        println("args[$i] = ${vars[i].toString()}")
    }
}
