package com.hubiao.kotlindemo.methods.higherorderfunctions

class HigherOrderFunctions {
    companion object {
        fun higherFunction11(arg1: Int, block: () -> Unit) {
            println("input $arg1, ")
            block.invoke()
        }
    }

    fun function1(arg1: Int): () -> Unit {
        fun functionReference() {
            println("This is functionReference()")
        }

        var functionVariable = fun() {
            println("This is functionReference()")
        }

        if (arg1 == 1) {
            functionVariable = ::functionReference
        } else if (arg1 == 2) {
            functionVariable = {
                println("This is Lambda")
            }
        }

        return functionVariable
    }

    fun higherFunction1(arg1: Int, block: () -> Unit) {
        println("input $arg1, ")
        block.invoke()
    }

    // 高阶函数可以作为高阶函数的参数
    fun higherFunction2(block: (arg1: Int, innerBlock: () -> Unit) -> Unit, block2: () -> Unit) {
        block.invoke(1, block2)
    }

    // 高阶函数可以作为高阶函数的返回值
    fun higherFunction3(block: (arg1: Int, innerBlock: () -> Unit) -> Unit): (arg1: Int, innerBlock: () -> Unit) -> Unit {
        return block
    }
}

fun main() {
    val test1 = HigherOrderFunctions()
    test1.higherFunction1(0, test1.function1(0))
    test1.higherFunction1(1, test1.function1(1))
    test1.higherFunction1(2, test1.function1(2))

    // 类的成员方法和其伴生对象的方法，是可以作为高阶函数的参数的，注意引用方法
    test1.higherFunction2(test1::higherFunction1, test1.function1(0))
    test1.higherFunction3(HigherOrderFunctions::higherFunction11)(2, test1.function1(2))
}