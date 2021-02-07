package com.hubiao.kotlindemo.basis.control

class CycleTestMain {
}

fun main() {
//    cycleFunction1(intArrayOf(1, 2, 3, 4))
//    cycleFunction2(listOf(5, 6, 7, 8))
//    cycleFunction3(intArrayOf(1, 2, 3, 4))
//    cycleFunction4(listOf(5, 6, 7, 8))
//    cycleFunction5(intArrayOf(1, 2, 3, 4))
//    cycleFunction6(listOf(5, 6, 7, 8))

    cycleFunction7()
}

fun cycleFunction1(array1: IntArray) {
    for (a in array1) {
        println("a = $a")
    }
}

fun cycleFunction2(list1: List<Int>) {
    for (a in list1) {
        println("a = $a")
    }
}

fun cycleFunction3(array1: IntArray) {
    for (i in array1.indices) {
        println("array1[$i] = ${array1[i]}")
    }
}

fun cycleFunction4(list1: List<Int>) {
    for (i in list1.indices) {
        println("list.get($i) = ${list1[i]}")
    }
}

fun cycleFunction5(array1: IntArray) {
    array1.forEach {
        println("it = $it")
    }
}

fun cycleFunction6(list1: List<Int>) {
    list1.forEach {
        println("it  = $it")
    }
}

fun cycleFunction7() {
    for (i in 1..10) {
        print("$i, ")
    }
    println()

    for (i in 20 downTo 10) {
        print("$i, ")
    }
    println()

    for (i in 1..10 step 3) {
        print("$i, ")
    }
    println()

    for (i in 1 until 10) {
        print("$i, ")
    }
    println()

    for (i in 20 until 10) {
        print("$i, ")
    }
    println()
}