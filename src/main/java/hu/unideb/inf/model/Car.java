package hu.unideb.inf.model;

import java.time.Year;
import java.util.List;

public class Car {
    private String brand;
    private String type;
    private String licensePlate;
    private Year year;
    private final List<CarPart> carPartsList;

    public Car(String brand, String type, String licensePlate, Year year, List<CarPart> carPartsList) {
        this.brand = brand;
        this.type = type;
        this.licensePlate = licensePlate;
        this.year = year;
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

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public List<CarPart> getCarPartsList() {
        return carPartsList;
    }
}
