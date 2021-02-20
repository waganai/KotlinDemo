package com.hubiao.kotlindemo.methods.higherorderfunctions

class ClosureTestMain {
    fun closureFunction1(): () -> Int {
        var value = 0

        fun closureMethod(): Int {
            value++
            return value
        }

        return ::closureMethod
    }
}

fun main() {
    val method1 = ClosureTestMain().closureFunction1()

    println("first time, value in method1 = ${method1.invoke()}")
    println("second time, value in method1 = ${method1.invoke()}")
    println("third time, value in method1 = ${method1.invoke()}")
}