package hu.unideb.inf.model;

import java.util.List;

public interface CrashDAO extends AutoCloseable {
    public void saveCrash(Crash c);
    public void deleteCrash(Crash c);
    public void updateCrash(Crash oldCrash, Crash newCrash);
    public List<Crash> getCrashes();
}
