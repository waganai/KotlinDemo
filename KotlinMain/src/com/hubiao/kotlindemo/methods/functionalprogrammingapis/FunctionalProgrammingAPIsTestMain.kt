package com.hubiao.kotlindemo.methods.functionalprogrammingapis

class FunctionalProgrammingAPIsTestMain {
}

fun main() {
    val test1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    test1.filter { it > 5 }.forEach { println("$it") }

    println()

    test1.map { it * it }.forEach { println("$it") }

    println()

    println(test1.reduce(operation = { i: Int, i1: Int ->
        i * i1
    }))
}