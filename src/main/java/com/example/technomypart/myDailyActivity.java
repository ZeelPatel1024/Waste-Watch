package com.example.technomypart;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class myDailyActivity {
    String date;
    int numItems;
    ArrayList<String> itemsType = new ArrayList<>();

    public myDailyActivity(String d, int nI){

        date = d;
        numItems = nI;

//        itemsType.add("E-waste");
//        itemsType.add("Recycling");
//        itemsType.add("E-waste");
//        itemsType.add("Compost");
    }

    public String findmostCommon(){
        Collections.sort(itemsType);

        int count = 0;
        int temp = 0;
        String typeMax = "na";
        for (int i = 0; i < itemsType.size()-1; i++) {
            if (itemsType.get(i).equals(itemsType.get(i+1))){
               count++;

               if (temp < count){
                   temp = count;
                   typeMax = itemsType.get(i);
               }
            }
        }
        return typeMax;
    }

    public ArrayList<String> getItemsType() {
        return itemsType;
    }

    public void setItemsType(ArrayList<String> itemsType) {
        this.itemsType = itemsType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumItems() {
        return numItems;
    }

    public void setNumItems(int numItems) {
        this.numItems += numItems;
    }
}
