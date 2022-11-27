package com.example.technomypart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class addItemSpecificAmount extends AppCompatActivity {

    String name;
    String cat;
    String expTime;
    String brand;
    String link;
    int img;

    int amount;
    float rating;
    String day;

    Button button;
    RatingBar ratingStars;
    TextView addAmount;

    int todayDate;
    int todayMonth;
    int todayYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item_specific_amount);

        Bundle extras = getIntent().getExtras();

        name = extras.getString("name");
        cat = extras.getString("cat");
        expTime = extras.getString("avgExpTime");
        brand = extras.getString("brand");
        link = extras.getString("link");
        img = extras.getInt("img");

        button = findViewById(R.id.butSubmitInfo);
        ratingStars = findViewById(R.id.ratingBar);
        addAmount = findViewById(R.id.addAmount);

        ratingStars.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {

                rating = v;

//                System.out.println("this is v "+ v);

            }
        });

        Date date = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(formatter.format(date));

        day = formatter.format(date);

        todayDate = Integer.parseInt(day.substring(0,2));
        todayMonth = Integer.parseInt(day.substring(3,5));
        todayYear = Integer.parseInt(day.substring(6));
        System.out.println(todayDate);
        System.out.println(todayMonth);
        System.out.println(todayYear);


    }

    public void btnClickedOnSubmitInfo(View view){

        amount = Integer.parseInt(addAmount.getText().toString());

        System.out.println(amount);

        Intent intent = new Intent(this, addDailyAmountScreen.class);
        intent.putExtra("sendInfo", true);
        intent.putExtra("rating", rating);
        intent.putExtra("amount", amount);

        intent.putExtra("fullDate", day);
//        intent.putExtra("day", todayDate);
//        intent.putExtra("month", todayMonth);
//        intent.putExtra("year", todayYear);

        startActivity(intent);

    }
}