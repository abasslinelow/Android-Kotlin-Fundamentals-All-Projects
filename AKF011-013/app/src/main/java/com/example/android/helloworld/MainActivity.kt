package com.example.android.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.view.*
import java.util.*

class MainActivity : AppCompatActivity() {


    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the Roll button using findViewById and the ID defined in activity_main.xml,
        // then add an event handler.
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    // Rolls the dice. Sets the image based on the number rolled.
    private fun rollDice() {

        // Generate random number 1-6
        val randomInt = Random().nextInt(6) + 1

        // Get the dice image element.
        diceImage = findViewById(R.id.dice_image)

        // Switch statement to point to the proper image in the dice image element.
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Set the dice image element to the proper image.
        diceImage.setImageResource(drawableResource)
    }
}
