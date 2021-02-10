package com.hubiao.kotlindemo.grammar

class identifierTestMain {
}

fun main() {
    // 硬关键字可以使用``包裹充当关键字
    val `class` = "Class"
    // 汉字、韩文、日文等，也是可以充当关键字的
    val 安卓 = "Android 安卓"
    // 软关键字可以其适用场景之外充当关键字
    val by = "by"
    // 修饰符关键字可以其适用场景之外充当关键字
    val public = "Public"
    // it和field可以在其使用场景之外充当关键字
    val it = "it"
    val field = "file"
    val π = 3.1415926
    val _name = "Kotlin"

    println("`class` = $`class`")
    println("安卓 is $安卓")
    println("by is $by")
    println("public is $public")
    println("it is $it")
    println("field is $field")
    println("π is $π")
    println("_name = $_name")
}