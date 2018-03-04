package fr.wcs.blablawild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ItineraryListActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary_list);


        String depart = "departure";
        String desti = "destination";


        Intent intent2 = getIntent();

        String depart2 = intent2.getStringExtra(depart);
        String desti2 = intent2.getStringExtra(desti);

        getSupportActionBar().setTitle(depart2+" >> "+desti2);


    }
}
