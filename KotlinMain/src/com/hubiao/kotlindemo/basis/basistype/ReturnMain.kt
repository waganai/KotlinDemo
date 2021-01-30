package com.hubiao.kotlindemo.basis.basistype

class ReturnMain {
}

fun main() {
//    returnFunction12(true)
    returnFunction13()
}

fun returnFunction12(flag: Boolean) {
    println("returnFunction1 call returnFunction2 before")

    returnFunction2(flag)

    println("returnFunction1 call returnFunction2 after")
}

fun returnFunction13() {

    println("returnFunction1 call returnFunction2 before")

    returnFunction3()

    println("returnFunction1 call returnFunction3 after")
}

fun returnFunction2(flag: Boolean) {
    println("returnFunction2 call returnFunction3 before")

    if (flag) {
        return
    }

    println("returnFunction2 call returnFunction3 after")
}

fun returnFunction3() {
    println("returnFunction3 run step1")

    val a = listOf("A", "B", "C", "D", "E")

    a.forEach label1@{
        println("it = $it, foEach run step1")
        if ("D" == it) {
            return@label1
        }
        println("it = $it, foEach run step1")
    }

    println("returnFunction3 run step2")
}