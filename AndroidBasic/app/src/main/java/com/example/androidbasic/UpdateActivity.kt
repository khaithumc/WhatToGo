package com.example.androidbasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class UpdateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update)

        val button:Button = findViewById(R.id.buttonSave)
        var editText:EditText = findViewById(R.id.editText)

        var content:String? = intent?.getStringExtra("content1")
        editText.setText(content)

        button.setOnClickListener(View.OnClickListener {
            setResultData()
            finish()
        })
    }

    private fun setResultData() {
        var data:Intent = Intent()
        val editText:EditText = findViewById(R.id.editText)
        var content:String = editText.text.toString()
        data.putExtra("content", content)
        val codeResult:Int = 1
        setResult(codeResult, data)

    }
}