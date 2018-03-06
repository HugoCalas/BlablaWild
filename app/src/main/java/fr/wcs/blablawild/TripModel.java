package fr.wcs.blablawild;

import java.util.Date;

/**
 * Created by wilder on 06/03/18.
 */

public class TripModel {
        String firstname;
        String lastname;
        Date date;
        int prix;

    public TripModel(String firstname, String lastname, Date date, int prix) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.date = date;
        this.prix = prix;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}

