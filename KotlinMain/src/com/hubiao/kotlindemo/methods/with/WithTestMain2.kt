package com.hubiao.kotlindemo.methods.with

class WithTestMain2 {
}

fun main() {
    fakeWith1("fakeWith1"){
        print("\n"+this+"\n")
        println(this)
    }

    fakeWith2("fakeWith2"){
        print("\n"+this+"\n")
        println(this)
    }
}