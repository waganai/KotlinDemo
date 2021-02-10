package com.hubiao.kotlindemo.classesobjects.special

sealed class SealedClassTestClass {
    class Java(var name: String) : SealedClassTestClass()
    class Kotlin(var name: String) : SealedClassTestClass()
    class Android(var name: String) : SealedClassTestClass()
}