package hu.unideb.inf.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Incidents {
    private ObservableList<CrashIncident> listOfCrashIncidents;

    public Incidents() {
        this.listOfCrashIncidents = FXCollections.observableArrayList();
    }

    public ObservableList<CrashIncident> getListOfCrashIncidents() {
        return listOfCrashIncidents;
    }

    public void addCrashIncident(CrashIncident crash) {
        this.listOfCrashIncidents.add(crash);
    }
}
