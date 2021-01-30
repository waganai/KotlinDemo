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