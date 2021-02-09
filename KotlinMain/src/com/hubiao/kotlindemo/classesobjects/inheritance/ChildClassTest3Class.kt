package com.hubiao.kotlindemo.classesobjects.inheritance

class ChildClassTest3Class : SuperClassTest1Class {
    var info2: String = ""

    constructor(name: String, id: Long, info2: String) : super(name, id) {
        this.info2 = "info2: $info2"
    }
}