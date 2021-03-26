package com.example.mephimreview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mephimreview.adapter.PagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addControl()
    }

    private fun addControl() {
        var adapter : PagerAdapter = PagerAdapter(supportFragmentManager)
        viewPager.adapter = adapter

        tabLayout.setupWithViewPager(viewPager)
    }
}