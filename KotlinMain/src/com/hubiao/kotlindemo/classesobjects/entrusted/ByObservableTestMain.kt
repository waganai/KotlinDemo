package com.hubiao.kotlindemo.classesobjects.entrusted

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class ByObservableTestMain {
    // initialValue 是初始化传入的值，不会触发后面赋值时的方法
    // kProperty 是固定类型 KMutableProperty1Impl
    // s 是这次赋值前的旧值
    // s1 是这次赋的值
    var name by Delegates.observable("C") { kProperty: KProperty<*>, s: String, s1: String ->
        println("kProperty is ${kProperty::class.java.simpleName}, s is $s, s1 is $s1")
    }
}

fun main() {
    val byObservableTestMain = ByObservableTestMain()
    byObservableTestMain.name = "C++"
    byObservableTestMain.name = "Java"
    byObservableTestMain.name = "Kotlin"
}