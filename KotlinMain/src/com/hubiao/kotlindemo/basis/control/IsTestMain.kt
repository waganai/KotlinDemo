package com.hubiao.kotlindemo.basis.control

class IsTestMain {
}

fun main() {
//    isFunction1(1)
//    isFunction2(2F)
    isTestFunction()
}

fun isFunction1(any: Any) {
    if (any is Byte) {
        println("any is Byte")
        return
    }

    if (any is Short) {
        println("any is Short")
        return
    }

    if (any is Int) {
        println("any is Int")
        return
    }
}

fun isFunction2(any: Any) {
    if (any !is Byte) {
        println("any is not Byte")
    }

    if (any !is Short) {
        println("any is not Short")
    }

    if (any !is Int) {
        println("any is not Int")
    }
}

fun isTestFunction() {
    val test0 = IsTestClass1()
    val test1 = IsTestClass1Child1()
    val test2 = IsTestClass1Child2()

    println("test0 is IsTestClass1Child1 = ${test0 is IsTestClass1Child1}")
    println("test0 is IsTestClass1Child2 = ${test0 is IsTestClass1Child2}")

    println("test1 is IsTestClass1 = ${test1 is IsTestClass1}")
    println("test1 is IsTestClass1Child1 = ${test1 is IsTestClass1Child1}")
//    println("test1 is IsTestClass1Child2 = ${test1 is IsTestClass1Child2}")

    println("test2 is IsTestClass1 = ${test2 is IsTestClass1}")
//    println("test2 is IsTestClass1Child1 = ${test2 is IsTestClass1Child1}")
    println("test2 is IsTestClass1Child2 = ${test2 is IsTestClass1Child2}")
}

open class IsTestClass1 {
    var name = ""
    var id = 0
}

class IsTestClass1Child1:IsTestClass1() {}
class IsTestClass1Child2:IsTestClass1() {}

