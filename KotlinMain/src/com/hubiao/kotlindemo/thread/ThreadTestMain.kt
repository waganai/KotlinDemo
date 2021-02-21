package com.hubiao.kotlindemo.thread

import java.lang.Thread.currentThread
import java.lang.Thread.sleep
import kotlin.concurrent.thread

class ThreadTestMain {
}

fun main() {
    val thread1 = thread(start = true, name = "thread1") {
        var count = 0
        while (count < 10) {
            println("${currentThread().name}: count = $count")
            sleep(1000)
            count++
        }
    }

    val thread2 = Thread {
        var count = 0
        while (count < 5) {
            println("${currentThread().name}: count = $count")
            sleep(1000)
            count++
        }
    }

    thread2.start()

    val thread3 = object : Thread() {
        override fun run() {
            var count = 0
            while (count < 8) {
                println("${currentThread().name}: count = $count")
                sleep(1000)
                count++
            }
        }
    }

    thread3.start()
}