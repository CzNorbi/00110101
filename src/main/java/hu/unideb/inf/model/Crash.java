package hu.unideb.inf.model;

import javafx.scene.image.Image;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Crash {
    private Person personA;
    private Person personB;
    private Car carA;
    private Car carB;
    private String commentA;
    private String commentB;
    private String crashAddress;
    private LocalDateTime dateOfCrash;
    private List<Image> imagesA;
    private List<Image> imagesB;

    public Crash(Person personA, Person personB, Car carA, Car carB, String commentA, String commentB, String crashAddress, LocalDateTime dateOfCrash,
                 List<Image> imagesA, List<Image> imagesB) {
        this.personA = personA;
        this.personB = personB;
        this.carA = carA;
        this.carB = carB;
        this.commentA = commentA;
        this.commentB = commentB;
        this.crashAddress = crashAddress;
        this.dateOfCrash = dateOfCrash;
        this.imagesA = imagesA;
        this.imagesB = imagesB;
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

    public List<Image> getImagesA() {
        return imagesA;
    }

    public void setImagesA(List<Image> imagesA) {
        this.imagesA = imagesA;
    }

    public List<Image> getImagesB() {
        return imagesB;
    }

    public void setImagesB(List<Image> imagesB) {
        this.imagesB = imagesB;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %s és %s %s: %s - %s %s",
                personA.getLastName(), personA.getFirstName(), carA.getLicensePlate(),
                personB.getLastName(), personB.getFirstName(), carB.getLicensePlate(),
                crashAddress, dateOfCrash.format(DateTimeFormatter.ofPattern("yyyy MM dd - HH:mm")));
    }
}
