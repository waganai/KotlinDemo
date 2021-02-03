package com.hubiao.kotlindemo.classesobjects

object  Object2Main {
    const val name = "Object2Main.name"
    val name1 = "Object2Main.name1"
    @JvmField
    val name2 = "Object2Main.name2"

    fun method1() {
        println("Object2Main.name1")
    }

    @JvmStatic
    fun method2() {
        println("Object2Main.name2")
    }
}