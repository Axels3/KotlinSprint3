package org.example.lesson2

fun main() {
    val ballStudent1: Byte = 3
    val ballStudent2: Byte = 4
    val ballStudent3: Byte = 3
    val ballStudent4: Byte = 5

    val statisticBall = ((ballStudent1 + ballStudent2 + ballStudent3 + ballStudent4) / 4.0)
    println("%.2f".format((ballStudent1 + ballStudent2 + ballStudent3 + ballStudent4) / 4.0))

}