package com.jacksonfdam.codelabs.codelab05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
## Learn more

-   [Vocabulary for Android Basics in Kotlin](https://developer.android.com/courses/android-basics-kotlin/android-basics-kotlin-vocab)
-   [Kotlin: Control flow](https://kotlinlang.org/docs/reference/control-flow.html)
-   [Kotlin: when](https://play.kotlinlang.org/byExample/02_control_flow/01_When)
-   [Conditionals](https://developer.android.com/kotlin/learn#conditionals)

 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myFirstDice = Dice(6)
        val rollResult = myFirstDice.roll()
        val luckyNumber = 4

        when (rollResult) {
            luckyNumber -> println("You won!")
            1 -> println("So sorry! You rolled a 1. Try again!")
            2 -> println("Sadly, you rolled a 2. Try again!")
            3 -> println("Unfortunately, you rolled a 3. Try again!")
            4 -> println("No luck! You rolled a 4. Try again!")
            5 -> println("Don't cry! You rolled a 5. Try again!")
            6 -> println("Apologies! you rolled a 6. Try again!")
        }
    }
}
