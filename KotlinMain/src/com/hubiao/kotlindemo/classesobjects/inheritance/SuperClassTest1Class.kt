package com.hubiao.kotlindemo.classesobjects.inheritance

open class SuperClassTest1Class(var name: String, val id: Long) {
    open var info: String = ""
    open val info1:String = "info1"
    open var status = SuperClassTest1ClassStatus()
    open var status1 = SuperClassTest1ClassStatusChild()
}

class SuperClassTest1ClassChild1() : SuperClassTest1Class("", 0) {
    override var info:String = "Kotlin"
    // 重写属性，类型那必须一致，即使是父类子类也不行
//    override  var status = SuperClassTest1ClassStatusChild()
//    override  var status1 = SuperClassTest1ClassStatus()
}

class SuperClassTest1ClassChild2() : SuperClassTest1Class("", 0) {
    override var info:String = "Kotlin"
    override var info1:String = "SuperClassTest1ClassChild2.info1"
}

open class SuperClassTest1ClassStatus() {
    var name = ""
}

class SuperClassTest1ClassStatusChild():SuperClassTest1ClassStatus() {

}