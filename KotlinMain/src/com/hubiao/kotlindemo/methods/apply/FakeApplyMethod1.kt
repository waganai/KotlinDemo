package com.hubiao.kotlindemo.methods.apply

class FakeApplyMethod1 {
}

fun <T> T.fakeApply1(block:T.() ->Unit):T {
    block()

    return this
}

inline fun <T> T.fakeApply2(block:T.() ->Unit):T {
    block()

    return this
}