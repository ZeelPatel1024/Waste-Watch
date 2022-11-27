package com.example.technomypart;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.CalendarView;

public class monthlyCalanderScreen extends AppCompatActivity {

    private static final String TAG = "monthlyCalanderScreen";
    public static final String EXTRA_TEXT = "com.example.technomypart.EXTRA_TEXT";//need for passing varibales between views


    private CalendarView myCalanderView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monthly_calander_screen);

        myCalanderView = (CalendarView) findViewById(R.id.calendarView);

        myCalanderView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String date = (i1 + 1) + "/" + i2 + "/" + i;

                Intent intent = new Intent(monthlyCalanderScreen.this,clickedOnDayOnCalanderShowProgress.class);
                intent.putExtra(EXTRA_TEXT,date);
                startActivity(intent);
            }
        });

    }
}