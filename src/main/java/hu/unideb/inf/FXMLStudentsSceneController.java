package hu.unideb.inf;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import javafx.scene.shape.Rectangle;

public class FXMLStudentsSceneController {
    @FXML
    private Label birthDayLabel;

    @FXML
    private Label creditsLabel;

    @FXML
    private Label statusLabel;

    // Car parts:

    @FXML
    private Rectangle hood;

    @FXML
    private Rectangle frDoor; // front

    @FXML
    private Rectangle flDoor;

    @FXML
    private Rectangle brDoor; // back

    @FXML
    private Rectangle blDoor;

    @FXML
    private Rectangle trunk;

    // End of Car parts

    @FXML
    private TextField crashUserName;

    @FXML
    private ChoiceBox incidentPicker;

    @FXML
    private Region statusBack;

    @FXML
    private TextField crashCarName;

    @FXML
    private Label nameLabel;

    @FXML
    private DatePicker datePicker;

    @FXML
    void handleLoadButtonPushed(ActionEvent event) {

    }

    @FXML
    void handleCrashDate() {

    }

    @FXML
    void handleCrashName() {

    }

    @FXML
    void handleCrashCarName() {

    }

    @FXML
    void handleHoodClicked() {
        if (hood.getStyle().equals("-fx-fill: #ffc2c2;")) {
            hood.setStyle("-fx-fill: white;");
            System.out.println("Declicked!");
        } else {
            hood.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("Hood Clicked!");
        }
    }

    @FXML
    void handleTrunkClicked() {
        if (trunk.getStyle().equals("-fx-fill: #ffc2c2;")) {
            trunk.setStyle("-fx-fill: white;");
            System.out.println("Declicked!");
        } else {
            trunk.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("Trunk Clicked!");
        }
    }

    @FXML
    void handleFrontRightDoor() {
        if (frDoor.getStyle().equals("-fx-fill: #ffc2c2;")) {
            frDoor.setStyle("-fx-fill: white;");
            System.out.println("Declicked!");
        } else {
            frDoor.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("frDoor Clicked!");
        }
    }

    @FXML
    void handleFrontLeftDoor() {
        if (flDoor.getStyle().equals("-fx-fill: #ffc2c2;")) {
            flDoor.setStyle("-fx-fill: white;");
            System.out.println("Declicked!");
        } else {
            flDoor.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("flDoor Clicked!");
        }
    }

    @FXML
    void handleBackRightDoor() {
        if (brDoor.getStyle().equals("-fx-fill: #ffc2c2;")) {
            brDoor.setStyle("-fx-fill: white;");
            System.out.println("Declicked!");
        } else {
            brDoor.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("brDoor Clicked!");
        }
    }

    @FXML
    void handleBackLeftDoor() {
        if (blDoor.getStyle().equals("-fx-fill: #ffc2c2;")) {
            blDoor.setStyle("-fx-fill: white;");
            System.out.println("Declicked!");
        } else {
            blDoor.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("blDoor Clicked!");
        }
    }

    @FXML
    void handleButtonPushed(){
        System.out.println("Hello world!!!");
        statusBack.setStyle("-fx-background-color: #d7facc;");
        statusLabel.setText("Saved!");
    }
}
