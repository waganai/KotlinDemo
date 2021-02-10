package com.hubiao.kotlindemo.grammar

class PackageTestMain {
}

fun main() {
    // Kotlin中文件路径和package名称至今并没有直接关系
    val test1 = PackageTestClass()
    println("test1.name = ${test1.name}, test1.id = ${test1.id}")
}