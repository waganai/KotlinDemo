package com.hubiao.kotlindemo.basis.basistype.collections

class MapTestMain1 {
}

fun main() {
    var map1 = mapOf(1 to 2, 3 to 4, "key" to "value")

    println("map1 = ")
    for (i in map1) {
        println("${i}.key = ${i.key}, $i.value = ${i.value}")
    }

    val map2 = mutableMapOf<Any, Any>("A" to "C", 1 to 2, false to true)

    println("before map2 = ")
    for (i in map2) {
        println("$i.key  = ${i.key}, $i.value = ${i.value}")
    }

    map2.put('A', 'B')

    println()

    println("after map2 = ")
    for (i in map2) {
        println("$i.key  = ${i.key}, $i.value = ${i.value}")
    }
}