package com.hubiao.kotlindemo.basis.basistype

class BasisTypeTestMain {
}

fun main() {
    var byte: Byte = 0
    var short: Short = 0
    var int: Int = 0
    var long: Long = 0L
    var float: Float = 0.0F
    var double: Double = 0.0
    var boolean: Boolean = false
    var char: Char = 'A'
    var string: String = "AAAA"

    println("byte = $byte, byte.toInt() =  ${byte.toInt()}")
    println("boolean = $boolean, boolean.toString() = ${boolean.toString()}")

    println("char = $char, char.toString = ${char.toString()}")
    println("string = $string, string.toCharArray() = ${string.toCharArray()}")

    println("int = $int, int.toChar() = ${int.toChar()}, int.toSting(0 = ${int.toString()}")
    println("char.toInt(0 = ${char.toInt()}, string.toInt() = ${string.toInt()}")
}