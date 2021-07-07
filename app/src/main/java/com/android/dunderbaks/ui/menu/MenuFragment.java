package com.android.dunderbaks.ui.menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.dunderbaks.R;
import com.android.dunderbaks.ui.adapter.MenuItemAdapter;
import com.android.dunderbaks.ui.data.MenuData;
import com.android.dunderbaks.ui.model.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MenuFragment extends Fragment {

    RecyclerView rvAppetizers,
            rvAmerApps,
            rvSoupsSalads,
            rvDinnersWithSides,
            rvDinnersWithoutSides,
            rvSides,
            rvSpecialtySand,
            rvClassicSand,
            rvSausages,
            rvDessert,
            rvVegetarian,
            rvSoftDrinks,
            rvKids;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_menu, container, false);

        rvAppetizers = root.findViewById(R.id.rvAppetizers);
        rvAmerApps = root.findViewById(R.id.rvAmerApp);
        rvSoupsSalads = root.findViewById(R.id.rvSoupsSalads);
        rvDinnersWithSides = root.findViewById(R.id.rvDinnerWithSides);
        rvDinnersWithoutSides = root.findViewById(R.id.rvDinnerWithoutSides);
        rvSides = root.findViewById(R.id.rvSides);
        rvSpecialtySand = root.findViewById(R.id.rvSpecialtySand);
        rvClassicSand = root.findViewById(R.id.rvClassicSand);
        rvSausages = root.findViewById(R.id.rvSausages);
        rvDessert = root.findViewById(R.id.rvDesserts);
        rvVegetarian = root.findViewById(R.id.rvVegetarian);
        rvSoftDrinks = root.findViewById(R.id.rvSoftDrinks);
        rvKids = root.findViewById(R.id.rvKids);

        MenuData menuData = new MenuData();

        setupRecyclerView(rvAppetizers, menuData.getAppetizers(), root);
        setupRecyclerView(rvAmerApps, menuData.getAmerAppetizers(), root);
        setupRecyclerView(rvSoupsSalads, menuData.getSoupsSalads(), root);
        setupRecyclerView(rvDinnersWithSides, menuData.getDinnersWithSides(), root);
        setupRecyclerView(rvDinnersWithoutSides, menuData.getDinnersWithoutSides(), root);
        setupRecyclerView(rvSides, menuData.getSides(), root);
        setupRecyclerView(rvSpecialtySand, menuData.getSpecialtySand(), root);
        setupRecyclerView(rvClassicSand, menuData.getClassicSand(), root);
        setupRecyclerView(rvSausages, menuData.getSausages(), root);
        setupRecyclerView(rvDessert, menuData.getDessert(), root);
        setupRecyclerView(rvVegetarian, menuData.getVegetarian(), root);
        setupRecyclerView(rvSoftDrinks, menuData.getSoftDrinks(), root);
        setupRecyclerView(rvKids, menuData.getKids(), root);

        return root;
    }


    private void setupRecyclerView(RecyclerView rv, List<MenuItem> menuItemList, View view){
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(view.getContext(), RecyclerView.HORIZONTAL, false);
        rv.setLayoutManager(layoutManager);
        MenuItemAdapter adapter = new MenuItemAdapter(view.getContext(), menuItemList);
        rv.setAdapter(adapter);
    }
}