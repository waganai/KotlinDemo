package com.hubiao.kotlindemo.classesobjects.special

open class SealedClassTest2Class {
    class Java(var name:String):SealedClassTest2Class()
    class Kotlin(var name:String):SealedClassTest2Class()
    class Android(var name:String):SealedClassTest2Class()
}