package com.hubiao.kotlindemo.basis.control

class IsTestMain {
}

fun main() {
    isFunction1(1)
    isFunction2(2F)
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
