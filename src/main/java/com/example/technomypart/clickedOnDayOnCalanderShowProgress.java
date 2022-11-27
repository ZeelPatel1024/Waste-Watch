package com.example.technomypart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class clickedOnDayOnCalanderShowProgress extends AppCompatActivity {

//    public TextView theDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clicked_on_day_on_calander_show_progress);

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);

        TextView theDate = (TextView) findViewById(R.id.theDate);

        theDate.setText(text);

    }
}