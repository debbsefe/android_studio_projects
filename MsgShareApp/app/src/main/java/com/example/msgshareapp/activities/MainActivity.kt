  package com.example.msgshareapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log
import android.widget.Toast
import com.example.msgshareapp.R
import com.example.msgshareapp.showToast

  class MainActivity() : AppCompatActivity() {

      override fun onCreate(savedInstanceState: Bundle?) {
          super.onCreate(savedInstanceState )
          setContentView(R.layout.activity_main)

          btnShowToast.setOnClickListener {
              // Code
              Log.i("MainActivity", "Button was clicked !")
              showToast("Button was clicked !")
          }

          btnSendMsgToNextActivity.setOnClickListener {
              val message: String = etUserMessage.text.toString()
              val intent = Intent(this, SecondActivity::class.java)
              intent.putExtra("user_message", message)
              startActivity(intent)
          }

          btnShareToOtherApps.setOnClickListener {
              val message: String = etUserMessage.text.toString()
              val intent = Intent()
              intent.action = Intent.ACTION_SEND
              intent.putExtra(Intent.EXTRA_TEXT, message)
              intent.type = "text/plain"
              startActivity(Intent.createChooser(intent, "Share to :"))
          }

          btnRecyclerViewDemo.setOnClickListener {

              val intent = Intent(this, HobbiesActivity::class.java)
              startActivity(intent)
          }

 }}

