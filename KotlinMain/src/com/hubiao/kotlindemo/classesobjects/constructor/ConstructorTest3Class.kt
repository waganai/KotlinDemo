package com.hubiao.kotlindemo.classesobjects.constructor

class ConstructorTest3Class {
    constructor(arg1: Int, arg2: String, arg3: String = "arg3", vararg arg4: String) {
        println("ConstructorTest3Class second constructor() arg1 = $arg1, arg2 = $arg2, agr3 = $arg3")

        for (i in arg4.indices) {
            if (i == 0) {
                print("ConstructorTest3Class second constructor() arg4: ${arg4[i]}")
            } else {
                print("${arg4[i]}")
            }

            if (i < (arg4.size - 1)) {
                print(", ")
            } else {
                println()
            }
        }
    }
}