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
    val list1 = arrayListOf<Int>(1, 2, 3, 4)
    val sixteenInBinary = 0b10000
    val sixteenInHexadecimal = 0x10

    println("byte = $byte, byte.toInt() =  ${byte.toInt()}")
    println("boolean = $boolean, boolean.toString() = ${boolean.toString()}")

    println("char = $char, char.toString = ${char.toString()}")
    println("string = $string, string.toCharArray() = ${string.toCharArray()}")

    println("int = $int, int.toChar() = ${int.toChar()}, int.toSting(0 = ${int.toString()}")
    println("char.toInt(0 = ${char.toInt()}, string.toInt() = ${string.toInt()}")

    for (i in list1.indices) {
        println("list[$i] = ${list1[i]}")
    }

    println("sixteenInBinary = $sixteenInBinary")
    println("sixteenInHexadecimal = $sixteenInHexadecimal")
}