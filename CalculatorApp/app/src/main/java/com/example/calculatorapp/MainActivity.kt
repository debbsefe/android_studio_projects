package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var editText: EditText
    private var number1: Float = 0.0f
    private var isPlus: Boolean = false
    private var isMinus: Boolean = false
    private var isDivide: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.number_edit_text)
    }

    fun operationFunction(view: View) {
        when (view.id) {
            R.id.button_one -> {
                numberClicked("1")
            }
            R.id.button_two -> {
                numberClicked("2")
            }
            R.id.button_three -> {
                numberClicked("3")
            }
            R.id.button_four -> {
                numberClicked("4")
            }
            R.id.button_five -> {
                numberClicked("5")
            }
            R.id.button_six -> {
                numberClicked("6")
            }
            R.id.button_seven -> {
                numberClicked("7")
            }
            R.id.button_eight -> {
                numberClicked("8")
            }
            R.id.button_nine -> {
                numberClicked("9")
            }
            R.id.button_zero -> {
                numberClicked("0")
            }
            R.id.button_dot -> {
                numberClicked(".")
            }
            R.id.button_clear -> {
                editText.setText("")
            }
            R.id.button_plus -> {
                plusClicked()
            }
            R.id.button_minus -> {
                minusClicked()
            }
            R.id.button_slash -> {
                divideClicked()
            }
            R.id.button_equal -> {
                equalClicked()
            }
        }
    }

    private fun numberClicked(numberClicked: String) {
        val number = editText.text.toString() + numberClicked
        editText.setText(number)
    }

    private fun plusClicked() {
        number1 = editText.text.toString().toFloat()
        editText.setText("")
        isPlus = true
    }

    private fun minusClicked() {
        number1 = editText.text.toString().toFloat()
        editText.setText("")
        isMinus = true
    }

    private fun divideClicked() {
        number1 = editText.text.toString().toFloat()
        editText.setText("")
        isDivide = true
    }

    private fun equalClicked() {
        fun plusClicked() {
            val number2 = editText.text.toString().toFloat()
            val result = number1 + number2
            editText.setText(result.toString())
            isPlus = false
        }

        fun minusClicked() {
            val number2 = editText.text.toString().toFloat()
            val result = number1 - number2
            editText.setText(result.toString())
            isMinus = false
        }

        fun divideClicked() {
            val number2 = editText.text.toString().toFloat()
            val result = number1 / number2
            editText.setText(result.toString())
            isDivide = false
        }
        when {
            isPlus -> {
                plusClicked()

            }
            isMinus -> {
                minusClicked()

            }
            isDivide -> {
                divideClicked()
            }
        }

    }

}