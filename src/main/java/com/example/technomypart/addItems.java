package com.example.technomypart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.BundleCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class addItems extends AppCompatActivity {
    ArrayList<Categories> myCategories = new ArrayList<>();
    private myAdapter.RecyclerViewClickListener listener;
    int myImg;
    int ind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_items);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewFindYourItem);

        Bundle extras = getIntent().getExtras();

        ind = extras.getInt("indx");

        myCategories.add(new Categories("Recycling",0,R.drawable.recyclelogo));
        myCategories.add(new Categories("E-Waste",0,R.drawable.ewastelogo));
        myCategories.add(new Categories("Compost",0,R.drawable.composticon));
        myCategories.add(new Categories("Med-Waste",0,R.drawable.medwatelogo));

        //String name, int avgExpTime, String brand, String link
        myCategories.get(0).getMyItems().add(new Items("Paper","none","International Paper Company","none",R.drawable.papers));
        myCategories.get(0).getMyItems().add(new Items("Cans","none","campbells","none",R.drawable.cans));
        myCategories.get(0).getMyItems().add(new Items("Cardboard","2 years","WestRock Company","none",R.drawable.cardboard));
        myCategories.get(0).getMyItems().add(new Items("Tissue","5 years","Kleenex","none",R.drawable.tissues));
        myCategories.get(0).getMyItems().add(new Items("Toilet Paper","none","Charmin","none",R.drawable.toiletpaper));
        myCategories.get(0).getMyItems().add(new Items("Pencils","none","Bic Pencils","none",R.drawable.pencils));

        myCategories.get(1).getMyItems().add(new Items("Batteries","5 yaers","Duracell","none",R.drawable.batteries));
        myCategories.get(1).getMyItems().add(new Items("Keyboards","10 - 30 years","Vortex Keyboards","none",R.drawable.keyboards));
        myCategories.get(1).getMyItems().add(new Items("Cables","20 years","Havells India Ltd","none",R.drawable.cables));

        myCategories.get(2).getMyItems().add(new Items("Onions","6 years","Yellow Onions","none",R.drawable.onions));
        myCategories.get(2).getMyItems().add(new Items("Tomatos","7 days to 2 weeks","la Valle","none",R.drawable.tomatos));
        myCategories.get(2).getMyItems().add(new Items("Potatos","1 week","Idaho Potatos","none",R.drawable.potatos));

        myCategories.get(3).getMyItems().add(new Items("Pads","5 years","Always","none",R.drawable.pads));
        myCategories.get(3).getMyItems().add(new Items("Tooth brushes","3 to 4 months","Oran-B Pro-Health","none",R.drawable.toothbrushes));
        myCategories.get(3).getMyItems().add(new Items("Plastic Gloves","5 years","Care Plus","none",R.drawable.plasticgloves));

        setOnClickListener();
        myAdapter myadapter = new myAdapter(this,myCategories.get(ind).getMyItems(), myImg,"three",0, listener,0);
        recyclerView.setAdapter(myadapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void setOnClickListener() {
        listener = new myAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(),addSpecificsAboutItem.class);
                intent.putExtra("name",myCategories.get(ind).getMyItems().get(position).getName());
                intent.putExtra("catName",myCategories.get(ind).getName());
                intent.putExtra("avgExpTime",myCategories.get(ind).getMyItems().get(position).getAvgExpTime());
                intent.putExtra("brand",myCategories.get(ind).getMyItems().get(position).getBrand());
                intent.putExtra("link",myCategories.get(ind).getMyItems().get(position).getLink());
                intent.putExtra("img",myCategories.get(ind).getMyItems().get(position).getImg());
                startActivity(intent);
            }
        };
    }


}