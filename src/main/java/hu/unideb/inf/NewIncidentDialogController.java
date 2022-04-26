package hu.unideb.inf;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;

public class NewIncidentDialogController {

    @FXML
    private VBox A_car;

    @FXML
    private VBox B_car;
    //Incident data
    @FXML
    private Label locationOfIncident;

    @FXML
    private Label timeOfIncident;

    // Person A data
    @FXML
    private TextField aName;

    @FXML
    private TextArea aAddress;

    @FXML
    private TextField aPhone;

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
    private TextArea bInsurer;

    @FXML
    private TextField bName;

    @FXML
    private TextField bPhone;

    @FXML
    private TextArea bAddress;

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

    // A Events
    @FXML
    void handleAHoodClicked(MouseEvent event) {
        if (aHood.getStyle().equals("-fx-fill: white;")) {
            aHood.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("Level1");
        }
        else if (aHood.getStyle().equals("-fx-fill: #ffc2c2;")){
            aHood.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level2");
        }
        else if (aHood.getStyle().equals("-fx-fill: #ffc2c2;")){
            aHood.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level3");
        }
        else if (aHood.getStyle().equals("-fx-fill: #ff0000;")){
            aHood.setStyle("-fx-fill: white;");
            System.out.println("Level0");
        }
    }

    @FXML
    void handleARoofClicked(MouseEvent event) {
        if (aRoof.getStyle().equals("-fx-fill: white;")) {
            aRoof.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("Level1");
        }
        else if (aRoof.getStyle().equals("-fx-fill: #ffc2c2;")){
            aRoof.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level2");
        }
        else if (aRoof.getStyle().equals("-fx-fill: #ffc2c2;")){
            aRoof.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level3");
        }
        else if (aRoof.getStyle().equals("-fx-fill: #ff0000;")){
            aRoof.setStyle("-fx-fill: white;");
            System.out.println("Level0");
        }
    }

    @FXML
    void handleATrunkClicked(MouseEvent event) {
        if (aTrunk.getStyle().equals("-fx-fill: white;")) {
            aTrunk.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("Level1");
        }
        else if (aTrunk.getStyle().equals("-fx-fill: #ffc2c2;")){
            aTrunk.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level2");
        }
        else if (aTrunk.getStyle().equals("-fx-fill: #ffc2c2;")){
            aTrunk.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level3");
        }
        else if (aTrunk.getStyle().equals("-fx-fill: #ff0000;")){
            aTrunk.setStyle("-fx-fill: white;");
            System.out.println("Level0");
        }
    }

    @FXML
    void handleABackLeftDoorClick(MouseEvent event) {
        if (aBackLeftDoor.getStyle().equals("-fx-fill: white;")) {
            aBackLeftDoor.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("Level1");
        }
        else if (aBackLeftDoor.getStyle().equals("-fx-fill: #ffc2c2;")){
            aBackLeftDoor.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level2");
        }
        else if (aBackLeftDoor.getStyle().equals("-fx-fill: #ffc2c2;")){
            aBackLeftDoor.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level3");
        }
        else if (aBackLeftDoor.getStyle().equals("-fx-fill: #ff0000;")){
            aBackLeftDoor.setStyle("-fx-fill: white;");
            System.out.println("Level0");
        }
    }

    @FXML
    void handleABackRightDoorClicked(MouseEvent event) {
        if (aBackRightDoor.getStyle().equals("-fx-fill: white;")) {
            aBackRightDoor.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("Level1");
        }
        else if (aBackRightDoor.getStyle().equals("-fx-fill: #ffc2c2;")){
            aBackRightDoor.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level2");
        }
        else if (aBackRightDoor.getStyle().equals("-fx-fill: #ffc2c2;")){
            aBackRightDoor.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level3");
        }
        else if (aBackRightDoor.getStyle().equals("-fx-fill: #ff0000;")){
            aBackRightDoor.setStyle("-fx-fill: white;");
            System.out.println("Level0");
        }
    }

    @FXML
    void handleAFrontLeftDoorClick(MouseEvent event) {
        if (aFrontLeftDoor.getStyle().equals("-fx-fill: white;")) {
            aFrontLeftDoor.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("Level1");
        }
        else if (aFrontLeftDoor.getStyle().equals("-fx-fill: #ffc2c2;")){
            aFrontLeftDoor.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level2");
        }
        else if (aFrontLeftDoor.getStyle().equals("-fx-fill: #ffc2c2;")){
            aFrontLeftDoor.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level3");
        }
        else if (aFrontLeftDoor.getStyle().equals("-fx-fill: #ff0000;")){
            aFrontLeftDoor.setStyle("-fx-fill: white;");
            System.out.println("Level0");
        }
    }

