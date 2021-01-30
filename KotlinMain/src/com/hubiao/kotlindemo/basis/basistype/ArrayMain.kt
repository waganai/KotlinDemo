package com.hubiao.kotlindemo.basis.basistype

class ArrayMain {
}

fun main() {
    arrayFunction()
}

fun arrayFunction() {
    val a = arrayOf(1, 2, 3, 4, 5, 6.0, 7L, "Eight")
    val b = Array(10) { (it * it) }
    val c = Array(9) {
        if (it % 2 == 0) (it * it) else {
            "$it * $it"
        }
    }

    print("a: (")
    for (i in a) {
        print("$i ")
    }
    println(")")

    print("b: (")
    for (i in b) {
        print("$i ")
    }
    println(")")

    print("c: (")
    for (i in c) {
        print("$i ")
    }
    println(")")

    println("a.get(0) = ${a.get(0)}, a[7] = ${a[7]}")
    a[7] = 8.00F
    println("a.get(0) = ${a.get(0)}, a[7] = ${a[7]}")

    val x = intArrayOf(1, 2, 3)
    println("x[0] = ${x[0]}, x[1] = ${x[1]}, x[2] = ${x[2]}")
    x[0] = x[1] * x[2]
    println("x[0] = ${x[0]}, x[1] = ${x[1]}, x[2] = ${x[2]}")
}