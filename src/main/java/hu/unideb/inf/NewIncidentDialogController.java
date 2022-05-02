package hu.unideb.inf;

import hu.unideb.inf.model.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.stage.FileChooser;

import java.io.File;
import java.util.List;

public class NewIncidentDialogController {

    // CarParts

    CarParts aParts = new CarParts();
    CarParts bParts = new CarParts();

    //Incident data
    @FXML
    private TextArea locationOfIncident;

    @FXML
    private DateTimePicker timeOfIncident;

    // Person A data
    @FXML
    private TextField aFirstName;

    @FXML
    private TextField aLastName;

    @FXML
    private DatePicker aDateOfBirth;

    @FXML
    private TextArea aAddress;

    @FXML
    private TextField aDrivingLicenseNumber;

    @FXML
    private TextField aPhone;

    //Car A data
    @FXML
    private TextField aCarBrand;

    @FXML
    private TextField aCarType;

    @FXML
    private TextField aCarLicensePlate;

    @FXML
    private TextArea aInsurer;

    @FXML
    private TextArea aComment;

    //Car A parts
    @FXML
    private Rectangle aHood;

    @FXML
    private Rectangle aRoof;

    @FXML
    private Rectangle aTrunk;

    @FXML
    private Rectangle aBackLeftDoor;

    @FXML
    private Rectangle aBackRightDoor;

    @FXML
    private Rectangle aBackLeftWheel;

    @FXML
    private Rectangle aBackRightWheel;

    @FXML
    private Rectangle aBackWindshield;

    @FXML
    private Rectangle aFrontLeftDoor;

    @FXML
    private Rectangle aFrontLeftWheel;

    @FXML
    private Rectangle aFrontRightDoor;

    @FXML
    private Rectangle aFrontRightWheel;

    @FXML
    private Rectangle aFrontWindshield;

    //Person B data
    @FXML
    private TextField bFirstName;

    @FXML
    private TextField bLastName;

    @FXML
    private DatePicker bDateOfBirth;

    @FXML
    private TextArea bAddress;

    @FXML
    private TextField bDrivingLicenseNumber;

    @FXML
    private TextField bPhone;

    //Car B data
    @FXML
    private TextField bCarBrand;

    @FXML
    private TextField bCarType;

    @FXML
    private TextField bCarLicensePlate;

    @FXML
    private TextArea bInsurer;

    @FXML
    private TextArea bComment;

    //Car B parts
    @FXML
    private Rectangle bBackLeftDoor;

    @FXML
    private Rectangle bBackLeftWheel;

    @FXML
    private Rectangle bBackRightDoor;

    @FXML
    private Rectangle bBackRightWheel;

    @FXML
    private Rectangle bBackWindshield;

    @FXML
    private Rectangle bFrontLeftDoor;

    @FXML
    private Rectangle bFrontLeftWheel;

    @FXML
    private Rectangle bFrontRightDoor;

    @FXML
    private Rectangle bFrontRightWheel;

    @FXML
    private Rectangle bFrontWindshield;

    @FXML
    private Rectangle bHood;

    @FXML
    private Rectangle bRoof;

    @FXML
    private Rectangle bTrunk;

    //File upload
    @FXML
    private ListView<String> aFiles;

    @FXML
    private Button aFileUploadButton;

    @FXML
    private ListView<String> bFiles;

    @FXML
    private Button bFileUploadButton;

    // TODO: nem minding level 0 a kezdő sérülés pl.: betöltéskor
    // TODO: Observer, ami változtatja a színt a jelenlegi damage Level alapján
    @FXML
    int damageLevel(Rectangle carPart)
    {
        int level = 0;
        String basicFill = "-fx-fill: white";

        if (carPart.equals(aBackWindshield) || carPart.equals(aFrontWindshield) || carPart.equals(bBackWindshield) ||
                carPart.equals(bFrontWindshield)){
            basicFill = "-fx-fill: dodgerblue;";
        }
        else if (carPart.equals(aBackLeftWheel) || carPart.equals(aBackRightWheel) || carPart.equals(aFrontLeftWheel) ||
                carPart.equals(aFrontRightWheel) || carPart.equals(bBackLeftWheel) || carPart.equals(bBackRightWheel) ||
                carPart.equals(bFrontLeftWheel) || carPart.equals(bFrontRightWheel)) {
            basicFill = "-fx-fill: black;";
        }

        if (carPart.getStyle().equals("-fx-fill: #ff0000;")) {
            carPart.setStyle(basicFill);
            level = 0;
        }
        else if (carPart.getStyle().equals("-fx-fill: #ff5c5c;")){
            carPart.setStyle("-fx-fill: #ff0000;");
            level = 3;
        }
        else if (carPart.getStyle().equals("-fx-fill: #ffc2c2;"))
        {
            carPart.setStyle("-fx-fill: #ff5c5c;");
            level = 2;
        }
        else {
            carPart.setStyle("-fx-fill: #ffc2c2;");
            level = 1;
        }
        return level;
    }

