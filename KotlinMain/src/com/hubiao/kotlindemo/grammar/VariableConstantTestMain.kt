package com.hubiao.kotlindemo.grammar

class VariableConstantTestMain {
}

private const val helloWorld = "hello, World"
private val helloKotlin
    get() = "Hello, Kotlin"
private var helloJava = "hello, Java"

fun main() {
    println("helloWorld = $helloWorld")
    println("helloKotlin = $helloKotlin")
    println("helloJava = $helloJava")
}

class ConstTestClass {
    companion object {
        const val tag = "ConstTestClass"
    }

    var name = "name"
    val name1 = "name1"
}

object ConstTestClass2 {
    const val TAG = "ConstTestClass2"
}