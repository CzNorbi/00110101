package hu.unideb.inf.model;

import java.time.LocalDate;

// TODO: autó részeket implementálni

public class CrashIncident {
    private String crashClientName;
    private String crashCarName;
    private LocalDate dateOfCrash;

    public CrashIncident(String crashClientName, String crashCarName, LocalDate dateOfCrash) {
        this.crashClientName = crashClientName;
        this.crashCarName = crashCarName;
        this.dateOfCrash = dateOfCrash;
    }

    public String getCrashClientName() {
        return crashClientName;
    }

    public String getCrashCarName() {
        return crashCarName;
    }

    public LocalDate getDateOfCrash() {
        return dateOfCrash;
    }

    public void setCrashClientName(String crashClientName) {
        this.crashClientName = crashClientName;
    }

    public void setCrashCarName(String crashCarName) {
        this.crashCarName = crashCarName;
    }

    public void setDateOfCrash(LocalDate dateOfCrash) {
        this.dateOfCrash = dateOfCrash;
    }


    // TODO: normálisan megformázni -> igy jelenik meg a drop-down menüben
    @Override
    public String toString() {
        return "Bejelentés: " +
                "Név: " + crashClientName + " " +
                "Autó: " + crashCarName + " " +
                "Dátum: " + dateOfCrash;
    }
}
