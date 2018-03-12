package fr.wcs.blablawild;

/**
 * Created by wilder on 12/03/18.
 */

public class VehiclePlane extends VehicleAbstract {

    public int speed;

    public VehiclePlane(String brand, String model, int speed) {
        super(brand, model);
        this.speed = speed;
    }

    public String getDescription() {
        return brand + ", " + model + ", " + speed;
    }


}