    @FXML
    void handleAFileUploadButton(MouseEvent event) {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Image File", "*.jpg"),
                                        new FileChooser.ExtensionFilter("Image File", "*.png"),
                                        new FileChooser.ExtensionFilter("Image File", "*.jpeg"));
        List<File> files = fc.showOpenMultipleDialog(null);

        if (files != null){
            for (File file : files)
            {
                aFiles.getItems().add(file.getName());
            }
        }
    }

    @FXML
    void handleBFileUploadButton(MouseEvent event) {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Image File", "*.jpg"),
                                        new FileChooser.ExtensionFilter("Image File", "*.png"),
                                        new FileChooser.ExtensionFilter("Image File", "*.jpeg"));
        List<File> files = fc.showOpenMultipleDialog(null);

        if (files != null){
            for (File file : files)
            {
                bFiles.getItems().add(file.getName());
            }
        }
    }

    // A Events
    @FXML
    void handleAHoodClicked(MouseEvent event) {
        //System.out.println(damageLevel(aHood));
        aParts.setHood(CarParts.next(aParts.getHood()));
        System.out.println(aParts.getHood());
    }

    @FXML
    void handleARoofClicked(MouseEvent event) {
        System.out.println(damageLevel(aRoof));
        aParts.setRoof(CarParts.next(aParts.getRoof()));
    }

    @FXML
    void handleATrunkClicked(MouseEvent event) {
        System.out.println(damageLevel(aTrunk));
        aParts.setTrunk(CarParts.next(aParts.getTrunk()));
    }

    @FXML
    void handleABackLeftDoorClick(MouseEvent event) {
        System.out.println(damageLevel(aBackLeftDoor));
        aParts.setBlDoor(CarParts.next(aParts.getBlDoor()));
    }

    @FXML
    void handleABackRightDoorClicked(MouseEvent event) {
        System.out.println(damageLevel(aBackRightDoor));
        aParts.setBrDoor(CarParts.next(aParts.getBrDoor()));
    }

    @FXML
    void handleAFrontLeftDoorClick(MouseEvent event) {
        System.out.println(damageLevel(aFrontLeftDoor));
        aParts.setFlDoor(CarParts.next(aParts.getFlDoor()));
    }

    @FXML
    void handleAFrontRightDoorClicked(MouseEvent event) {
        System.out.println(damageLevel(aFrontRightDoor));
        aParts.setFrDoor(CarParts.next(aParts.getFrDoor()));
    }

    @FXML
    void handleABackLeftWheelClick(MouseEvent event) {
        System.out.println(damageLevel(aBackLeftWheel));
        aParts.setBlWheel(CarParts.next(aParts.getBlWheel()));
    }

    @FXML
    void handleABackRightWheelClicked(MouseEvent event) {
        System.out.println(damageLevel(aFrontRightWheel));
        aParts.setBrWheel(CarParts.next(aParts.getBrWheel()));
    }

    @FXML
    void handleAFrontLeftWheelClicked(MouseEvent event) {
        System.out.println(damageLevel(aFrontLeftWheel));
        aParts.setFlWheel(CarParts.next(aParts.getFlWheel()));
    }

    @FXML
    void handleAFrontRightWheelClicked(MouseEvent event) {
        System.out.println(damageLevel(aBackLeftWheel));
        aParts.setFrWheel(CarParts.next(aParts.getFrWheel()));
    }

    @FXML
    void handleABackWindshieldClicked(MouseEvent event) {
        System.out.println(damageLevel(aBackWindshield));
        aParts.setbWindshield(CarParts.next(aParts.getbWindshield()));
    }

    @FXML
    void handleAFrontWindshieldClicked(MouseEvent event) {
        System.out.println(damageLevel(aBackLeftWheel));
        aParts.setfWindshield(CarParts.next(aParts.getfWindshield()));
    }

    // B Events
    @FXML
    void handleBHoodClicked(MouseEvent event) {
        System.out.println(damageLevel(bHood));
        bParts.setHood(CarParts.next(bParts.getHood()));
    }

    @FXML
    void handleBRoofClicked(MouseEvent event) {
        System.out.println(damageLevel(bRoof));
        bParts.setRoof(CarParts.next(bParts.getRoof()));
    }

    @FXML
    void handleBTrunkClicked(MouseEvent event) {
        System.out.println(damageLevel(bTrunk));
        bParts.setTrunk(CarParts.next(bParts.getTrunk()));
    }

    @FXML
    void handleBBackLeftDoorClick(MouseEvent event) {
        System.out.println(damageLevel(bBackLeftDoor));
        bParts.setBlDoor(CarParts.next(bParts.getBlDoor()));
    }

    @FXML
    void handleBBackRightDoorClicked(MouseEvent event) {
        System.out.println(damageLevel(bBackRightDoor));
        bParts.setBrDoor(CarParts.next(bParts.getBrDoor()));
    }

    @FXML
    void handleBFrontLeftDoorClick(MouseEvent event) {
        System.out.println(damageLevel(bFrontLeftDoor));
        bParts.setFlDoor(CarParts.next(bParts.getFlDoor()));
    }

    @FXML
    void handleBFrontRightDoorClicked(MouseEvent event) {
        System.out.println(damageLevel(bFrontRightDoor));
        bParts.setFrDoor(CarParts.next(bParts.getFrDoor()));
    }

    @FXML
    void handleBBackLeftWheelClick(MouseEvent event) {
        System.out.println(damageLevel(bBackLeftWheel));
        bParts.setBlWheel(CarParts.next(bParts.getBlWheel()));
    }

    @FXML
    void handleBBackRightWheelClicked(MouseEvent event) {
        System.out.println(damageLevel(bBackRightWheel));
        bParts.setBrWheel(CarParts.next(bParts.getBrWheel()));
    }

    @FXML
    void handleBFrontLeftWheelClicked(MouseEvent event) {
        System.out.println(damageLevel(bFrontLeftWheel));
        bParts.setFlWheel(CarParts.next(bParts.getFlWheel()));
    }

    @FXML
    void handleBFrontRightWheelClicked(MouseEvent event) {
        System.out.println(damageLevel(bFrontRightWheel));
        bParts.setFrWheel(CarParts.next(bParts.getFrWheel()));
    }

    @FXML
    void handleBBackWindshieldClicked(MouseEvent event) {
        System.out.println(damageLevel(bBackWindshield));
        bParts.setbWindshield(CarParts.next(bParts.getbWindshield()));
    }

    @FXML
    void handleBFrontWindshieldClicked(MouseEvent event) {
        System.out.println(damageLevel(bFrontWindshield));
        bParts.setfWindshield(CarParts.next(bParts.getfWindshield()));
    }

    //TODO bemenet ellenőrzés

    @FXML
    public Crash processResult() {
        Person personA = new Person(aFirstName.getText().trim(), aLastName.getText().trim(), aDateOfBirth.getValue(), aDrivingLicenseNumber.getText().trim().toUpperCase(), aAddress.getText().trim(), aPhone.getText().trim());
        Person personB = new Person(bFirstName.getText().trim(), bLastName.getText().trim(), bDateOfBirth.getValue(), bDrivingLicenseNumber.getText().trim().toUpperCase(), bAddress.getText().trim(), bPhone.getText().trim());


        Car carA = new Car(aCarBrand.getText().trim(), aCarType.getText().trim(), aCarLicensePlate.getText().trim(), aInsurer.getText().trim(), aParts);
        Car carB = new Car(bCarBrand.getText().trim(), bCarType.getText().trim(), bCarLicensePlate.getText().trim(), bInsurer.getText().trim(), bParts);

        return new Crash(personA, personB, carA, carB, aComment.getText(), bComment.getText(), locationOfIncident.getText().trim(), timeOfIncident.getDateTimeValue());
    }

}
