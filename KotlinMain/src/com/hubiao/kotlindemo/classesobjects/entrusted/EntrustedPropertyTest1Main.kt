package com.hubiao.kotlindemo.classesobjects.entrusted

import kotlin.reflect.KProperty

class EntrustedPropertyTest1Main(delegate2:Delegate2) {
    var name: String by Delegate1()
    // Delegate的getValue()和setValue()方法中的value类型应该和需要被代理的属性类型对应
    val id:Long by delegate2
}

fun main() {
    val delegate2 = Delegate2()
    val entrustedPropertyTest1Main = EntrustedPropertyTest1Main(delegate2)
    entrustedPropertyTest1Main.name = "Kotlin"

    println("name = ${entrustedPropertyTest1Main.name}, id = ${entrustedPropertyTest1Main.id}")

    println()

    delegate2.value = 666L

    println("after change, name = ${entrustedPropertyTest1Main.name}, id = ${entrustedPropertyTest1Main.id}")
}

class Delegate1 {
    private var value = ""

    // thisRef 是属性所在的类对象
    // property 是固定的类型，比如KMutableProperty1Impl
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("""setValue() thisRef.type is
            ${
            if (thisRef != null) {
                thisRef::class.java.simpleName
            } else {
                "null"
            }
        }""")

        println("""setValue() property.type is
            ${
            if (property != null) {
                property::class.java.simpleName
            } else {
                "null"
            }
        }""")

        println("setValue() value = $value")

        this.value = value
    }

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("""getValue() thisRef.type is
            ${
            if (thisRef != null) {
                thisRef::class.java.simpleName
            } else {
                "null"
            }
        }""")

        println("""getValue() property.type is
            ${
            if (property != null) {
                property::class.java.simpleName
            } else {
                "null"
            }
        }""")

        return this.value
    }
}

class Delegate2{
    var value = 233L

    operator fun getValue(thisRef: Any?, property: KProperty<*>):Long{
        return value
    }
}