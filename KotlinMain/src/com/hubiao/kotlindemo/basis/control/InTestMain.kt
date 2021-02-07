package com.hubiao.kotlindemo.basis.control

class InTestMain {
}

fun main() {
    val array1 = intArrayOf(1, 2, 3, 4)
    val list1 = listOf(5, 6, 7, 8)
    val set1 = setOf(10, 11, 12, 13)
    val map1 = mapOf("1" to 1, "2" to 2, "3" to 3, "4" to 4)

    inFunction1(1, array1)
    inFunction2(0, array1)
    inFunction3(5, list1)
    inFunction4(10, list1)
    inFunction5(10, set1)
    inFunction6(100, set1)
    inFunction7(0, map1)
    inFunction8(-1, map1)
}

fun inFunction1(var1: Int, intArray: IntArray) {
    if (var1 in intArray) {
        println("$var1 in $intArray")
    } else {
        println("$var1 not in $intArray")
    }
}

fun inFunction2(var1: Int, intArray: IntArray) {
    if (var1 !in intArray) {
        println("$var1 not in $intArray")
    } else {
        println("$var1 in $intArray")
    }
}

fun inFunction3(var1: Int, list1: List<Int>) {
    if (var1 in list1) {
        println("$var1 in $list1")
    } else {
        println("$var1 not in $list1")
    }
}

fun inFunction4(var1: Int, list1: List<Int>) {
    if (var1 !in list1) {
        println("$var1 not in $list1")
    } else {
        println("$var1  in $list1")
    }
}

fun inFunction5(var1: Int, set1: Set<Int>) {
    if (var1 in set1) {
        println("$var1  in $set1")
    } else {
        println("$var1 not in $set1")
    }
}

fun inFunction6(var1: Int, set1: Set<Int>) {
    if (var1 !in set1) {
        println("$var1 not in $set1")
    } else {
        println("$var1 in $set1")
    }
}

fun inFunction7(var1: Int, map1: Map<String, Int>) {
    if (var1 in map1) {
        println("$var1 in $map1")
    } else {
        println("$var1 not in $map1")
    }
}

fun inFunction8(var1: Int, map1: Map<String, Int>) {
    if (var1 !in map1) {
        println("$var1 not in $map1")
    } else {
        println("$var1 in $map1")
    }
}