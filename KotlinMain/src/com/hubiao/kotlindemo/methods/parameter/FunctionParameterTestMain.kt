package com.hubiao.kotlindemo.methods.parameter

class FunctionParameterTestMain {
}

fun main() {
    parameterFunction3("AAA")
    parameterFunction4("233", "BB", "CCC", var3 = "666")
}

fun parameterFunction1() {

}

fun parameterFunction2(var1: String = "var1", var2: String = "var2", var3: String = "var3") {
    println("parameterFunction2() var1 = $var1, var2 = $var2, var3 = $var3")
}

fun parameterFunction3(var1: String = "var1", var2: String = "var2", vararg var3: String) {
    println("parameterFunction4() var1 = $var1, var2 = $var2")
    for (i in var3.indices) {
        println("var3[$i] = ${var3[i]}")
    }
}

fun parameterFunction4(var1: String = "var1", vararg var2: String, var3: String = "var3") {
    println("parameterFunction4() var1 = $var1, var3 = $var3")
    for (i in var2.indices) {
        println("var2[$i] = ${var2[i]}")
    }
}