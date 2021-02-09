package com.hubiao.kotlindemo.classesobjects.inheritance

class ChildClassTest4Class : InterfaceTest1Class, InterfaceTest2Class {
    override fun function2(arg1: List<Int>) {
        println("""ChildClass4TestClass.function2("$arg1")""")
    }

    override fun function3(arg1: List<String>) {
        println("""ChildClass4TestClass.function3("$arg1")""")
    }

    override fun function2(arg1: Int) {
        println("""ChildClass4TestClass.function2("$arg1")""")
    }

    override fun function3(arg1: String) {
        println("""ChildClass4TestClass.function3("$arg1")""")
    }

    override fun function1() {
        println("""ChildClass4TestClass.function1()""")
    }
}