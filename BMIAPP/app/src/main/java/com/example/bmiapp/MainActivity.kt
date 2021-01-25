package com.example.bmiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickButton(view: View) {
        var height = bmi_height.text.toString()
        var weight = bmi_weight.text.toString()
        if (height.isEmpty() || weight.isEmpty()){
            height = "0"
            weight = "0"
        }

        val heightSquared = height.toFloat() * height.toFloat()
        val result = (weight.toFloat() / heightSquared) * 10000
        result_image_view.visibility = View.VISIBLE
        result_text_view.visibility = View.VISIBLE
        result_text_view.text = result.toString()
        setImageView(result)
    }

        private fun setImageView(result: Float){
            when {
                result < 18.5 -> {
                    result_image_view.setImageResource(R.drawable.ic_underweight)
                }
                result < 24.9 -> {
                    result_image_view.setImageResource(R.drawable.ic_healthy)
                }
                result < 29.9 -> {
                    result_image_view.setImageResource(R.drawable.ic_overweight)
                }
                else -> {
                    result_image_view.setImageResource(R.drawable.ic_obesity)
                }
            }

    }


}