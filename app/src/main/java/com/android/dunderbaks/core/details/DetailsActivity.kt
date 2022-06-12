package com.android.dunderbaks.core.details

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.android.dunderbaks.R
import com.android.dunderbaks.core.model.MenuItem

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val menuItem = intent.getSerializableExtra("MenuItem") as MenuItem?
        val name = findViewById<TextView>(R.id.item_name)
        val price = findViewById<TextView>(R.id.item_price)
        val itemImage = findViewById<ImageView>(R.id.item_image)
        val arrow = findViewById<ImageView>(R.id.back_img_view)
        itemImage.setImageResource(menuItem!!.resID)
        name.text = menuItem.name
        price.text = menuItem.price
        arrow.isClickable = true
        arrow.setOnClickListener { _: View? -> finish() }
    }
}