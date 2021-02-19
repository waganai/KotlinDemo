package com.hubiao.kotlindemo.classesobjects.special

enum class EnumClassTestClass {
    Java, Kotlin, Android
}

fun main() {
    val test1 = WeekDays.FRIDAY
    println("test1 = $test1")

    for (value in WeekDays.values()) {
        println("index = ${value.ordinal}, name = ${value.name}, value = $value")
    }

    val test2 = WeekDays.valueOf("FRIDAY")
    println("test2 = $test2")
    println("test1 == test2 is ${test1 == test2}")
    println("test1 === test2 is ${test1 === test2}")
}

enum class WeekDays(private val wname: String, private val index: Int) {
    MONDAY("星期一", 0),
    TUESDAY("星期二", 1),
    WEDNESDAY("星期三", 2),
    THURSDAY("星期四", 3),
    FRIDAY("星期五", 4);

    override fun toString(): String {
        return "weekdayName = $wname, weekDayIndex = $index"
    }
}