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

    var d:String? = "D"
}

fun main() {
    val attributeTestMain = AttributeTestMain()

    println("In varValTestMain, a = ${attributeTestMain.a}, b = ${attributeTestMain.b}, c = ${attributeTestMain.c}, d.length = ${attributeTestMain.d?.length}")

    attributeTestMain.a = "Kotlin"

    println("after change, In varValTestMain, a = ${attributeTestMain.a}, b = ${attributeTestMain.b}, c = ${attributeTestMain.c}, d.length = ${attributeTestMain.d!!.length}")
}