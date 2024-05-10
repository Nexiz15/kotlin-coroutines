package org.example

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val job = launch {
            repeat(10) { i ->
                println("job 1: I'm sleeping $i ...")
                delay(500L)
            }
        }
        launch {
            repeat(3) { i ->
                println("job 2")
                delay(500L)
            }
            println("job 2 done")
            job.join()
            println("job 1 done")
        }
    }
}
