package com.example.technomypart;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class seeDatabase extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_database);

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);

        TextView nameOfPicChosenSD = (TextView) findViewById(R.id.nameOfPicChosenSD);

        if (text.equals("recycling")){
            nameOfPicChosenSD.setText("Recycling Database");
        }
        if (text.equals("compost")){
            nameOfPicChosenSD.setText("Compost Database");
        }
        if (text.equals("e-waste")){
            nameOfPicChosenSD.setText("E-waste Database");
        }
        if (text.equals("medical waste")){
            nameOfPicChosenSD.setText("Medical Waste Database");
        }



    }
}