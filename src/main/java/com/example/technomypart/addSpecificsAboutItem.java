package com.example.technomypart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class addSpecificsAboutItem extends AppCompatActivity {

    String name;
    String cat;
    String expTime;
    String brand;
    String link;
    int img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_specifics_about_item);

        Bundle extras = getIntent().getExtras();

        name = extras.getString("name");
        cat = extras.getString("catName");
        expTime = extras.getString("avgExpTime");
        brand = extras.getString("brand");
        link = extras.getString("link");
        img = extras.getInt("img");

        ImageView imgItem = (ImageView) findViewById(R.id.imgItm);

        TextView lblname = (TextView) findViewById(R.id.lblName);
        TextView lblExpTime = (TextView) findViewById(R.id.lblavgExpiTime);
        TextView lblBrand = (TextView) findViewById(R.id.lblBrand);
        TextView lblLink = (TextView) findViewById(R.id.lblLink);

        imgItem.setImageResource(img);

        lblname.setText(name);
        lblExpTime.setText(expTime);
        lblBrand.setText(brand);

        if (link.equals("none")){
            lblLink.setText("No Link");
        }

    }

    public void btnAddItem(View view){
        Intent intent = new Intent(this,addItemSpecificAmount.class);
        intent.putExtra("name",name);
        intent.putExtra("cat",cat);
        intent.putExtra("avgExpTime",expTime);
        intent.putExtra("brand",brand);
        intent.putExtra("link",link);
        intent.putExtra("img",img);
        startActivity(intent);
    }


}