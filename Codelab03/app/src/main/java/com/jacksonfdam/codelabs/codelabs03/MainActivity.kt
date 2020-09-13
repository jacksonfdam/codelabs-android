package com.jacksonfdam.codelabs.codelabs03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    /*
    Tip: Notice that it does not say IntRange in this definition, in the same way you did not have to specify Int or String when creating a variable for an integer or a string. Most of the time, the system can figure out what data type you intend.

    For example, the system interprets this:

    val diceRange = 1..6

    as this:

    val diceRange: IntRange = 1..6

    Tips about ranges:

    Ranges can be between any integers. The following are valid ranges: 3..46, 0..270, -6..+6, -10..-4.

    You can call functions directly on a range, for example: (1..6).random()

    https://codelabs.developers.google.com/codelabs/basic-android-kotlin-training-create-dice-roller-in-kotlin/#9

    See too:
    https://www.wired.com/2016/05/mathematical-challenge-of-designing-the-worlds-most-complex-120-sided-dice/
     */
    private val diceRange = 1..6

    override fun onCreate(savedInstanceState: Bundle?) {
        val randomNumber = diceRange.random()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Random number: $randomNumber")

        val myFirstDice = Dice()
        println(myFirstDice.sides)

        myFirstDice.roll()

        val diceRoll = myFirstDice.roll()

        println("Your ${myFirstDice.sides} sided dice rolled $diceRoll!")

        val mySecondDice = Dice()
        val secondDiceRoll = mySecondDice.roll()
        println("Your ${mySecondDice.sides} sided dice rolled ${secondDiceRoll}!")

        mySecondDice.sides = 20
        println("Your ${mySecondDice.sides} sided dice rolled ${mySecondDice.roll()}!")

        val myThirdDice = NewDice(6)
        val thirdDiceRoll = myThirdDice.roll()
        println("Your ${myThirdDice.numSides} sided dice rolled ${thirdDiceRoll}!")

        val myForthdDice = NewDice(20)
        println("Your ${myForthdDice.numSides} sided dice rolled ${myForthdDice.roll()}!")
    }
}
