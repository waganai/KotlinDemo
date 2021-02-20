package com.hubiao.kotlindemo.container

class ArrayOfPrimitiveTypesTestMain {
}

fun main() {
    val array1 = intArrayOf(1, 2, 3, 4)
    val array2 = IntArray(3)
    array2[0] = 0
    array2[1] = 1
    array2[2] = 2

    val array3 = IntArray(4, init = { it * it * it })

    for (i in array1.indices){
        println("array1[$i]  = ${array1[i]}")
    }

    println()

    for (i in array2.indices){
        println("array2[$i]  = ${array2[i]}")
    }

    println()

    for (i in array3.indices){
        println("array3[$i]  = ${array3[i]}")
    }
}