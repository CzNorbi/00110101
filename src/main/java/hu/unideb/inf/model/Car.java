package hu.unideb.inf.model;

import java.util.List;

public class Car {
    private String Brand;
    private String Type;
    private String LicensePlate;
    private String VIN;
    private List<CarPart> Parts;

    public Car(String brand, String type, String licensePlate, String VIN, List<CarPart> parts) {
        Brand = brand;
        Type = type;
        LicensePlate = licensePlate;
        this.VIN = VIN;
        Parts = CarPart.initCarPartList();
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getLicensePlate() {
        return LicensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        LicensePlate = licensePlate;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public List<CarPart> getParts() {
        return Parts;
    }
}
