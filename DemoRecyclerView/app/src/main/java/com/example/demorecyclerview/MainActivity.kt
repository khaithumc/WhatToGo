package com.example.demorecyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import entities.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var listStudents : MutableList<Student> = arrayListOf()
    lateinit var adapter:StudentAdapter
    lateinit var  recyclerView: RecyclerView

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = listStudent

        for (i in 1 .. 50) {
            if(i % 2 == 0) {
                listStudents.add(Student("Student name ${i}", 1995 + (i%2)))
            } else {
                listStudents.add(Student("Studentfdgddddddddddddddddddd name ${i}", 1995 + (i%2)))
            }

        }
        adapter = StudentAdapter(this, listStudents)

        recyclerView.layoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        //recyclerView.layoutManager =  LinearLayoutManager(this,
        //    LinearLayout.VERTICAL, false)

        //recyclerView.layoutManager = GridLayoutManager(this, 2)

        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter
}
}



