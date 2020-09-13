package com.jacksonfdam.codelabs.codelabs03

class NewDice(val numSides: Int = 6) {

    fun roll(): Int {
        val randomNumber = (1..numSides).random()
        return randomNumber
    }
}
