package com.example.androidbasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    val RESULT_UPDATE_ACTIVITY:Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val button:Button = findViewById(R.id.buttonedit)
        val textView:TextView = findViewById(R.id.textView)

        button.setOnClickListener(View.OnClickListener {
            intent = Intent(this@SecondActivity, UpdateActivity::class.java)
            intent.putExtra("content1", textView.text)

            startActivityForResult(intent, RESULT_UPDATE_ACTIVITY)
        })
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when(requestCode) {
            RESULT_UPDATE_ACTIVITY -> {
                var content: String? = data?.getStringExtra("content")
                var textView:TextView = findViewById(R.id.textView)
                textView.setText(content)
            }
        }
    }
}