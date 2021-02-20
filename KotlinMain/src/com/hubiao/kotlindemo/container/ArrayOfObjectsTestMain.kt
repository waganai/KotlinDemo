package com.hubiao.kotlindemo.container

class ArrayOfObjectsTestMain {
}

fun main() {
    val array1 = arrayOf(1, 2, 3, 4)
    val array2 = arrayOf("C", "C++", "Java", "Kotlin")

    val array3 = arrayOfNulls<Int>(10)
    array3[0] = 0
    array3[1] = 1
    array3[2] = 2
    array3[3] = 3
    array3[4] = 4
    array3[5] = 5
    array3[6] = 6
    array3[7] = 7

    val array4 = Array<String>(4, init = { "value in index $it is ${it * it}" })

    for (i in array1.indices) {
        println("array1[$i] = ${array1[i]}")
    }

    println()

    for (i in array2.indices) {
        println("array2[$i] = ${array2[i]}")
    }

    println()

    for (i in array3.indices) {
        println("array3[$i] = ${array3[i]}")
    }

    println()

    for (i in array4.indices) {
        println("array4[$i] = ${array4[i]}")
    }
}