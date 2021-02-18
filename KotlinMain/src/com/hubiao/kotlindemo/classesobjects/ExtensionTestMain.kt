package com.hubiao.kotlindemo.classesobjects

class ExtensionTestMain {
    var name = "ExtensionTestMain"

    fun function1() {
        println("ExtensionTestMain.function1()")
    }
}

fun main() {
    val extensionTestMain = ExtensionTestMain()
    extensionTestMain.function1()
    extensionTestMain.function2()

    extensionTestMain.name = "Kotlin"
    extensionTestMain.id = 666

    println("name = ${extensionTestMain.name}, id = ${extensionTestMain.id}")
}

var ExtensionTestMain.name: String
    get() = "ExtensionTestMain.name"
    set(value) {
        println("value = $value")
        println("name = $name")
    }

var ExtensionTestMain.id: Int
    get() = 2333
    set(value) {
        println("value = $value")
        println("id = $id")
    }

fun ExtensionTestMain.function1() {
    println("ExtTestMain.function1() this is extension method")
}

fun ExtensionTestMain.function2() {
    println("ExtTestMain.function2() this is extension method")
}