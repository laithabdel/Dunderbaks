package com.android.dunderbaks.core.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.dunderbaks.core.model.MenuItem;

import java.util.List;

public class MenuItemAdapter extends RecyclerView.Adapter<MenuItemAdapter.MenuItemViewHolder> {
    public MenuItemAdapter(Context context, List<MenuItem> menuItemList) {
    }

    @NonNull
    @Override
    public MenuItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MenuItemViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MenuItemViewHolder extends RecyclerView.ViewHolder{

        public MenuItemViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
