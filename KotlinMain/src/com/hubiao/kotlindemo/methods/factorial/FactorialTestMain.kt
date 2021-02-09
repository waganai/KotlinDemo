package com.hubiao.kotlindemo.methods.factorial

class FactorialTestMain {
    companion object {
        fun factorial(arg: Int): Int = if (arg <= 1) {
            arg
        } else {
            arg * factorial(arg - 1)
        }

        tailrec fun factorial1(arg: Int): Int = if (arg <= 1) arg else arg * factorial1(arg - 1)
    }
}

fun main() {
    println("5的阶乘是：${FactorialTestMain.factorial(5)}")
    println("10的阶乘是：${FactorialTestMain.factorial1(10)}")
}