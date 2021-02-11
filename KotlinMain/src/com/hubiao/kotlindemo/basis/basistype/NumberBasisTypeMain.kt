package com.hubiao.kotlindemo.basis.basistype

class NumberBasisTypeMain {

}

fun main() {
    function3()
}

fun function1() {
    val oneMillion = 1_00_00
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 99_99_0000L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_100100110

    println("oneMillion = $oneMillion")
    println("creditCardNumber = $creditCardNumber")
    println("socialSecurityNumber = $socialSecurityNumber")
    println("hexBytes = $hexBytes")
    println("bytes = $bytes")

    val byte1: Byte = 1
    val short1: Short = 1
    val int1: Int = 1
    val long1: Long = 1L
    val float1: Float = 0.1F
    val double1: Double = 0.1

    val num1 = byte1 + byte1
    val bum2 = byte1 + short1
    val num3 = byte1 + int1
    val num4 = short1 + int1
    val num5 = short1 + long1
    val num6 = short1 + float1
    val num7 = short1 + double1
}

fun function2() {
    val a: Int = 10000
    println("a == a : ${a == a}")
    println("a === a : ${a === a}")

    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println("boxedA == anotherBoxedA : ${boxedA == anotherBoxedA}")
    println("boxedA === anotherBoxedA : ${boxedA === anotherBoxedA}")
}

fun function3() {
    val a: Int? = 1
    var b: Long? = 1
    print("a == b?.toInt(): ${a == b?.toInt()}")
}