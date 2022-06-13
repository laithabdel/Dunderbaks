package com.android.dunderbaks.core.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.PopupWindow
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.android.dunderbaks.R
import com.android.dunderbaks.core.adapter.MenuItemAdapter.MenuItemViewHolder
import com.android.dunderbaks.core.model.MenuItem


class MenuItemAdapter(private val context: Context?, private val menuItemList: List<MenuItem?>) : RecyclerView.Adapter<MenuItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuItemViewHolder {
        val view = LayoutInflater.from(context)
                .inflate(R.layout.model_menuitem, parent, false)

        return MenuItemViewHolder(view, parent)
    }

    override fun onBindViewHolder(holder: MenuItemViewHolder, position: Int) {
        holder.bind(position)

    }

    override fun getItemCount(): Int {
        return menuItemList.size
    }

    inner class MenuItemViewHolder(itemView: View, parent: ViewGroup) : RecyclerView.ViewHolder(itemView) {

        private val name: TextView = itemView.findViewById(R.id.menuItemName)
        private val image: ImageView = itemView.findViewById(R.id.menuItemImage)
        private val parent by lazy { parent }

        @SuppressLint("ClickableViewAccessibility")
        fun bind(position: Int) {
            val menuItem = menuItemList[position]
            val card: CardView = itemView.findViewById(R.id.menuItemCard)

            card.setOnClickListener {
                val popUpView: View = LayoutInflater.from(itemView.context)
                    .inflate(R.layout.popup_window, parent, false)

                //add sub views to set text and image

                val popUpImg = popUpView.findViewById<ImageView>(R.id.menuItemImage)
                if (menuItem != null) {
                    popUpImg.setImageResource(menuItem.resID)
                }

                val popUpName: TextView = popUpView.findViewById(R.id.menuItemName)
                val popUpDescription: TextView = popUpView.findViewById(R.id.menuItemDescription)
                val popUpPrice: TextView = popUpView.findViewById(R.id.menuItemPrice)

                popUpName.text = menuItem?.name
                popUpDescription.text = menuItem?.description
                popUpPrice.text = menuItem?.price

                val width = LinearLayout.LayoutParams.WRAP_CONTENT
                val height = LinearLayout.LayoutParams.WRAP_CONTENT
                val focusable = true

                val popupWindow = PopupWindow(popUpView, width, height, focusable)

                popupWindow.animationStyle = R.style.Animation
                popupWindow.showAtLocation(itemView, Gravity.CENTER, 0, 0)


                popUpView.setOnTouchListener { _, _ ->
                    popupWindow.dismiss()
                    true
                }
            }


                name.text = menuItem?.name
            if (menuItem != null) {
                image.setImageResource(menuItem.resID)
            }
        }
    }
}
