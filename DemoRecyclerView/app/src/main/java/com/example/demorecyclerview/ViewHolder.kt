package com.example.demorecyclerview

import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var studentName: TextView
    var birthDay: TextView
    var buttonDetail: Button

    init {
        studentName = itemView.findViewById(R.id.studentName)
        birthDay = itemView.findViewById(R.id.studentBirthDay)
        buttonDetail = itemView.findViewById(R.id.detailButton) as Button
       // buttonDetail.setOnClickListener { v -> Toast.makeText(v?.context, "${studentName.text} | Demo function", Toast.LENGTH_SHORT).show() }

        buttonDetail.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(v?.context, "${studentName.text} | Demo function", Toast.LENGTH_SHORT).show()
                println("sdfsdfsdftgsdfS")
            }
        })
    }

}