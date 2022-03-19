package hu.unideb.inf.jUnit;

import hu.unideb.inf.model.CrashIncident;
import hu.unideb.inf.model.Incidents;

import java.time.LocalDate;
import java.util.Objects;

public class testCrashIncident {
    public static void main(String[] args) {
        test_crashIncident();
    }
    //tovabbi setterek es getterek tesztelese

    public static void test_crashIncident() {
        LocalDate testDate = LocalDate.now();
        CrashIncident test = new CrashIncident("testName", "testCar", testDate);
        if(test.getCrashClientName().equals("testName")) {
            System.out.println("NameOK");
        }
        if(test.getCrashCarName().equals("testCar")) {
            System.out.println("CarOK");
        }
        if(Objects.equals(test.getDateOfCrash(), LocalDate.now())) {
            System.out.println("DateOK");
        }
    }
}

