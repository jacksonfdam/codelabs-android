package com.jacksonfdam.codelabs.codelab05

class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}

