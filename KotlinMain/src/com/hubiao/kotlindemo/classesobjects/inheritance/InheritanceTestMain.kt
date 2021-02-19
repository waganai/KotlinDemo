package com.hubiao.kotlindemo.classesobjects.inheritance

class inheritanceTestMain {
}

fun main() {
    val test1 = ChildClassTest1Class()
    test1.function1()
    test1.function2()
    test1.function3(233)

    val test2 = ChildClassTest2Class("233", 233L)
    test2.info = "233就是233"

    val test3 = ChildClassTest3Class("666", 666L, "666不是666")
    test3.info = "666是233"

    val test4 = ChildClassTest4Class()

    inheritanceTestFunction1(test4, test4)

    test4.function4()
}

fun inheritanceTestFunction1(arg1: InterfaceTest2Class, arg2: InterfaceTest2Class) {
    arg1.function1()
    arg1.function2(listOf(1, 2, 3))
    arg1.function3(listOf("Java", "Kotlin", "Android"))

    arg2.function1()
    arg2.function2(listOf(4, 5, 6))
    arg2.function3(listOf("Apple", "Huawei", "Google"))
}