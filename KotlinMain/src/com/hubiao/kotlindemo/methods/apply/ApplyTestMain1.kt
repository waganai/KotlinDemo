package com.hubiao.kotlindemo.methods.apply

class ApplyTestMain1 {
}

fun main() {
    "fakeApply1".fakeApply1 {
        print("\n" + this + "\n")
        println(this)
    }

    "fakeApply2".fakeApply2 {
        print("\n" + this + "\n")
        println(this)
    }
}