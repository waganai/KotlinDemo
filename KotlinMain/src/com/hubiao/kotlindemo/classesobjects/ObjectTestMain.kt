package com.hubiao.kotlindemo.classesobjects

class ObjectTestMain {
}

fun main() {
    println("Object1Main.object1.name = " + Object1Main.object1.name)
    println("Object1Main.object1.name = " + Object1Main.object1.name1)
    println("Object1Main.object1.name = " + Object1Main.object1.name2)
    Object1Main.object1.method1()
    Object1Main.object1.method2()

    println("Object2Main.name = " + Object2Main.name)
    println("Object1Main.object1.name = " + Object2Main.name1)
    println("Object1Main.object1.name = " + Object2Main.name2)
    Object2Main.method1()
    Object2Main.method2()

    println("CompanionObjectMain.name = " + CompanionObjectMain.name)
    println("CompanionObjectMain.name = " + CompanionObjectMain.name1)
    println("CompanionObjectMain.name = " + CompanionObjectMain.name2)
    CompanionObjectMain.method1()
    CompanionObjectMain.method2()
}