    @FXML
    void handleAFrontRightDoorClicked(MouseEvent event) {
        if (aFrontRightDoor.getStyle().equals("-fx-fill: white;")) {
            aFrontRightDoor.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("Level1");
        }
        else if (aFrontRightDoor.getStyle().equals("-fx-fill: #ffc2c2;")){
            aFrontRightDoor.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level2");
        }
        else if (aFrontRightDoor.getStyle().equals("-fx-fill: #ffc2c2;")){
            aFrontRightDoor.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level3");
        }
        else if (aFrontRightDoor.getStyle().equals("-fx-fill: #ff0000;")){
            aFrontRightDoor.setStyle("-fx-fill: white;");
            System.out.println("Level0");
        }
    }

    @FXML
    void handleABackLeftWheelClick(MouseEvent event) {
        if (aBackLeftWheel.getStyle().equals("-fx-fill: black;")) {
            aBackLeftWheel.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("Level1");
        }
        else if (aBackLeftWheel.getStyle().equals("-fx-fill: #ffc2c2;")){
            aBackLeftWheel.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level2");
        }
        else if (aBackLeftWheel.getStyle().equals("-fx-fill: #ffc2c2;")){
            aBackLeftWheel.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level3");
        }
        else if (aBackLeftWheel.getStyle().equals("-fx-fill: #ff0000;")){
            aBackLeftWheel.setStyle("-fx-fill: black;");
            System.out.println("Level0");
        }
    }

    @FXML
    void handleABackRightWheelClicked(MouseEvent event) {
        if (aBackRightWheel.getStyle().equals("-fx-fill: black;")) {
            aBackRightWheel.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("Level1");
        }
        else if (aBackRightWheel.getStyle().equals("-fx-fill: #ffc2c2;")){
            aBackRightWheel.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level2");
        }
        else if (aBackRightWheel.getStyle().equals("-fx-fill: #ffc2c2;")){
            aBackRightWheel.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level3");
        }
        else if (aBackRightWheel.getStyle().equals("-fx-fill: #ff0000;")){
            aBackRightWheel.setStyle("-fx-fill: black;");
            System.out.println("Level0");
        }
    }

    @FXML
    void handleAFrontLeftWheelClicked(MouseEvent event) {
        if (aFrontLeftWheel.getStyle().equals("-fx-fill: black;")) {
            aFrontLeftWheel.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("Level1");
        }
        else if (aFrontLeftWheel.getStyle().equals("-fx-fill: #ffc2c2;")){
            aFrontLeftWheel.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level2");
        }
        else if (aFrontLeftWheel.getStyle().equals("-fx-fill: #ffc2c2;")){
            aFrontLeftWheel.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level3");
        }
        else if (aFrontLeftWheel.getStyle().equals("-fx-fill: #ff0000;")){
            aFrontLeftWheel.setStyle("-fx-fill: black;");
            System.out.println("Level0");
        }
    }

    @FXML
    void handleAFrontRightWheelClicked(MouseEvent event) {
        if (aFrontRightWheel.getStyle().equals("-fx-fill: black;")) {
            aFrontRightWheel.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("Level1");
        }
        else if (aFrontRightWheel.getStyle().equals("-fx-fill: #ffc2c2;")){
            aFrontRightWheel.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level2");
        }
        else if (aFrontRightWheel.getStyle().equals("-fx-fill: #ffc2c2;")){
            aFrontRightWheel.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level3");
        }
        else if (aFrontRightWheel.getStyle().equals("-fx-fill: #ff0000;")){
            aFrontRightWheel.setStyle("-fx-fill: black;");
            System.out.println("Level0");
        }
    }

    @FXML
    void handleABackWindshieldClicked(MouseEvent event) {
        if (aBackWindshield.getStyle().equals("-fx-fill: dodgerblue;")) {
            aBackWindshield.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("Level1");
        }
        else if (aBackWindshield.getStyle().equals("-fx-fill: #ffc2c2;")){
            aBackWindshield.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level2");
        }
        else if (aBackWindshield.getStyle().equals("-fx-fill: #ffc2c2;")){
            aBackWindshield.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level3");
        }
        else if (aBackWindshield.getStyle().equals("-fx-fill: #ff0000;")){
            aBackWindshield.setStyle("-fx-fill: dodgerblue;");
            System.out.println("Level0");
        }
    }

    @FXML
    void handleAFrontWindshieldClicked(MouseEvent event) {
        if (aFrontWindshield.getStyle().equals("-fx-fill: dodgerblue;")) {
            aFrontWindshield.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("Level1");
        }
        else if (aFrontWindshield.getStyle().equals("-fx-fill: #ffc2c2;")){
            aFrontWindshield.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level2");
        }
        else if (aFrontWindshield.getStyle().equals("-fx-fill: #ffc2c2;")){
            aFrontWindshield.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level3");
        }
        else if (aFrontWindshield.getStyle().equals("-fx-fill: #ff0000;")){
            aFrontWindshield.setStyle("-fx-fill: dodgerblue;");
            System.out.println("Level0");
        }
    }

