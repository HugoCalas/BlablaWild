package fr.wcs.blablawild;

/**
 * Created by wilder on 12/03/18.
 */

public class VehicleBoat extends VehicleAbstract {

    public int hours;

    public VehicleBoat(String brand, String model, int hours) {
        super(brand, model);
        this.hours = hours;
    }

    public String getDescription() {
        return brand + ", " + model + ", " + hours;
    }
}
