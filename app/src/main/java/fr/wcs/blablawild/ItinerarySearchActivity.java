package fr.wcs.blablawild;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Parcel;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ItinerarySearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary_search);

        final Calendar myCalendar = Calendar.getInstance();


        Button buttonSend = findViewById(R.id.buttonSearch);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String depart = "departure";
                String desti = "destination";

                EditText departure = findViewById(R.id.editText_depart);
                EditText destination = findViewById(R.id.editText_desti);
                EditText date = findViewById(R.id.etDate);

                String depart2 = departure.getText().toString();
                String desti2 = destination.getText().toString();
                String getdate = date.getText().toString();


                if (depart2.equals("") || desti2.equals("")) {


                    Toast.makeText(ItinerarySearchActivity.this, "Please fill your departure and destination", Toast.LENGTH_SHORT).show();

                } else {

                    Intent intentSearchModel = new Intent(ItinerarySearchActivity.this, ItineraryListActivity.class);
                    intentSearchModel.putExtra("fiche", new SearchModel(depart2, desti2, getdate));

                    startActivity(intentSearchModel);
                }

            }
        });


        final EditText datePicker = findViewById(R.id.etDate);
        final DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel(datePicker, myCalendar);
            }


        };

        datePicker.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new DatePickerDialog(ItinerarySearchActivity.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });


    }


    private void updateLabel(EditText editText, Calendar myCalendar) {
        String myFormat = "MM/dd/yy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        editText.setText(sdf.format(myCalendar.getTime()));
    }
}