    // B Events
    @FXML
    void handleBHoodClicked(MouseEvent event) {
        if (bHood.getStyle().equals("-fx-fill: white;")) {
            bHood.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("Level1");
        }
        else if (bHood.getStyle().equals("-fx-fill: #ffc2c2;")){
            bHood.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level2");
        }
        else if (bHood.getStyle().equals("-fx-fill: #ffc2c2;")){
            bHood.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level3");
        }
        else if (bHood.getStyle().equals("-fx-fill: #ff0000;")){
            bHood.setStyle("-fx-fill: white;");
            System.out.println("Level0");
        }
    }

    @FXML
    void handleBRoofClicked(MouseEvent event) {
        if (bRoof.getStyle().equals("-fx-fill: white;")) {
            bRoof.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("Level1");
        }
        else if (bRoof.getStyle().equals("-fx-fill: #ffc2c2;")){
            bRoof.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level2");
        }
        else if (bRoof.getStyle().equals("-fx-fill: #ffc2c2;")){
            bRoof.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level3");
        }
        else if (bRoof.getStyle().equals("-fx-fill: #ff0000;")){
            bRoof.setStyle("-fx-fill: white;");
            System.out.println("Level0");
        }
    }

    @FXML
    void handleBTrunkClicked(MouseEvent event) {
        if (bTrunk.getStyle().equals("-fx-fill: white;")) {
            bTrunk.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("Level1");
        }
        else if (bTrunk.getStyle().equals("-fx-fill: #ffc2c2;")){
            bTrunk.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level2");
        }
        else if (bTrunk.getStyle().equals("-fx-fill: #ffc2c2;")){
            bTrunk.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level3");
        }
        else if (bTrunk.getStyle().equals("-fx-fill: #ff0000;")){
            bTrunk.setStyle("-fx-fill: white;");
            System.out.println("Level0");
        }
    }

    @FXML
    void handleBBackLeftDoorClick(MouseEvent event) {
        if (aBackLeftDoor.getStyle().equals("-fx-fill: white;")) {
            aBackLeftDoor.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("Level1");
        }
        else if (aBackLeftDoor.getStyle().equals("-fx-fill: #ffc2c2;")){
            aBackLeftDoor.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level2");
        }
        else if (aBackLeftDoor.getStyle().equals("-fx-fill: #ffc2c2;")){
            aBackLeftDoor.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level3");
        }
        else if (aBackLeftDoor.getStyle().equals("-fx-fill: #ff0000;")){
            aBackLeftDoor.setStyle("-fx-fill: white;");
            System.out.println("Level0");
        }
    }

    @FXML
    void handleBBackRightDoorClicked(MouseEvent event) {
        if (bBackRightDoor.getStyle().equals("-fx-fill: white;")) {
            bBackRightDoor.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("Level1");
        }
        else if (bBackRightDoor.getStyle().equals("-fx-fill: #ffc2c2;")){
            bBackRightDoor.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level2");
        }
        else if (bBackRightDoor.getStyle().equals("-fx-fill: #ffc2c2;")){
            bBackRightDoor.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level3");
        }
        else if (bBackRightDoor.getStyle().equals("-fx-fill: #ff0000;")){
            bBackRightDoor.setStyle("-fx-fill: white;");
            System.out.println("Level0");
        }
    }

    @FXML
    void handleBFrontLeftDoorClick(MouseEvent event) {
        if (bFrontLeftDoor.getStyle().equals("-fx-fill: white;")) {
            bFrontLeftDoor.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("Level1");
        }
        else if (bFrontLeftDoor.getStyle().equals("-fx-fill: #ffc2c2;")){
            bFrontLeftDoor.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level2");
        }
        else if (bFrontLeftDoor.getStyle().equals("-fx-fill: #ffc2c2;")){
            bFrontLeftDoor.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level3");
        }
        else if (bFrontLeftDoor.getStyle().equals("-fx-fill: #ff0000;")){
            bFrontLeftDoor.setStyle("-fx-fill: white;");
            System.out.println("Level0");
        }
    }

    @FXML
    void handleBFrontRightDoorClicked(MouseEvent event) {
        if (aFrontRightDoor.getStyle().equals("-fx-fill: white;")) {
            aFrontRightDoor.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("Level1");
        }
        else if (aFrontRightDoor.getStyle().equals("-fx-fill: #ffc2c2;")){
            aFrontRightDoor.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level2");
        }
        else if (aFrontRightDoor.getStyle().equals("-fx-fill: #ffc2c2;")){
            aFrontRightDoor.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level3");
        }
        else if (aFrontRightDoor.getStyle().equals("-fx-fill: #ff0000;")){
            aFrontRightDoor.setStyle("-fx-fill: white;");
            System.out.println("Level0");
        }
    }

