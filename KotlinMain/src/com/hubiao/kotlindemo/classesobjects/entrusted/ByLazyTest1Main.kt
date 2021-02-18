package com.hubiao.kotlindemo.classesobjects.entrusted

class ByLazyTest1Main {
    val name by lazy {
        println("""first time, set value "Hello, Kotlin"""")

        "Hello, Kotlin"
    }
}

fun main() {
    val byLazyTest1Main = ByLazyTest1Main()

    println("name = ${byLazyTest1Main.name}")
    println("name = ${byLazyTest1Main.name}")
}