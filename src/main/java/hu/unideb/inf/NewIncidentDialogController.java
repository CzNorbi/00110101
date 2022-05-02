package hu.unideb.inf;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.stage.FileChooser;

import java.io.File;
import java.util.List;

public class NewIncidentDialogController {

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
        System.out.println(damageLevel(aHood));
    }

    @FXML
    void handleARoofClicked(MouseEvent event) {
        System.out.println(damageLevel(aRoof));
    }

    @FXML
    void handleATrunkClicked(MouseEvent event) {
        System.out.println(damageLevel(aTrunk));
    }

    @FXML
    void handleABackLeftDoorClick(MouseEvent event) {
        System.out.println(damageLevel(aBackLeftDoor));
    }

    @FXML
    void handleABackRightDoorClicked(MouseEvent event) {
        System.out.println(damageLevel(aBackRightDoor));
    }

    @FXML
    void handleAFrontLeftDoorClick(MouseEvent event) {
        System.out.println(damageLevel(aFrontLeftDoor));
    }

    @FXML
    void handleAFrontRightDoorClicked(MouseEvent event) {
        System.out.println(damageLevel(aFrontRightDoor));
    }

    @FXML
    void handleABackLeftWheelClick(MouseEvent event) {
        System.out.println(damageLevel(aBackLeftWheel));
    }

    @FXML
    void handleABackRightWheelClicked(MouseEvent event) {
        System.out.println(damageLevel(aBackRightWheel));
    }

    @FXML
    void handleAFrontLeftWheelClicked(MouseEvent event) {
        System.out.println(damageLevel(aFrontLeftWheel));
    }

    @FXML
    void handleAFrontRightWheelClicked(MouseEvent event) {
        System.out.println(damageLevel(aBackLeftWheel));
    }

    @FXML
    void handleABackWindshieldClicked(MouseEvent event) {
        System.out.println(damageLevel(aBackWindshield));
    }

    @FXML
    void handleAFrontWindshieldClicked(MouseEvent event) {
        System.out.println(damageLevel(aBackLeftWheel));
    }

    // B Events
    @FXML
    void handleBHoodClicked(MouseEvent event) {
        System.out.println(damageLevel(bHood));
    }

    @FXML
    void handleBRoofClicked(MouseEvent event) {
        System.out.println(damageLevel(bRoof));
    }

    @FXML
    void handleBTrunkClicked(MouseEvent event) {
        System.out.println(damageLevel(bTrunk));
    }

    @FXML
    void handleBBackLeftDoorClick(MouseEvent event) {
        System.out.println(damageLevel(bBackLeftDoor));
    }

    @FXML
    void handleBBackRightDoorClicked(MouseEvent event) {
        System.out.println(damageLevel(bBackRightDoor));
    }

    @FXML
    void handleBFrontLeftDoorClick(MouseEvent event) {
        System.out.println(damageLevel(bFrontLeftDoor));
    }

    @FXML
    void handleBFrontRightDoorClicked(MouseEvent event) {
        System.out.println(damageLevel(bFrontRightDoor));
    }

    @FXML
    void handleBBackLeftWheelClick(MouseEvent event) {
        System.out.println(damageLevel(bBackLeftWheel));
    }

    @FXML
    void handleBBackRightWheelClicked(MouseEvent event) {
        System.out.println(damageLevel(bBackRightWheel));
    }

    @FXML
    void handleBFrontLeftWheelClicked(MouseEvent event) {
        System.out.println(damageLevel(bFrontLeftWheel));
    }

    @FXML
    void handleBFrontRightWheelClicked(MouseEvent event) {
        System.out.println(damageLevel(bFrontRightWheel));
    }

    @FXML
    void handleBBackWindshieldClicked(MouseEvent event) {
        System.out.println(damageLevel(bBackWindshield));
    }

    @FXML
    void handleBFrontWindshieldClicked(MouseEvent event) {
        System.out.println(damageLevel(bFrontWindshield));
    }

}
