package com.android.dunderbaks.core.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.dunderbaks.R
import com.android.dunderbaks.core.adapter.MenuItemAdapter.MenuItemViewHolder
import com.android.dunderbaks.core.model.MenuItem

class MenuItemAdapter(private val context: Context?, private val menuItemList: List<MenuItem?>) : RecyclerView.Adapter<MenuItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuItemViewHolder {
        val view = LayoutInflater.from(context)
                .inflate(R.layout.model_menuitem, parent, false)

        return MenuItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuItemViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return menuItemList.size
    }

    inner class MenuItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val name: TextView = itemView.findViewById(R.id.menuItemName)
        private val image: ImageView = itemView.findViewById(R.id.menuItemImage)

        fun bind(position: Int) {
            val menuItem = menuItemList[position]

            if (menuItem != null) {
                name.text = menuItem.name
                image.setImageResource(menuItem.resID)
            }
        }
    }
}