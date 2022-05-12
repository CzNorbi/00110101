package hu.unideb.inf.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileCrashDAO implements CrashDAO {

    private List<Crash> crashes;

    public FileCrashDAO() {
        // Deserializáció
        try (FileInputStream fis = new FileInputStream("src/main/resources/data/crashes.ser");
             ObjectInputStream ois = new ObjectInputStream(fis);) {
            crashes = (List<Crash>)ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            crashes = new ArrayList<Crash>();
        }
    }

    private void serialize() {
        // Serializáció
        try (FileOutputStream fos = new FileOutputStream("src/main/resources/data/crashes.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(crashes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveCrash(Crash c) {
        if (!crashes.contains(c)) {
            crashes.add(c);
            serialize();
        }
    }

    @Override
    public void deleteCrash(Crash c) {
        if (crashes.contains(c)) {
            crashes.remove(c);
            serialize();
        }
    }

    @Override
    public void updateCrash(Crash oldCrash, Crash newCrash) {
        crashes.set(crashes.indexOf(oldCrash), newCrash);
        serialize();
    }

    @Override
    public List<Crash> getCrashes() {
        return crashes;
    }

    @Override
    public void close() throws Exception {

    }
}
