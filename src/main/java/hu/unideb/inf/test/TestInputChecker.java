package hu.unideb.inf.test;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import hu.unideb.inf.model.Car;
import hu.unideb.inf.model.CarParts;
import hu.unideb.inf.model.Crash;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hu.unideb.inf.model.Person;
import org.junit.jupiter.api.Test;

import javax.persistence.Persistence;

public class TestInputChecker
{ // Majd ide dolgozz tovabb Mate aztan bemergeljuk a mainbe
    public static void main(String[] args) {
        testPerson();
        testCar();
        testCrash();
    }

    @Test
    public static void testPerson(){
        String testFirstName = "Vicc";
        String testLastName = "Elek";
        LocalDate testDateOfBirth = LocalDate.of(2002,03, 15);
        String testDrivingLicenseNumber = "AB689654";
        String testAddress = "Kassai Ut 26";
        String testTelNum = "06204567898";

        Person testPerson = new Person(testFirstName, testLastName, testDateOfBirth,
                testDrivingLicenseNumber, testAddress, testTelNum);

        assertEquals(testFirstName, testPerson.getFirstName());
        assertEquals(testLastName, testPerson.getLastName());
        assertEquals(testDateOfBirth, testPerson.getDateOfBirth());
        assertEquals(testDrivingLicenseNumber, testPerson.getDrivingLicenseNumber());
        assertEquals(testAddress, testPerson.getAddress());
        assertEquals(testTelNum,testPerson.getTelNum());
        

    }

    @Test
    public static void testCar() {
        String testBrand = "Peugeot";
        String testType = "307";
        String testLP = "ABC-007";
        String testInsurer = "NN";
        CarParts testPart = new CarParts();

        Car testCar = new Car(testBrand, testType, testLP, testInsurer, testPart);

        assertEquals(testCar.getBrand(), testBrand);
        assertEquals(testCar.getType(), testType);
        assertEquals(testCar.getLicensePlate(), testLP);
        assertEquals(testCar.getNameOfInsurer(), testInsurer);

        System.out.println("OK testCar");
    }

    @Test
    public static  void testCrash(){
        Person personA = new Person("Teszt", "Elek", LocalDate.of(2002, 03, 15),
                "AB890734","Kassai Ut 26", "06304444333");
        Person personB = new Person("Mikorka", "Kalman", LocalDate.of(2002,03,15),
                "CD890678", "Kassai Ut 26", "06304444333");
        Car carA = new Car("BMW", "M3", "ASD-123", "NN", new CarParts());
        Car carB = new Car("Audi", "A6", "DSA-321", "Casco", new CarParts());
        String commentA = "Semmi.";
        String commentB = "Semmi.";
        String crashAddr = "Kassai Ut 26";
        LocalDateTime date = LocalDateTime.now();
        List<File> filesA = null;
        List<File> filesB = null;

        Crash testCrash = new Crash(personA, personB, carA, carB, commentA, commentB,
                        crashAddr, date, filesA, filesB);

        assertEquals(testCrash.getPersonA(), personA);
        assertEquals(testCrash.getPersonB(), personB);
        assertEquals(testCrash.getCarA(), carA);
        assertEquals(testCrash.getCarB(), carB);
        assertEquals(testCrash.getCommentA(), commentA);
        assertEquals(testCrash.getCommentB(), commentB);
        assertEquals(testCrash.getCrashAddress(), crashAddr);
        assertEquals(testCrash.getDateOfCrash(), date);
        assertEquals(testCrash.getFilesA(), filesA);
        assertEquals(testCrash.getFilesB(), filesB);

        System.out.println("CrashTest OK");
    }

}
