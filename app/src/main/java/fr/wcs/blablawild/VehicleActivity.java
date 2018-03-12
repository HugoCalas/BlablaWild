package fr.wcs.blablawild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class VehicleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle);

        final Spinner spin = findViewById(R.id.list_vehicle);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Button send = findViewById(R.id.Send);
                final EditText marque = findViewById(R.id.Brand);
                final EditText modele = findViewById(R.id.Model);
                final EditText km = findViewById(R.id.Kilometers);
                final EditText heures = findViewById(R.id.Hours);
                final EditText vit = findViewById(R.id.Speed);

                if (position == 0) {

                    heures.setVisibility(View.GONE);
                    km.setVisibility(View.GONE);
                    vit.setVisibility(View.GONE);
                    send.setEnabled(false);
                }

                if (position == 1) {

                    heures.setVisibility(View.GONE);
                    km.setVisibility(View.VISIBLE);
                    vit.setVisibility(View.GONE);
                    send.setEnabled(true);

                    send.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            String brandcar = marque.getText().toString();
                            String modelcar = modele.getText().toString();

                            String kilom = km.getText().toString();
                            int kilometer = Integer.parseInt(kilom);

                            VehicleCar carDescription = new VehicleCar(brandcar, modelcar, kilometer);

                            Toast.makeText(VehicleActivity.this,carDescription.getDescription(), Toast.LENGTH_SHORT).show();

                        }
                    });
                }

                if (position == 2) {

                    heures.setVisibility(View.VISIBLE);
                    km.setVisibility(View.GONE);
                    vit.setVisibility(View.GONE);
                    send.setEnabled(true);

                    send.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            String brandboat = marque.getText().toString();
                            String modelboat = modele.getText().toString();

                            String hrs = km.getText().toString();
                            int hours = Integer.parseInt(hrs);

                            VehicleBoat boatDescription = new VehicleBoat(brandboat, modelboat, hours);

                            Toast.makeText(VehicleActivity.this,boatDescription.getDescription(), Toast.LENGTH_SHORT).show();
                        }
                    });
                }
                if (position == 3) {

                    heures.setVisibility(View.GONE);
                    km.setVisibility(View.GONE);
                    vit.setVisibility(View.VISIBLE);

                    send.setEnabled(true);

                    send.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            String brandplane = marque.getText().toString();
                            String modelplane = modele.getText().toString();

                            String speed = vit.getText().toString();
                            int spd = Integer.parseInt(speed);

                            VehiclePlane planeDescription = new VehiclePlane(brandplane, modelplane, spd);

                            Toast.makeText(VehicleActivity.this,planeDescription.getDescription(), Toast.LENGTH_SHORT).show();
                        }
                    });
                }



            }

            @Override
            public void onNothingSelected (AdapterView < ? > adapterView){


            }


        });
    }
}
