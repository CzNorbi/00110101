package hu.unideb.inf.model;

import java.util.ArrayList;
import java.util.List;

public class CarPart {

    private String PartName;
    private Level DamageLevel;

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
        this.PartName = partName;
        this.DamageLevel = damageLevel;
    }

    public String getPartName() {
        return PartName;
    }

    public Level getDamageLevel() {
        return DamageLevel;
    }

    public void setDamageLevel(Level damageLevel) {
        this.DamageLevel = damageLevel;
    }
}
