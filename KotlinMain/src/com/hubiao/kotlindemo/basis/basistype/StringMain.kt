package com.hubiao.kotlindemo.basis.basistype

class StringMain {
}

fun main() {
    stringFunction()
}

fun stringFunction() {
    val str = "This is a String"

    for (i in str) {
        print(i)
    }

    val text =
            """       
for (i in "foo")
    print(i)
    """

    println("\ntext =\n  $text")
    println("$text.length = ${text.length}")
}