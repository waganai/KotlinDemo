package com.hubiao.kotlindemo.thread

import kotlin.concurrent.thread

class ThreadControllerTestMain {
}

fun main() {
//    joinTest()
    yieldTest()
}

fun joinTest() {
    val thread1 = thread(start = true, name = "ThreadControllerTestMain.thread1", block = {
        var count = 0
        while (count < 10) {
            println("${Thread.currentThread().name}: count = $count")
            Thread.sleep(1000)
            count++
        }
        println("${Thread.currentThread().name}: finish")
    })

    val thread2 = object : Thread() {
        override fun run() {
            var count = 0
            while (count < 5) {
                println("${Thread.currentThread().name}: count = $count")
                Thread.sleep(1000)
                count++
            }

            thread1.join()

            println("${currentThread().name}: finish")
        }
    }

    thread2.start()
}

fun yieldTest() {
    val thread1 = thread(start = true, priority = 3, name = "ThreadControllerTestMain.thread1", block = {
        var count = 0
        while (count < 10) {
            println("${Thread.currentThread().name}: count = $count")
            Thread.sleep(1000)
            count++
        }
        println("${Thread.currentThread().name}: finish")
    })

    val thread2 = object : Thread() {
        override fun run() {
            var count = 0
            while (count < 5) {
                println("${Thread.currentThread().name}: count = $count")
                Thread.sleep(1000)
                count++
            }

            yield()

            println("${currentThread().name}: yield()")

            while (count < 10) {
                println("${Thread.currentThread().name}: count = $count")
                Thread.sleep(1000)
                count++
            }

            println("${currentThread().name}: finish")
        }
    }

    thread2.priority = 3

    thread2.start()
}