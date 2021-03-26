package com.example.demorecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import entities.Student

class StudentAdapter(var mContext:Context, var mListStudents:List<Student>): RecyclerView.Adapter<StudentAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : ViewHolder {
        var context:Context = parent.context
        var inflater:LayoutInflater = LayoutInflater.from(context)

        //nap layout bieu dien phan tu sinh vien
        var studentView:View = inflater.inflate(R.layout.student_item, parent, false)

        return ViewHolder(studentView)
    }

    override fun getItemCount(): Int {
        return mListStudents.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var student:Student = mListStudents.get(position)

        holder.studentName.text = student.name
        holder.birthDay.text = student.birthDay.toString()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var studentName: TextView
        var birthDay: TextView
        var buttonDetail: Button

        init {
            studentName = itemView.findViewById(R.id.studentName)
            birthDay = itemView.findViewById(R.id.studentBirthDay)
            buttonDetail = itemView.findViewById(R.id.detailButton) as Button
            // buttonDetail.setOnClickListener { v -> Toast.makeText(v?.context, "${studentName.text} | Demo function", Toast.LENGTH_SHORT).show() }

            buttonDetail.setOnClickListener { v ->
                Toast.makeText(v?.context, "${studentName.text} | Demo function", Toast.LENGTH_SHORT).show()
                println("sdfsdfsdftgsdfS")
            }
        }

    }



}