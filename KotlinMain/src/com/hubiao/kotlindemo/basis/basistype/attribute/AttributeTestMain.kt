package com.hubiao.kotlindemo.basis.basistype.attribute

const val const_test = "const_test"

class AttributeTestMain {
    var a = "666"
        set(value) {
            field = "$value:$value"
        }
        get() = "$field:$field"

    val b = "233"
        get() {
            return "$field:filed"
        }

    val c
    get() = a
}

fun main() {
    var attributeTestMain = AttributeTestMain()

    println("varValTestMain.a = ${attributeTestMain.a}, attributeTestMain.b = ${attributeTestMain.b}, attributeTestMain.c = ${attributeTestMain.c}")

    attributeTestMain.a = "Kotlin"

    println("after change, attributeTestMain.a = ${attributeTestMain.a}, attributeTestMain.b = ${attributeTestMain.b}, attributeTestMain.c = ${attributeTestMain.c}")
}