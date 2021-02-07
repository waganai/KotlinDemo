package com.hubiao.kotlindemo.basis.control

class WhileTestMain {
}

fun main() {
    whileFunction1()
}

fun whileFunction1() {
    var i = 0
    while (i < 10) {
        print("i = $i, ")
        i++
    }

    println()

    var j = 0
    do {
        j--
        print("j = $j, ")
    } while (j > -10)
}