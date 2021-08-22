package com.android.dunderbaks.core.model;

public class MenuItem {

    String name;
    String price;
    String description;
    Integer resID;

    public MenuItem(String name, String price, String description, Integer resID) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.resID = resID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getResID() {
        return resID;
    }

    public void setResID(Integer resID) {
        this.resID = resID;
    }
}
