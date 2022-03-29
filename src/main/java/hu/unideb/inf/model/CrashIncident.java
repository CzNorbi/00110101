package hu.unideb.inf.model;

import java.time.LocalDate;
import java.util.List;

public class CrashIncident {

    private String clientName;
    private String clientCity;
    private String clientPhoneNumber;
    private String licensePLate;
    private String carBrand;
    private String carType;
    private String carPowertrain;
    private LocalDate dateOfCrash;

    // A List a legjobb megoldás?
    private List<CarPart> carParts;

    public CrashIncident(String clientName, String clientCity, String clientPhoneNumber, String licensePLate, String carBrand, String carType, String carPowertrain, LocalDate dateOfCrash, List<CarPart> carParts) {
        this.clientName = clientName;
        this.clientCity = clientCity;
        this.clientPhoneNumber = clientPhoneNumber;
        this.licensePLate = licensePLate;
        this.carBrand = carBrand;
        this.carType = carType;
        this.carPowertrain = carPowertrain;
        this.dateOfCrash = dateOfCrash;
        this.carParts = carParts;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientCity() {
        return clientCity;
    }

    public void setClientCity(String clientCity) {
        this.clientCity = clientCity;
    }

    public String getClientPhoneNumber() {
        return clientPhoneNumber;
    }

    public void setClientPhoneNumber(String clientPhoneNumber) {
        this.clientPhoneNumber = clientPhoneNumber;
    }

    public String getLicensePLate() {
        return licensePLate;
    }

    public void setLicensePLate(String licensePLate) {
        this.licensePLate = licensePLate;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarPowertrain() {
        return carPowertrain;
    }

    public void setCarPowertrain(String carPowertrain) {
        this.carPowertrain = carPowertrain;
    }

    public LocalDate getDateOfCrash() {
        return dateOfCrash;
    }

    public void setDateOfCrash(LocalDate dateOfCrash) {
        this.dateOfCrash = dateOfCrash;
    }

    public List<CarPart> getCarParts() {
        return carParts;
    }

    public void setCarParts(List<CarPart> carParts) {
        this.carParts = carParts;
    }
}
