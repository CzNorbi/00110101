package hu.unideb.inf.model;

import java.util.ArrayList;
import java.util.List;

public class CarPart {

    private String partName;
    private Level damageLevel;

    public enum Level {
        NONE,
        MINOR,
        MODERATE,
        SEVERE
    }

    public static List<CarPart> initCarPartList() {
        List<CarPart> result = new ArrayList<>();
        result.add(new CarPart("hood", Level.NONE));
        result.add(new CarPart("frDoor", Level.NONE));
        result.add(new CarPart("brDoor", Level.NONE));
        result.add(new CarPart("blDoor", Level.NONE));
        result.add(new CarPart("flDoor", Level.NONE));
        result.add(new CarPart("trunk", Level.NONE));
        result.add(new CarPart("roof", Level.NONE));
        result.add(new CarPart("fWindshield", Level.NONE));
        result.add(new CarPart("bWindshield", Level.NONE));
        result.add(new CarPart("frWheel", Level.NONE));
        result.add(new CarPart("flWheel", Level.NONE));
        result.add(new CarPart("brWheel", Level.NONE));
        result.add(new CarPart("blWheel", Level.NONE));

        return result;
    }

    public CarPart(String partName, Level damageLevel) {
        this.partName = partName;
        this.damageLevel = damageLevel;
    }

    public String getPartName() {
        return partName;
    }

    public Level getDamageLevel() {
        return damageLevel;
    }

    public void setDamageLevel(Level damageLevel) {
        this.damageLevel = damageLevel;
    }
}
