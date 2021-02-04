package com.hubiao.kotlindemo.methods.let

class FakeLetMethod1 {

}

fun <T, R> T.fakeLet1(block: (T) -> R): R {
    return block(this)
}

inline fun <T, R> T.fakeLet2(block: (T) -> R): R {
    return block(this)
}