package com.hubiao.kotlindemo.classesobjects

class Object1Main {
    object object1{
        const val name = "object1.name"
        val name1 = "object1.name1"
        @JvmField
        val name2 = "object1.name2"

        fun method1() {
            println("object1.name1")
        }

        @JvmStatic
        fun method2() {
            println("object1.name2")
        }
    }
}