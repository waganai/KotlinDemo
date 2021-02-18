package com.hubiao.kotlindemo.classesobjects

class ClassTest1Class {
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // public
    // public 的var不论是否有重写setter和getter，都会有对应setter和getter
    var attribute1 = "attribute1"

    // 声明赋值时必须在 setter 或者getter中有field
    var attribute2 = "attribute2"
        get() = "attribute2.field = $field"

    // setter 和初始化没有关系，初始化时不会调用setter
    var attribute3 = "attribute3"
        set(value) {
            field = "attribute3.value = $value"
        }
    var attribute4 = "attribute4"
        set(value) {
            field = "attribute4.value = $value"
        }
        get() = "attribute4.field = $field"

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // public 的val不论是否有重写setter和getter，都会有对应的getter
    val attribute5 = "attribute5"
    val attribute6 = "attribute6"
        get() = "attribute2.field = $field"

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // private
    // private 的var和val默认没有setter和getter，只有显式写出的setter和getter才有
    private var attribute11 = "attribute11"

    // 声明赋值时必须在 setter 或者getter中有field
    private var attribute12 = "attribute12"
        get() = "attribute2.field = $field"

    // setter 和初始化没有关系，初始化时不会调用setter
    private var attribute13 = "attribute13"
        set(value) {
            field = "attribute13.value = $value"
        }
    private var attribute14 = "attribute14"
        set(value) {
            field = "attribute14.value = $value"
        }
        get() = "attribute14.field = $field"

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private val attribute15 = "attribute15"
    private val attribute16 = "attribute16"
        get() = "attribute16.field = $field"

    fun function1(arg1: String) {
        println("function1() attribute1 = $attribute1")
        println("function1() attribute2 = $attribute2")
        println("function1() attribute3 = $attribute3")
        println("function1() attribute4 = $attribute4")
        println("function1() attribute5 = $attribute5")
        println("function1() attribute6 = $attribute6")

        println("function1() attribute11 = $attribute11")
        println("function1() attribute12 = $attribute12")
        println("function1() attribute13 = $attribute13")
        println("function1() attribute14 = $attribute14")
        println("function1() attribute15 = $attribute15")
        println("function1() attribute16 = $attribute16")

        attribute11 = "Kotlin"

        println("function1() after change, attribute11 = $attribute11")

        attribute11 = attribute15

        println("function1() after change, attribute11 = $attribute11")
    }
}

fun main() {
    ClassTest1Class().function1("233")
}