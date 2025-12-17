package org.example.lesson1_1

fun main() {

    val secondsInOrbit: Int = 6480
    val hours: Int = secondsInOrbit / 3600
    val minutes: Int = (secondsInOrbit - hours * 3600) / 60
    val seconds: Int = secondsInOrbit - hours * 3600 - minutes * 60


    //println(seconds)
    //println(minutes)
    println("%02d:%02d:%02d".format(hours, minutes, seconds))

}