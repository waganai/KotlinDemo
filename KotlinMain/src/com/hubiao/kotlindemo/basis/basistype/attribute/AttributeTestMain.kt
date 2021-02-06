package com.hubiao.kotlindemo.basis.basistype.attribute

class VarValTestMain {
    var a = "666"
        set(value) {
            field = "$value:$value"
        }
        get() = "$field:$field"

    val b = "233"
        get() {
            return "$field:filed"
        }
}

fun main() {
    var varTestMain = VarValTestMain()

    println("varTestMain.a = ${varTestMain.a}, varTestMain.b = ${varTestMain.b}")

    varTestMain.a = "Kotlin"

    println("after change, varTestMain.a = ${varTestMain.a}, varTestMain.b = ${varTestMain.b}")
}