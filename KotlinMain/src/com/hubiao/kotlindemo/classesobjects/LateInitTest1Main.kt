package com.hubiao.kotlindemo.classesobjects

class LateInitTest1Main {
}

fun main() {
    val emp = Employee()

    println("emp.dept = ${emp.dept}")

    emp.dept = Department()

    println("emp.dept = ${emp.dept}")
}

class Employee {
    lateinit var dept: Department
}

class Department {
    var name = ""
    var no = 0

    override fun toString(): String  = "name = $name, no = $no"
}