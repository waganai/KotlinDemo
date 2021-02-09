package com.hubiao.kotlindemo.classesobjects.inheritance

abstract class AbstractClassTest1Class {
    abstract fun function1()

    fun function2() {
        println("AbstractClassTest1Class.function2()")
    }

    fun function3(arg1: Int) {
        println("AbstractClassTest1Class.function3($arg1)")
    }
}