package hu.unideb.inf.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Crash {
    private Person personA;
    private Person personB;
    private Car carA;
    private Car carB;
    private String commentA;
    private String commentB;
    private String crashAddress;
    private LocalDateTime dateOfCrash;
    // TODO: kép tárolása

    public Crash(Person personA, Person personB, Car carA, Car carB, String commentA, String commentB, String crashAddress, LocalDateTime dateOfCrash) {
        this.personA = personA;
        this.personB = personB;
        this.carA = carA;
        this.carB = carB;
        this.commentA = commentA;
        this.commentB = commentB;
        this.crashAddress = crashAddress;
        this.dateOfCrash = dateOfCrash;
    }

    public Person getPersonA() {
        return personA;
    }

    public void setPersonA(Person personA) {
        this.personA = personA;
    }

    public Person getPersonB() {
        return personB;
    }

    public void setPersonB(Person personB) {
        this.personB = personB;
    }

    public Car getCarA() {
        return carA;
    }

    public void setCarA(Car carA) {
        this.carA = carA;
    }

    public Car getCarB() {
        return carB;
    }

    public void setCarB(Car carB) {
        this.carB = carB;
    }

    public String getCommentA() {
        return commentA;
    }

    public void setCommentA(String commentA) {
        this.commentA = commentA;
    }

    public String getCommentB() {
        return commentB;
    }

    public void setCommentB(String commentB) {
        this.commentB = commentB;
    }

    public String getCrashAddress() {
        return crashAddress;
    }

    public void setCrashAddress(String crashAddress) {
        this.crashAddress = crashAddress;
    }

    public LocalDateTime getDateOfCrash() {
        return dateOfCrash;
    }

    public void setDateOfCrash(LocalDateTime dateOfCrash) {
        this.dateOfCrash = dateOfCrash;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %s és %s %s: %s - %s %s",
                personA.getLastName(), personA.getFirstName(), carA.getLicensePlate(),
                personB.getLastName(), personB.getFirstName(), carB.getLicensePlate(),
                crashAddress, dateOfCrash.format(DateTimeFormatter.ofPattern("yyyy MM dd - HH:mm")));
    }
}
