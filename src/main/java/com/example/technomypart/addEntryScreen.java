package com.example.technomypart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class addEntryScreen extends AppCompatActivity {
    int myImg;
    ArrayList<Categories> myCategories = new ArrayList<>();
    private myAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_entry_screen);

        RecyclerView recyclerView = findViewById(R.id.recyclerAdd);

        myCategories.add(new Categories("Recycling",0,R.drawable.recyclelogo));
        myCategories.add(new Categories("E-Waste",0,R.drawable.ewastelogo));
        myCategories.add(new Categories("Compost",0,R.drawable.composticon));
        myCategories.add(new Categories("Med-Waste",0,R.drawable.medwatelogo));


        setOnClickListener();
        myAdapter myadapter = new myAdapter(this,myCategories, myImg,"two",0, listener);
        recyclerView.setAdapter(myadapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void setOnClickListener() {
        listener = new myAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(),addItems.class);
                intent.putExtra("indx",position);
                startActivity(intent);
            }
        };
    }

    public void customAddButton(View v){
        startActivity(new Intent(addEntryScreen.this,customAddCategory.class));
    }

}