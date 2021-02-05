package com.hubiao.kotlindemo.basis.basistype

class ArrayTestMain {
}

fun main() {
    intArrayMethod3()
}

fun intArrayMethod1() {
    val intArray = intArrayOf(1, 2, 3)
    for(i in intArray.indices) {
        print("intArray[$i] = ${intArray[i]} ")
    }

    println()

    intArray[2] = 4
    for(i in intArray.indices) {
        print("intArray[$i] = ${intArray[i]} ")
    }
}

fun intArrayMethod2() {
    val intArray = listOf(1, 2, 3)
    for(i in intArray.indices) {
        print("intArray[$i] = ${intArray[i]} ")
    }
}

fun intArrayMethod3() {
    val intArray = mutableListOf(1,2, 3, "4")

    for(i in intArray.indices) {
        print("intArray[$i] = ${intArray[i]} ")
    }

    println()

//    intArray.add(4, "ABC")
    for(i in intArray.indices) {
        print("intArray[$i] = ${intArray[i]} ")
    }
}