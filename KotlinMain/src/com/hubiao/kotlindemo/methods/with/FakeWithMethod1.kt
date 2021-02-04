package com.hubiao.kotlindemo.methods.with

import javax.sound.midi.Receiver

class FakeWithMethod1 {
}

fun <T, R> fakeWith1(receiver: T, block: T.() -> R): R {
    return block(receiver)
}

inline fun <T, R> fakeWith2(receiver: T, block: T.() -> R): R {
    return block(receiver)
}