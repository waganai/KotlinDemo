package com.hubiao.kotlindemo.basis.control

class ContinueMain {
}

fun main() {
    continueFunction()
}

fun continueFunction() {
    val a = arrayOf(1, 2, 3, 4, 5, 6, 7)
    val b = arrayOf("A", "B", "C", "E", "F", "G", "H")

    loop1@ for (i in a) {
        println("i is $i start")
        for (j in b) {
            println("j is $j start")

            if ("B" == j) {
                continue@loop1
            }

            println("j is $j end")
        }
        println("i is $i end")
    }
}