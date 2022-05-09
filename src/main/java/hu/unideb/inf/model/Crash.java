package hu.unideb.inf.model;

import java.io.File;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Crash implements Serializable {
    private Person personA;
    private Person personB;
    private Car carA;
    private Car carB;
    private String commentA;
    private String commentB;
    private String crashAddress;
    private LocalDateTime dateOfCrash;
    private List<File> filesA;
    private List<File> filesB;

    public Crash(Person personA, Person personB, Car carA, Car carB, String commentA, String commentB, String crashAddress, LocalDateTime dateOfCrash,
                 List<File> filesA, List<File> filesB) {
        this.personA = personA;
        this.personB = personB;
        this.carA = carA;
        this.carB = carB;
        this.commentA = commentA;
        this.commentB = commentB;
        this.crashAddress = crashAddress;
        this.dateOfCrash = dateOfCrash;
        this.filesA = filesA;
        this.filesB = filesB;
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

    public List<File> getFilesA() {
        return filesA;
    }

    public void setFilesA(List<File> filesA) {
        this.filesA = filesA;
    }

    public List<File> getFilesB() {
        return filesB;
    }

    public void setFilesB(List<File> filesB) {
        this.filesB = filesB;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %s és %s %s: %s - %s %s",
                personA.getLastName(), personA.getFirstName(), carA.getLicensePlate(),
                personB.getLastName(), personB.getFirstName(), carB.getLicensePlate(),
                crashAddress, dateOfCrash.format(DateTimeFormatter.ofPattern("yyyy MM dd - HH:mm")));
    }
}
