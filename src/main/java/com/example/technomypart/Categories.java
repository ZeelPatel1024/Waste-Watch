package com.example.technomypart;

import java.util.ArrayList;

public class Categories {
    private String name;
    private int amount;
    private int img;
    ArrayList<Items> myItems = new ArrayList<>();

    public Categories(String n,int am, int im){
        name = n;
        amount = am;
        img = im;

    }

    public int getImg() {
        return img;
    }

    public ArrayList<Items> getMyItems() {
        return myItems;
    }

    public void setMyItems(ArrayList<Items> myItems) {
        this.myItems = myItems;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
