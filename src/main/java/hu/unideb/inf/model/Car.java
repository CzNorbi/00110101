package hu.unideb.inf.model;

import java.util.List;

public class Car {
    private String brand;
    private String type;
    private String licensePlate;
    private String nameOfInsurer;
    private final List<CarPart> carPartsList;

    public Car(String brand, String type, String licensePlate, String nameOfInsurer, List<CarPart> carPartsList) {
        this.brand = brand;
        this.type = type;
        this.licensePlate = licensePlate;
        this.nameOfInsurer = nameOfInsurer;
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

    public String getNameOfInsurer() {
        return nameOfInsurer;
    }

    public void setNameOfInsurer(String nameOfInsurer) {
        this.nameOfInsurer = nameOfInsurer;
    }

    public List<CarPart> getCarPartsList() {
        return carPartsList;
    }
}
