package com.example.numbergameapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var number: Int = 5
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        printQuestion()
    }

    fun clickDownwardArrow(view: View) {
        when (number) {
            5 -> {
                guessNumber(3)

            }
            3 -> {
                guessNumber(2)

            }
            2 -> {
                guessNumber(1)

            }
            8 -> {
                guessNumber(7)

            }
            7 -> {
                guessNumber(6)

            }
        }
    }

    fun clickSuccess(view: View) {

        question_text_view.visibility = View.INVISIBLE
        result_text_view.visibility = View.VISIBLE
        result_text_view.text = String.format(resources.getString(R.string.str_success), number)
    }

    fun clickUpwardArrow(view: View) {
        when (number) {
            3 -> {
                guessNumber(4)

            }
            5 -> {
                guessNumber(8)

            }
            8 -> {
                guessNumber(9)

            }
            9 -> {
                guessNumber(10)

            }
        }
    }

    fun clickResetButton(view: View) {
        question_text_view.visibility = View.VISIBLE
        result_text_view.visibility = View.INVISIBLE
        number = 5
        printQuestion()
    }

    private fun printQuestion() {
        question_text_view.text = String.format(resources.getString(R.string.str_question), number)
    }

    private fun guessNumber(myNumber: Int) {
        number = myNumber
        printQuestion()
    }
}