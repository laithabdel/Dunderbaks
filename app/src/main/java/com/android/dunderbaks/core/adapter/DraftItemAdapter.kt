package com.android.dunderbaks.core.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.dunderbaks.R
import com.android.dunderbaks.core.model.TapListItem

class DraftItemAdapter(private val context: Context?, private val draftItemList: List<TapListItem?>) : RecyclerView.Adapter<DraftItemAdapter.DraftItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DraftItemViewHolder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.model_draftitem, parent, false)

        return DraftItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: DraftItemViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return draftItemList.size
    }

    inner class DraftItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val name: TextView = itemView.findViewById(R.id.draftItemName)
        private val description: TextView = itemView.findViewById(R.id.draftItemDescription)

        fun bind(position: Int) {
            val draftItem = draftItemList[position]

            if (draftItem != null) {
                name.text = draftItem.name
                description.text = draftItem.description
            }
        }
    }
}