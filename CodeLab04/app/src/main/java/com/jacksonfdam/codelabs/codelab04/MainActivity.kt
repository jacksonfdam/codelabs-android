package com.jacksonfdam.codelabs.codelab04

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        val resultTextView: TextView = findViewById(R.id.textView)

        val dice = Dice(6)
        val diceRoll = dice.roll()
        val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
        resultTextView.text = diceRoll.toString()
        toast.show()
    }
}
