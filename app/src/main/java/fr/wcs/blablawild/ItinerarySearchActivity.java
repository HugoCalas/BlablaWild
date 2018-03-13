package fr.wcs.blablawild;

import android.content.Intent;
import android.os.Parcel;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Date;

public class ItinerarySearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary_search);

        final

        Button buttonSend = findViewById(R.id.buttonSearch);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String depart = "departure";
                String desti = "destination";

                EditText departure = findViewById(R.id.editText_depart);
                EditText destination = findViewById(R.id.editText_desti);
                EditText date = findViewById(R.id.etDate);

                String condition1 = departure.getText().toString();
                String condition2 = destination.getText().toString();
                String getdate = date.getText().toString();


                if (condition1.equals("") || condition2.equals("")) {


                    Toast.makeText(ItinerarySearchActivity.this, "Please fill your departure and destination", Toast.LENGTH_SHORT).show();

                }
                else {

                    Intent intentSearchModel = new Intent(ItinerarySearchActivity.this, ItineraryListActivity.class);
                    intentSearchModel.putExtra("fiche", new SearchModel(condition1, condition2, getdate));

                    startActivity(intentSearchModel);
                }

            }
        });

    }
}
