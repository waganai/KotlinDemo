package com.hubiao.kotlindemo.basis.basistype

class BreakMain {
}

fun main() {
    breakFunction()
}

fun breakFunction() {
    val a = arrayOf(1, 2, 3, 4, 5, 6, 7)
    val b = arrayOf("A", "B", "C", "E", "F", "G", "H")

    loop1@for (i in a) {
        println("i is $i start")
        for (j in b) {
            println("j is $j start")

            if ("B" == j) {
                break@loop1
            }

            println("j is $j end")
        }
        println("i is $i end")
    }
}