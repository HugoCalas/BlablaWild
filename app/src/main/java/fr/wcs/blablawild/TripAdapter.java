package fr.wcs.blablawild;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Created by wilder on 06/03/18.
 */





public class TripAdapter extends ArrayAdapter<TripModel> {

    public TripAdapter(Context context, ArrayList<TripModel> trips) {
        super(context, 0, trips);
    }


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

             // Get the data item for this position
             TripModel trip = getItem(position);

            // Check if an existing view is being reused, otherwise inflate the view
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_trip, parent, false);
            }

            // Lookup view for data population
            TextView first = (TextView) convertView.findViewById(R.id.tvFirst);
            TextView last = (TextView) convertView.findViewById(R.id.tvLast);
            TextView date = (TextView) convertView.findViewById(R.id.tvDate);
            TextView prix = (TextView) convertView.findViewById(R.id.tvPrix);

            SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy hh:mm");
            String date2 = date1.format(trip.getDate());
            String apm = date2 + " PM";
            date.setText(apm);

            String formatPrix =String.valueOf(trip.getPrix());
            String prixFinal = "$ " + formatPrix;
            prix.setText(prixFinal);

            // Populate the data into the template view using the data object
            first.setText(trip.getFirstname());
            last.setText(trip.getLastname());

            // Return the completed view to render on screen
            return convertView;
        }

}