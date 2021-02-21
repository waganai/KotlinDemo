package com.hubiao.kotlindemo.exception

import java.io.IOException
import java.lang.StringBuilder

class TryCatchFinallyTestMain {
    // return处是生成了一个内存空间，除非后续的return返回不同内容，里面的值是不会改变的，不论存储的是基本类型还是引用类型
    fun tryCatchFinallyFunction1(): Int {
        try {
            return 0
        } catch (e: IOException) {
            return 1
        } finally {
            return 2
        }

        return 3
    }

    fun tryCatchFinallyFunction2(): Int {
        var i = 0

        try {
            return i
        } catch (e: IOException) {
            i = 1
        } finally {
            i = 2
        }

        return 3
    }

    fun tryCatchFinallyFunction3(): String {
        try {
            return "C"
        } catch (e: IOException) {
            return "C++"
        } finally {
            return "Java"
        }

        return "Kotlin"
    }

    fun tryCatchFinallyFunction4(): String {
        var str = "C"
        try {
            return str
        } catch (e: IOException) {
            str = "C++"
        } finally {
            str = "Java"
        }

        return "Kotlin"
    }

    // String自身的修改，其实是指向了常量池里的新的地址
    fun tryCatchFinallyFunction5(): String {
        var str = "C"
        try {
            return str
        } catch (e: IOException) {
            str  += "C++"
        } finally {
            str += "Java"
        }

        return "Kotlin"
    }

    fun tryCatchFinallyFunction6(): StringBuilder {
        var str = StringBuilder("C")
        try {
            return str
        } catch (e: IOException) {
            str = StringBuilder("C++")
        } finally {
            str = StringBuilder("Java")
        }

        return StringBuilder("Koltin")
    }

    fun tryCatchFinallyFunction7(): StringBuilder {
        var str = StringBuilder("C")
        try {
            return str
        } catch (e: IOException) {
            str.clear()
            str.append("C++")
        } finally {
            str.clear()
            str.append("Java")
        }

        return StringBuilder("Koltin")
    }
}

fun main() {
    val test1 = TryCatchFinallyTestMain()
    println("test1.tryCatchFinallyFunction1()  = ${test1.tryCatchFinallyFunction1()}")
    println()
    println("test1.tryCatchFinallyFunction2()  = ${test1.tryCatchFinallyFunction2()}")
    println()

    println("test1.tryCatchFinallyFunction3()  = ${test1.tryCatchFinallyFunction3()}")
    println()
    println("test1.tryCatchFinallyFunction4()  = ${test1.tryCatchFinallyFunction4()}")
    println()
    println("test1.tryCatchFinallyFunction5()  = ${test1.tryCatchFinallyFunction5()}")
    println()

    println("test1.tryCatchFinallyFunction6()  = ${test1.tryCatchFinallyFunction6()}")
    println()
    println("test1.tryCatchFinallyFunction7()  = ${test1.tryCatchFinallyFunction7()}")
    println()
}