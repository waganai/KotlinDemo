package com.hubiao.kotlindemo.methods.run

class FakeRunMethod1 {
}

fun <T, R> T.fakeRun1(block: T.() -> R): R {
    return block()
}

inline fun <T, R> T.fakeRun2(block:T.() -> R):R {
    return block()
}