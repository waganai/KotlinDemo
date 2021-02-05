package com.hubiao.kotlindemo.basis.basistype

class SetTestMain1 {
}

fun main() {
    var set1 = setOf(1,2, "3")
    val set2 = mutableSetOf("A", "B", "C")

    print("set1 ")

    for(i in set1) {
        print("i = $i, ")
    }

    set2.add("D")

    println()

    print("set2 ")

    for(i in set2) {
        print("i = $i, ")
    }
}