package com.example.demorecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import entities.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var listStudents : MutableList<Student> = arrayListOf()
    lateinit var adapter:StudentAdapter
    lateinit var  recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = listStudent

        for (i in 1 .. 50) {
            listStudents.add(Student("Student name ${i}", 1995 + (i%2)))
        }
        adapter = StudentAdapter(this, listStudents)

        var linearLayoutManager:LinearLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = linearLayoutManager
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter

    }


}