package com.hubiao.kotlindemo.basis.control

import java.lang.Integer.parseInt

class IfElseWhenWhileMain {
}

fun main() {
//    ifFunction()
//    whenFunction()
    forFunction()
}

fun ifFunction() {
    val a = 1
    val b = 2
    val max = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }

    println("a is $a, b is $b, max is $max")
}

fun whenFunction() {
    val x = 0
    val s = "0"

    println("x is $x")

    when (x) {
        is Int -> println("x is Int type")
        !in 11..100 -> println("x is not in 10..100")
        in 0..10 -> println("x is in 0..10")
        parseInt(s) -> println("$s encodes x")
        0, 1 -> println("x is 0 or 1")
        else -> println("otherwise")
    }
}

fun forFunction() {
    val collection = arrayOf("A", "B", "C", "D", "E", "F", "G", "H", "I")

    for (item in collection) {
        print("item is $item, ")
    }

    println()

    for (i in collection.indices) {
        println("collection[$i] is ${collection[i]}")
    }

    for ((index, value) in collection.withIndex()) {
        println("the element's index is $index, value is $value")
    }
}