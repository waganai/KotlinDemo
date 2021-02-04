package com.hubiao.kotlindemo.methods

class Method1Main {
    fun main() {
        "Let Method".let{
            print("\n" +it + "\n")
            println(it)
        }

        with("With Method"){
            print("\n" +this + "\n")
            println(this)
        }

        "Run Method".run{
            print("\n" +this + "\n")
            println(this)
        }

        "Apply method".apply {
            print("\n" + this + "\n")
            println(this)
        }

        "Also method".also {
            print("\n" + this + "\n")
            println(this)
        }
    }
}