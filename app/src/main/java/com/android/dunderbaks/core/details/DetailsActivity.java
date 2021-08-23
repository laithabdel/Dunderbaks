package com.android.dunderbaks.core.details;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.dunderbaks.R;
import com.android.dunderbaks.core.model.MenuItem;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        MenuItem menuItem = (MenuItem) getIntent().getSerializableExtra("MenuItem");
        TextView name = findViewById(R.id.item_name);
        TextView price = findViewById(R.id.item_price);
        ImageView itemImage = findViewById(R.id.item_image);
        ImageView arrow = findViewById(R.id.back_img_view);
        itemImage.setImageResource(menuItem.getResID());
        name.setText(menuItem.getName());
        price.setText(menuItem.getPrice());
        arrow.setClickable(true);
        arrow.setOnClickListener(view -> finish());
    }
}