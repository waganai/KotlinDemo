package com.hubiao.kotlindemo.basis.basistype

class StringBuilderTestClassMain {
}

fun main() {
    stringBuilderFunction1()
}

fun stringBuilderFunction1() {
    val stringBuilder1 = StringBuilder()
    val stringBuilder2 = StringBuilder("AAA")

    println("stringBuilder1 = $stringBuilder1")

    stringBuilder1.append("JavaKotlin")

    println("after append(), stringBuilder1 = $stringBuilder1")

    stringBuilder1.insert(4, ",")

    println("after insert(), stringBuilder1 = $stringBuilder1")

    stringBuilder1.delete(4, stringBuilder1.length)

    println("after delete(), stringBuilder1 = $stringBuilder1")

    stringBuilder1.replace("Java".toRegex(), "Android")

    println("after replace1, stringBuilder1 = $stringBuilder1")

    stringBuilder1.replace(0, stringBuilder1.length, "Android")

    println("after replace2, stringBuilder1 = $stringBuilder1")
}