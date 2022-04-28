package hu.unideb.inf.model;

import java.util.List;

public class Car {
    private String brand;
    private String type;
    private String licensePlate;
    private String VIN;
    private final List<CarPart> carPartsList;

    public Car(String brand, String type, String licensePlate, String VIN, List<CarPart> parts) {
        this.brand = brand;
        this.type = type;
        this.licensePlate = licensePlate;
        this.VIN = VIN;
        this.carPartsList = CarPart.initCarPartList();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public List<CarPart> getParts() {
        return carPartsList;
    }
}
