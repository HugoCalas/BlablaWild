package fr.wcs.blablawild;

/**
 * Created by wilder on 12/03/18.
 */

public class VehicleCar extends VehicleAbstract {

    public int kilometer;

    public VehicleCar(String brand, String model, int kilometer) {
        super(brand, model);
        this.kilometer = kilometer;
    }

    public String getDescription() {
        return brand + ", " + model + ", " + kilometer;
    }





}
