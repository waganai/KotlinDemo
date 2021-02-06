package com.hubiao.kotlindemo.basis.control

class IfTestMain {
}

fun main() {
    ifFunction1(1, 10)
}

fun ifFunction1(var1: Int, var2: Int) {
    val result = "The max's square add min value in $var1 and $var2 is " + if (var1 >= var2) {
//        run {
            var max = var1 * var1
            max += var2
            max
//        }
    } else {
//        run {
            var max = var2 * var2
            max += var1
            max
//        }
    }

    println(result)
}