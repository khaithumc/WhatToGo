package com.example.wheretogo.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wheretogo.R
import com.example.wheretogo.adapter.RecyclerAdapter
import com.example.wheretogo.entities.Item
import kotlinx.android.synthetic.main.fragment_hometab.*

class HomeTabFragment : Fragment() {

    var listItem: MutableList<Item> = arrayListOf()
    lateinit var adapter: RecyclerAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        listItem.add(Item(1, "Day la title 1"))
        listItem.add(Item(2, "Day la title 2"))
        listItem.add(Item(3, "Day la title 3"))
        listItem.add(Item(4, "Day la title 4"))
        listItem.add(Item(5, "Day la title 5"))
        listItem.add(Item(6, "Day la title 6"))
        listItem.add(Item(7, "Day la title 7"))
        listItem.add(Item(8, "Day la title 8"))

        adapter = RecyclerAdapter(listItem, context)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hometab, container, false)
    }

}