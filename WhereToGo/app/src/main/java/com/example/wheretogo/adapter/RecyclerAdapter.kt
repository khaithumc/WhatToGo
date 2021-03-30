package com.example.wheretogo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.wheretogo.R
import com.example.wheretogo.entities.Item
import com.example.wheretogo.fragment.HomeTabFragment
import kotlinx.android.synthetic.main.recycler_item.*


class RecyclerAdapter(var listItems: List<Item>, var mContext: Context?) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context:Context = parent.context
        var inflater: LayoutInflater = LayoutInflater.from(context)

        var view: View = inflater.inflate(R.layout.recycler_item, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listItems.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var item: Item = listItems.get(position)
        holder.titleItem.text = item.titleItem
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var titleItem: TextView
        var readMoreButton: Button

        init {
            titleItem = itemView.findViewById(R.id.titleItem)
            readMoreButton = itemView.findViewById(R.id.readMoreButton)

            readMoreButton.setOnClickListener { }
        }
    }
}