package com.hubiao.kotlindemo.classesobjects.inheritance

interface InterfaceTest1Class {
    var name1: String
        get() = "name1"
        set(value)  {
            println("InterfaceTest1Class.name1.setter(), value = $value")
        }

    fun function1()
    fun function2(arg1: Int)
    fun function3(arg1: String)
    fun function4() {
        println("function4()")
    }
}