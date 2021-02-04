package com.hubiao.kotlindemo.methods.run

class RunTestMain1 {
}

fun main() {
    "fakeRun1".fakeRun1 {
        print("\n" + this + "\n")
        println(this)
    }

    "fakeRun2".fakeRun2 {
        print("\n" + this + "\n")
        println(this)
    }
}