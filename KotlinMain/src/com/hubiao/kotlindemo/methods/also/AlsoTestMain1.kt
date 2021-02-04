package com.hubiao.kotlindemo.methods.also

class AlsoTestMain1 {
}

fun main() {
    "fakeAlso1".fakeAlso1 {
        print("\n" + it + "\n")
        println(it)
    }

    "fakeAlso2".fakeAlso2 {
        print("\n" + it + "\n")
        println(it)
    }
}