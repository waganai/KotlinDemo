package com.hubiao.kotlindemo.classesobjects

class CompanionObjectMain {
    companion object {
        const val name = "CompanionObjectMain"

        val name1 = "CompanionObjectMain.name1"
        @JvmField
        val name2 = "CompanionObjectMain.name2"

        fun method1() {
            println("CompanionObjectMain.name1")
        }

        @JvmStatic
        fun method2() {
            println("CompanionObjectMain.name2")
        }
    }
}