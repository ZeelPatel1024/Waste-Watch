package com.example.technomypart;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class addDailyAmountScreen extends AppCompatActivity {

    ArrayList<myDailyActivity> myDailyActivity = new ArrayList<>();
    int myImg;
    public static final String EXTRA_TEXT = "com.example.technomypart.EXTRA_TEXT";//need for passing varibales between views

    String name;
    String cat;
    String expTime;
    String brand;
    String link;
    int img;

    int amountAdd;
    int rating;
    String date;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_daily_amount_screen);
        RecyclerView recyclerView = findViewById(R.id.showDailyActivityRecyclerView);


        Bundle extras = getIntent().getExtras();

        if (extras.getBoolean("sendInfo") == true){

            name = extras.getString("name");
            cat = extras.getString("cat");
            expTime = extras.getString("avgExpTime");
            brand = extras.getString("brand");
            link = extras.getString("link");
            img = extras.getInt("img");
            date = extras.getString("fullDate");

            if (myDailyActivity.size() == 0){
                myDailyActivity.add(new myDailyActivity(date,1));
                System.out.println("worksll");
            }else{
                for (int i = 0; i < myDailyActivity.size(); i++) {
                    if (myDailyActivity.get(i).getDate().equals(date)){
                        myDailyActivity.get(i).setNumItems(1);
                        System.out.println(myDailyActivity.get(i).getNumItems());
                    }else{
                        myDailyActivity.add(new myDailyActivity(date,1));
                        System.out.println("works");
                    }
                }
            }


            if (myDailyActivity.size() > 0){
                myDailyActivity.get(myDailyActivity.size()-1).getItemsType().add(cat);
            }

            myAdapter myadapter = new myAdapter(this,myDailyActivity, myImg,"one");
            recyclerView.setAdapter(myadapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

        }




    }

    public void clickedOnAddEntry(View view){
        startActivity(new Intent(addDailyAmountScreen.this,addEntryScreen.class));
    }

    public void clickedOnCalanderIcon(View view){
        startActivity(new Intent(addDailyAmountScreen.this,monthlyCalanderScreen.class));
    }

    public void clickedRecylingPic(View view){
        Intent intent = new Intent(this, infoAboutItems.class);
        intent.putExtra(EXTRA_TEXT,"recycling");
        startActivity(intent);
    }

    public void clickedMedWastePic(View view){
        Intent intent = new Intent(this, infoAboutItems.class);
        intent.putExtra(EXTRA_TEXT,"medWaste");
        startActivity(intent);
    }

    public void clickedCompostPic(View view){
        Intent intent = new Intent(this, infoAboutItems.class);
        intent.putExtra(EXTRA_TEXT,"compost");
        startActivity(intent);
    }

    public void clickedEWastePic(View view){
        Intent intent = new Intent(this, infoAboutItems.class);
        intent.putExtra(EXTRA_TEXT,"eWaste");
        startActivity(intent);
    }


}