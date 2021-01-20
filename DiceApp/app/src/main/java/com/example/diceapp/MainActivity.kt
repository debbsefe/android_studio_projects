package com.example.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.diceapp.R.drawable.*

class MainActivity : AppCompatActivity() {
   private lateinit var diceOneImg : ImageView
    private lateinit var diceTwoImg : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceOneImg =  findViewById(R.id.dice_one)
        diceTwoImg =  findViewById(R.id.dice_two)
        val rollButton = findViewById<Button>(R.id.btn_roll_dice)

        rollButton.setOnClickListener {
            rollDiceOne()
            rollDiceTwo()
        }
    }

    private fun rollDiceOne(){

        val image =  when((1..6).random()){
            1 -> dice1
            2 -> dice2
            3 -> dice3
            4 -> dice4
            5 -> dice5
            6 -> dice6
           else -> dice_empty
       }
        diceOneImg.setImageResource(image)
    }

    private fun rollDiceTwo(){

        val image =  when((1..6).random()){
            1 -> dice1
            2 -> dice2
            3 -> dice3
            4 -> dice4
            5 -> dice5
            6 -> dice6
            else -> dice_empty
        }
        diceTwoImg.setImageResource(image)
    }
}