    @FXML
    void handleBBackLeftWheelClick(MouseEvent event) {
        if (aBackLeftWheel.getStyle().equals("-fx-fill: black;")) {
            aBackLeftWheel.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("Level1");
        }
        else if (aBackLeftWheel.getStyle().equals("-fx-fill: #ffc2c2;")){
            aBackLeftWheel.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level2");
        }
        else if (aBackLeftWheel.getStyle().equals("-fx-fill: #ffc2c2;")){
            aBackLeftWheel.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level3");
        }
        else if (aBackLeftWheel.getStyle().equals("-fx-fill: #ff0000;")){
            aBackLeftWheel.setStyle("-fx-fill: black;");
            System.out.println("Level0");
        }
    }

    @FXML
    void handleBBackRightWheelClicked(MouseEvent event) {
        if (bBackRightWheel.getStyle().equals("-fx-fill: black;")) {
            bBackRightWheel.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("Level1");
        }
        else if (bBackRightWheel.getStyle().equals("-fx-fill: #ffc2c2;")){
            bBackRightWheel.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level2");
        }
        else if (bBackRightWheel.getStyle().equals("-fx-fill: #ffc2c2;")){
            bBackRightWheel.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level3");
        }
        else if (bBackRightWheel.getStyle().equals("-fx-fill: #ff0000;")){
            bBackRightWheel.setStyle("-fx-fill: black;");
            System.out.println("Level0");
        }
    }

    @FXML
    void handleBFrontLeftWheelClicked(MouseEvent event) {
        if (bFrontLeftWheel.getStyle().equals("-fx-fill: black;")) {
            bFrontLeftWheel.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("Level1");
        }
        else if (bFrontLeftWheel.getStyle().equals("-fx-fill: #ffc2c2;")){
            bFrontLeftWheel.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level2");
        }
        else if (bFrontLeftWheel.getStyle().equals("-fx-fill: #ffc2c2;")){
            bFrontLeftWheel.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level3");
        }
        else if (bFrontLeftWheel.getStyle().equals("-fx-fill: #ff0000;")){
            bFrontLeftWheel.setStyle("-fx-fill: black;");
            System.out.println("Level0");
        }
    }

    @FXML
    void handleBFrontRightWheelClicked(MouseEvent event) {
        if (bFrontRightWheel.getStyle().equals("-fx-fill: black;")) {
            bFrontRightWheel.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("Level1");
        }
        else if (bFrontRightWheel.getStyle().equals("-fx-fill: #ffc2c2;")){
            bFrontRightWheel.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level2");
        }
        else if (bFrontRightWheel.getStyle().equals("-fx-fill: #ffc2c2;")){
            bFrontRightWheel.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level3");
        }
        else if (bFrontRightWheel.getStyle().equals("-fx-fill: #ff0000;")){
            bFrontRightWheel.setStyle("-fx-fill: black;");
            System.out.println("Level0");
        }
    }

    @FXML
    void handleBBackWindshieldClicked(MouseEvent event) {
        if (bBackWindshield.getStyle().equals("-fx-fill: dodgerblue;")) {
            bBackWindshield.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("Level1");
        }
        else if (bBackWindshield.getStyle().equals("-fx-fill: #ffc2c2;")){
            bBackWindshield.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level2");
        }
        else if (bBackWindshield.getStyle().equals("-fx-fill: #ffc2c2;")){
            bBackWindshield.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level3");
        }
        else if (bBackWindshield.getStyle().equals("-fx-fill: #ff0000;")){
            bBackWindshield.setStyle("-fx-fill: dodgerblue;");
            System.out.println("Level0");
        }
    }

    @FXML
    void handleBFrontWindshieldClicked(MouseEvent event) {
        if (bFrontWindshield.getStyle().equals("-fx-fill: dodgerblue;")) {
            bFrontWindshield.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("Level1");
        }
        else if (bFrontWindshield.getStyle().equals("-fx-fill: #ffc2c2;")){
            bFrontWindshield.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level2");
        }
        else if (bFrontWindshield.getStyle().equals("-fx-fill: #ffc2c2;")){
            bFrontWindshield.setStyle("-fx-fill: #ff5353;");
            System.out.println("Level3");
        }
        else if (bFrontWindshield.getStyle().equals("-fx-fill: #ff0000;")){
            bFrontWindshield.setStyle("-fx-fill: dodgerblue;");
            System.out.println("Level0");
        }
    }

}
