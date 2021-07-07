package com.android.dunderbaks.ui.details;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.dunderbaks.R;
import com.android.dunderbaks.ui.model.MenuItem;

import org.w3c.dom.Text;

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
        itemImage.setImageResource(menuItem.getImageURL());
        name.setText(menuItem.getName());
        price.setText(menuItem.getPrice());
        arrow.setClickable(true);
        arrow.setOnClickListener(view -> finish());
    }
}