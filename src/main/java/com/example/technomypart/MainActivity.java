package com.example.technomypart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_TEXT = "com.example.technomypart.EXTRA_TEXT";//need for passing varibales between views

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickedOnAddDailyAmount(View view){

        Intent intent = new Intent(this, addDailyAmountScreen.class);
        intent.putExtra("sendInfo",false);
        startActivity(intent);

    }

    public void butCheckYourRecord(View view){
        startActivity(new Intent(MainActivity.this,checkYourRecord.class));
    }
    
    public void clickedRecylingPic(View view2){
        Intent intent = new Intent(this, seeDatabase.class);
        intent.putExtra(EXTRA_TEXT,"recycling");
//        intent.putExtra("sendInfo",false);
        startActivity(intent);
        
    }


    public void clickedCompostPic(View view2){
        Intent intent = new Intent(this, seeDatabase.class);
        intent.putExtra(EXTRA_TEXT,"compost");
//        intent.putExtra("sendInfo",false);
        startActivity(intent);
    }

    public void clickedEWastePic(View view3){
        Intent intent = new Intent(this, seeDatabase.class);
        intent.putExtra(EXTRA_TEXT,"e-waste");
//        intent.putExtra("sendInfo",false);
        startActivity(intent);
    }


    public void clickedMedWastePic(View view4){
        Intent intent = new Intent(this, seeDatabase.class);
        intent.putExtra(EXTRA_TEXT,"medical waste");
//        intent.putExtra("sendInfo",false);
        startActivity(intent);
    }


}