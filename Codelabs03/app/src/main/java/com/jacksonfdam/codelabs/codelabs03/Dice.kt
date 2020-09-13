package com.jacksonfdam.codelabs.codelabs03

class Dice {
    var sides = 6

    fun roll(): Int {
        val randomNumber = (1..sides).random()
        println(randomNumber)

        return randomNumber
    }
}
