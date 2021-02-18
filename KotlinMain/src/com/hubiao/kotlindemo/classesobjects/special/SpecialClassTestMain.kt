package com.hubiao.kotlindemo.classesobjects.special

class SpecialClassTestMain {
}

fun main() {
    val test1 = NestedClassTestClass.NestedClassTest2Class()
    test1.name = "NestedClassTest2Class"

    val test2 = InnerClassTestClass()
    val test3 = test2.InnerClassTestClass()

    test2.name = "test2"
    test3.name = "test3"

    val test4 = EnumClassTestClass.Java
    val test5 = EnumClassTestClass.Kotlin
    val test6 = EnumClassTestClass.Android

    resolveEnumFunction1(1)

    val test7 = DataClassTestClass("Kotlin")
    test7.name = "Kotlin.1.4.1"
    test7.id = 666

    val test8 = test7.copy()
    val test9 = test7.copy(name = "name")

    println("test8 = ${test8.toString()}")
    println("test9 = ${test9.toString()}")

    println("test7 == test8 = ${test7 == test8}")
    println("test7 == test9 = ${test7 == test9}")
    println("test7 === test8 = ${test7 === test8}")
    println("test7 === test9 = ${test7 === test9}")
}

fun resolveEnumFunction1(enumType: Int) {
    when (enumType) {
        EnumClassTestClass.Java.ordinal -> {
            println(EnumClassTestClass.Java.name)
        }
        EnumClassTestClass.Kotlin.ordinal -> {
            println(EnumClassTestClass.Kotlin.name)
        }
        EnumClassTestClass.Android.ordinal -> {
            println(EnumClassTestClass.Android.name)
        }
        else ->{
            println("Other Type")
        }
    }
}

fun resolveEnumFunction2(enumClass: EnumClassTestClass) {
    when (enumClass) {
        EnumClassTestClass.Java -> {
            println(EnumClassTestClass.Java.name)
        }
        EnumClassTestClass.Kotlin -> {
            println(EnumClassTestClass.Kotlin.name)
        }
        EnumClassTestClass.Android -> {
            println(EnumClassTestClass.Android.name)
        }
    }
}

fun resolveSealedFunction1(sealedClass :SealedClassTestClass) {
    when (sealedClass) {
        is SealedClassTestClass.Java -> {

        }
        is SealedClassTestClass.Kotlin -> {

        }

        is SealedClassTestClass.Android -> {
        }
    }
}

fun resolveSealedFunction2(sealedClass :SealedClassTest2Class) {
    when (sealedClass) {
        is SealedClassTest2Class.Java -> {

        }
        is SealedClassTest2Class.Kotlin -> {

        }

        is SealedClassTest2Class.Android -> {
        }
    }
}