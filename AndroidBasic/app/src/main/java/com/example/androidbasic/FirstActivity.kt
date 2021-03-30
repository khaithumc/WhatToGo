package com.example.androidbasic

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {

    private val TAG = "FirstActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val buttonSetDate: Button = findViewById(R.id.buttonsetdate)

        buttonSetDate.setOnClickListener(View.OnClickListener {
           intent = Intent(this@FirstActivity, SecondActivity::class.java)
            startActivity(intent)
        })
    }

}