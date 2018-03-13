package fr.wcs.blablawild;

import android.content.Intent;
import android.os.Parcel;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ItineraryListActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary_list);





        //Tableau à insérer dans la listview avec adapter
            ListView listTrip = findViewById(R.id.list_trip);
            ArrayList<TripModel> results = new ArrayList<>();

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy-hh:mm");

            try {
                results.add(new TripModel("Eric", "Cartman", sdf.parse("21/02/2017-15:30"), 15));
                results.add(new TripModel("Stan", "Marsh", sdf.parse("21/02/2017-16:00"), 20));
                results.add(new TripModel("Kenny", "Broflovski", sdf.parse("21/02/2017-16:30"), 16));
                results.add(new TripModel("Kyle", "McCormick", sdf.parse("21/02/2017-17:00"), 40));
                results.add(new TripModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
            } catch (ParseException e) {
            }
            TripAdapter adapter = new TripAdapter(this, results);
            listTrip.setAdapter(adapter);


            //Intent pour afficher la date
            SearchModel intentSearchModel = getIntent().getExtras().getParcelable("fiche");


            Toast.makeText(ItineraryListActivity.this, intentSearchModel.getDate(), Toast.LENGTH_SHORT).show();

        //Intent pour modifier la toolbar


        String depart2 = intentSearchModel.getDeparture();
        String desti2 = intentSearchModel.getDestination();

        this.setTitle(depart2+" >> "+desti2);

    }


    }

