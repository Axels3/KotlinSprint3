package org.example.lesson1_1

fun main() {
    val year: Int = 1961
    var hour: Int = 9
    var minute: Int = 7

    println(year)
    println("%02d".format(hour))
    println("%02d".format(minute))

    hour = 10
    minute = 55

    println("${hour}:${minute}")
}