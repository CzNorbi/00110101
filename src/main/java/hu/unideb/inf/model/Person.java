package hu.unideb.inf.model;

import java.time.LocalDate;

public class Person {
    private String FirstName;
    private String LastName;
    private LocalDate DateOfBirth;
    private String CityOfBirth;
    private long LicenseNumber;
    private long ZipCode;
    private String City;
    private String Street;
    private long HouseNumber;

    public Person(String firstName, String lastName, LocalDate dateOfBirth, String cityOfBirth, long licenseNumber, long zipCode, String city, String street, long houseNumber) {
        FirstName = firstName;
        LastName = lastName;
        DateOfBirth = dateOfBirth;
        CityOfBirth = cityOfBirth;
        LicenseNumber = licenseNumber;
        ZipCode = zipCode;
        City = city;
        Street = street;
        HouseNumber = houseNumber;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getCityOfBirth() {
        return CityOfBirth;
    }

    public void setCityOfBirth(String cityOfBirth) {
        CityOfBirth = cityOfBirth;
    }

    public long getLicenseNumber() {
        return LicenseNumber;
    }

    public void setLicenseNumber(long licenseNumber) {
        LicenseNumber = licenseNumber;
    }

    public long getZipCode() {
        return ZipCode;
    }

    public void setZipCode(long zipCode) {
        ZipCode = zipCode;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public long getHouseNumber() {
        return HouseNumber;
    }

    public void setHouseNumber(long houseNumber) {
        HouseNumber = houseNumber;
    }
}
