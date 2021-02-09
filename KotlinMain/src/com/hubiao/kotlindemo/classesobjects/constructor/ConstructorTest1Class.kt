package com.hubiao.kotlindemo.classesobjects.constructor

class ConstructorTest1Class constructor(arg1: Int, arg2: String) {
    init {
        println("ConstructorTest1Class main constructor() arg1 = $arg1, arg2 = $arg2")
    }

    constructor(arg1: Int, arg2: String, arg3: String):this(arg1, arg2) {
        println("ConstructorTest1Class second constructor() arg1 = $arg1, arg2 = $arg2")
    }
}