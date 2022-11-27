package com.example.technomypart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class infoAboutItems extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_about_items);
        int myImg;
        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);

        TextView categoryName = (TextView) findViewById(R.id.categoryName);
        TextView decriptionOfCategory = (TextView) findViewById(R.id.decriptionOfCategory);

        ImageView imageShowCat = (ImageView)findViewById(R.id.imageShowCat);

        if (text.equals("recycling")){
            categoryName.setText("Recycling");
            decriptionOfCategory.setText("Recycling is the process of collecting and processing materials that would otherwise be thrown away as trash and turning them into new products. Recycling can benefit your community and the environment. Reduces the amount of waste sent to landfills and incinerators Recycling also helps to conserves natural resources such as timber, water and minerals. It increases economic security by tapping a domestic source of materials prevents pollution by reducing the need to collect new raw materials. Recycling helps to save energy and support American manufacturing and conserves valuable resources. Along with that it helps create jobs in the recycling and manufacturing industries in the United States");
            myImg = R.drawable.recyclelogo;
            imageShowCat.setImageResource(myImg);

        }
        if (text.equals("compost")){
            categoryName.setText("Compost");
            decriptionOfCategory.setText("Compost is organic material that can be added to soil to help plants grow. Food scraps and yard waste together currently make up more than 30 percent of what we throw away, and could be composted instead. Making compost keeps these materials out of landfills where they take up space and release methane, a potent greenhouse gas. You can compost browns - This includes materials such as dead leaves, branches, and twigs. Greens - This includes materials such as grass clippings, vegetable waste, fruit scraps, and coffee grounds. Water - Having the right amount of water, greens, and browns is important for compost development.");
            myImg = R.drawable.composticon;
            imageShowCat.setImageResource(myImg);
        }
        if (text.equals("eWaste")){
            categoryName.setText("E-Waste");
            decriptionOfCategory.setText("“E-waste”, “electronic waste”, “e-scrap” and “end-of-life electronics” are terms often used to describe used electronics that are nearing the end of their useful life, and are discarded, donated or given to a recycler. Though “e-waste” is the commonly used term, EPA considers e-waste to be a subset of used electronics and recognizes the inherent value of these materials that can be reused, refurbished or recycled to minimize the actual waste that might end up in a landfill or improperly disposed in an unprotected dump site either in the US or abroad.");
            myImg = R.drawable.ewastelogo;
            imageShowCat.setImageResource(myImg);
        }
        if (text.equals("medWaste")) {
            categoryName.setText("Medical Waste");
            decriptionOfCategory.setText("Medical waste is a subset of wastes generated at health care facilities, such as hospitals, physicians' offices, dental practices, blood banks, and veterinary hospitals/clinics, as well as medical research facilities and laboratories. Generally, medical waste is healthcare waste that that may be contaminated by blood, body fluids or other potentially infectious materials and is often referred to as regulated medical waste.  ");
            myImg = R.drawable.medwatelogo;
            imageShowCat.setImageResource(myImg);
        }
    }
}