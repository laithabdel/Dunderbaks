package com.android.dunderbaks.core.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.dunderbaks.R
import com.android.dunderbaks.core.adapter.MenuItemAdapter
import com.android.dunderbaks.core.data.MenuData
import com.android.dunderbaks.core.model.MenuItem

class MenuFragment : Fragment() {

    private var rvAppetizers: RecyclerView? = null
    private var rvAmerApps: RecyclerView? = null
    private var rvSoupsSalads: RecyclerView? = null
    private var rvDinnersWithSides: RecyclerView? = null
    private var rvDinnersWithoutSides: RecyclerView? = null
    private var rvSides: RecyclerView? = null
    private var rvSpecialtySand: RecyclerView? = null
    private var rvClassicSand: RecyclerView? = null
    private var rvSausages: RecyclerView? = null
    private var rvDessert: RecyclerView? = null
    private var rvVegetarian: RecyclerView? = null
    private var rvSoftDrinks: RecyclerView? = null
    private var rvKids: RecyclerView? = null

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val root = inflater.inflate(R.layout.fragment_menu, container, false)

        rvAppetizers = root.findViewById(R.id.rvAppetizers)
        rvAmerApps = root.findViewById(R.id.rvAmerApp)
        rvSoupsSalads = root.findViewById(R.id.rvSoupsSalads)
        rvDinnersWithSides = root.findViewById(R.id.rvDinnerWithSides)
        rvDinnersWithoutSides = root.findViewById(R.id.rvDinnerWithoutSides)
        rvSides = root.findViewById(R.id.rvSides)
        rvSpecialtySand = root.findViewById(R.id.rvSpecialtySand)
        rvClassicSand = root.findViewById(R.id.rvClassicSand)
        rvSausages = root.findViewById(R.id.rvSausages)
        rvDessert = root.findViewById(R.id.rvDesserts)
        rvVegetarian = root.findViewById(R.id.rvVegetarian)
        rvSoftDrinks = root.findViewById(R.id.rvSoftDrinks)
        rvKids = root.findViewById(R.id.rvKids)

        val menuData = MenuData()

        setupRecyclerView(rvAppetizers, menuData.appetizers, root)
        setupRecyclerView(rvAmerApps, menuData.amerAppetizers, root)
        setupRecyclerView(rvSoupsSalads, menuData.soupsSalads, root)
        setupRecyclerView(rvDinnersWithSides, menuData.dinnersWithSides, root)
        setupRecyclerView(rvDinnersWithoutSides, menuData.dinnersWithoutSides, root)
        setupRecyclerView(rvSides, menuData.sides, root)
        setupRecyclerView(rvSpecialtySand, menuData.specialtySand, root)
        setupRecyclerView(rvClassicSand, menuData.classicSand, root)
        setupRecyclerView(rvSausages, menuData.sausages, root)
        setupRecyclerView(rvDessert, menuData.dessert, root)
        setupRecyclerView(rvVegetarian, menuData.vegetarian, root)
        setupRecyclerView(rvSoftDrinks, menuData.softDrinks, root)
        setupRecyclerView(rvKids, menuData.kids, root)

        return root
    }

    private fun setupRecyclerView(rv: RecyclerView?, menuItemList: List<MenuItem?>, view: View) {
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(view.context, RecyclerView.HORIZONTAL, false)
        rv!!.layoutManager = layoutManager
        val adapter = MenuItemAdapter(view.context, activity, menuItemList)
        rv.adapter = adapter
    }
}