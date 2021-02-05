package com.hubiao.kotlindemo.basis.basistype

class StringTestMain {
}

fun main() {
    var string:String = "ABC  DEF  "
    println("string = $string.")

    string = string.trim()

    println("after trim, string = $string.")

    string = string.replace(" ", "")

    println("after replace \" \" with \"\", string = $string.")

    println("string[2] = ${string[2]}")
}