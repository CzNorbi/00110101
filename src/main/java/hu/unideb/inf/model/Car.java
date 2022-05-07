package hu.unideb.inf.model;

public class Car {
    private String brand;
    private String type;
    private String licensePlate;
    private String nameOfInsurer;
    private final CarParts parts;

    public Car(String brand, String type, String licensePlate, String nameOfInsurer, CarParts parts) {
        this.brand = brand;
        this.type = type;
        this.licensePlate = licensePlate;
        this.nameOfInsurer = nameOfInsurer;
        this.parts = parts;
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

    public CarParts getParts() {
        return parts;
    }
}
