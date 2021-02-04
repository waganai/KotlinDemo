package com.hubiao.kotlindemo.methods.also

class FakeAlsoMethod1 {
}

fun <T> T.fakeAlso1(block: (T) -> Unit): T {
    block(this)

    return this
}

inline fun<T> T.fakeAlso2(block:(T) ->Unit):T {
    block(this)

    return this
}