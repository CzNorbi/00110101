package hu.unideb.inf.model;

import java.io.Serializable;

public class CarParts implements Serializable {

    private Level hood;
    private Level frDoor;
    private Level brDoor;
    private Level blDoor;
    private Level flDoor;
    private Level trunk;
    private Level roof;
    private Level fWindshield;
    private Level bWindshield;
    private Level frWheel;
    private Level flWheel;
    private Level brWheel;
    private Level blWheel;

    public enum Level {
        NONE,
        MINOR,
        MODERATE,
        SEVERE
    }

    public CarParts() {
        this.hood = Level.NONE;
        this.frDoor = Level.NONE;
        this.brDoor = Level.NONE;
        this.blDoor = Level.NONE;
        this.flDoor = Level.NONE;
        this.trunk = Level.NONE;
        this.roof = Level.NONE;
        this.fWindshield = Level.NONE;
        this.bWindshield = Level.NONE;
        this.frWheel = Level.NONE;
        this.flWheel = Level.NONE;
        this.brWheel = Level.NONE;
        this.blWheel = Level.NONE;
    }

    public static Level next(Level currLevel) {
        Level[] levels = Level.values();
        return levels[(currLevel.ordinal() + 1) % 4];
    }

    public Level getHood() {
        return hood;
    }

    public void setHood(Level hood) {
        this.hood = hood;
    }

    public Level getFrDoor() {
        return frDoor;
    }

    public void setFrDoor(Level frDoor) {
        this.frDoor = frDoor;
    }

    public Level getBrDoor() {
        return brDoor;
    }

    public void setBrDoor(Level brDoor) {
        this.brDoor = brDoor;
    }

    public Level getBlDoor() {
        return blDoor;
    }

    public void setBlDoor(Level blDoor) {
        this.blDoor = blDoor;
    }

    public Level getFlDoor() {
        return flDoor;
    }

    public void setFlDoor(Level flDoor) {
        this.flDoor = flDoor;
    }

    public Level getTrunk() {
        return trunk;
    }

    public void setTrunk(Level trunk) {
        this.trunk = trunk;
    }

    public Level getRoof() {
        return roof;
    }

    public void setRoof(Level roof) {
        this.roof = roof;
    }

    public Level getfWindshield() {
        return fWindshield;
    }

    public void setfWindshield(Level fWindshield) {
        this.fWindshield = fWindshield;
    }

    public Level getbWindshield() {
        return bWindshield;
    }

    public void setbWindshield(Level bWindshield) {
        this.bWindshield = bWindshield;
    }

    public Level getFrWheel() {
        return frWheel;
    }

    public void setFrWheel(Level frWheel) {
        this.frWheel = frWheel;
    }

    public Level getFlWheel() {
        return flWheel;
    }

    public void setFlWheel(Level flWheel) {
        this.flWheel = flWheel;
    }

    public Level getBrWheel() {
        return brWheel;
    }

    public void setBrWheel(Level brWheel) {
        this.brWheel = brWheel;
    }

    public Level getBlWheel() {
        return blWheel;
    }

    public void setBlWheel(Level blWheel) {
        this.blWheel = blWheel;
    }
}
