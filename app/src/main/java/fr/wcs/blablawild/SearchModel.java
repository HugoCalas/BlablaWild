package fr.wcs.blablawild;

/**
 * Created by wilder on 12/03/18.
 */

public class SearchModel {
    String departure;
    String destination;
    String date;

    public SearchModel(String departure, String destination, String date) {
        this.departure = departure;
        this.destination = destination;
        this.date = date;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public String getDate() {
        return date;
    }
}
