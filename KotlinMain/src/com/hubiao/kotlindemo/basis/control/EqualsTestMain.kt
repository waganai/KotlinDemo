package com.hubiao.kotlindemo.basis.control

class EqualsTestMain {
}

fun main() {
    var a1 = 1
    val b1 = 1

    println("a1 == b1 = ${a1 == b1}")

    a1 = 0

    println("after change, a1 == b1 = ${a1 == b1}")

    var str1 = "Java"
    val str2 = "Kotlin"

    println("str1 == str2 = ${str1 == str2}")
    println("str1 === str2 = ${str1 === str2}")

    str1 = "Kotlin"

    println("after change, str1 == str2 = ${str1 == str2}")
    println("after change, str1 === str2 = ${str1 === str2}")

    var test1: EqualsTestClass1? = EqualsTestClass1("Java", 0L)
    val test2 = EqualsTestClass1("Kotlin", 1L)

    println("test1 == test2 is ${test1 == test2}, test1 === test2 is ${test1 === test2}")

    test1?.name = "Kotlin"
    test1?.id = 1
    println("After change, test1 == test2 is ${test1 == test2}, test1 === test2 is ${test1 === test2}")

    test1 = test2

    println("After point to test2, test1 == test2 is ${test1 == test2}, test1 === test2 is ${test1 === test2}")

    test1 = null
    println("After point to null, test1 == test2 is ${test1 == test2}, test1 === test2 is ${test1 === test2}")
}

class EqualsTestClass1(private val _name: String, private val _id: Long) {
    var name = _name
    var id = _id

    override fun equals(other: Any?): Boolean {
        return if (other !is EqualsTestClass1) {
            false
        } else {
            name == other.name && id == other.id
        }
    }
}