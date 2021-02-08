package com.hubiao.kotlindemo.basis.control

class WhenTestMain {
}

fun main() {
    whenFunction1(30)

    whenFunction2("Kotlin")

    val str = "Kotlin"
    println("$str is ${whenFunction3(str)}")
}

fun whenFunction1(var1: Int) {
    when (var1) {
        0 -> {
            println("var1 is 0")
        }

        1 -> {
            println("var1 is 1")
        }

        in 10..20 -> {
            println("var1 is in 10..20")
        }

        else -> {
            println("var1 is other value")
        }
    }
}

fun whenFunction2(var1: Any) {
    when (var1) {
        is Byte -> {
            println("$var1's type is Byte")
        }

        is Short -> {
            println("$var1's type is Short")
        }

        is Int -> {
            println("$var1's type is Int")
        }

        is Long -> {
            println("$var1's type is Long")
        }

        is Float -> {
            println("$var1's type is Float")
        }

        is Double -> {
            println("$var1's type is Double")
        }

        is Char -> {
            println("$var1's type is Char")
        }

        is String -> {
            println("$var1's type is String")
        }

        else -> {
            println("$var1's type is other type")
        }
    }
}

fun whenFunction3(any: Any?): String {
    return when (any) {
        null -> "Null"
        is Byte -> "Byte"
        is Short -> "Short"
        is Int -> "Int"
        is Long -> "Long"
        is Float -> "Float"
        is Double -> "Double"
        is Char -> "Char"
        is String -> "String"
        else ->
            "UnKnown"
    }
}