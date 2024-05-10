package org.example

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    println("0")
    runBlocking {
        launch { printTwo() }
        launch { println("1") }
    }
    println("3")
}

suspend fun printTwo() {
    delay(1000)
    println("2")
}
