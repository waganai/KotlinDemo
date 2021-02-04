package com.hubiao.kotlindemo.methods.inline

class InlineMethodMain1 {
}

fun main() {
    payFoo4<Int>()
    payFoo4<Long>()
    payFoo4<String>()
}

inline fun payFoo(block: () -> Unit) {
    println("payFoo() before block()")

    block()

    println("payFoo() after block()")
}

inline fun payFoo2(block1: () -> Unit, noinline block2: () -> Unit) {
    block1()
    block2()
}

inline fun payFoo3(crossinline block: () ->Unit) {
    block()
}

inline fun<reified T>  payFoo4() {
    println(T::class)
}

