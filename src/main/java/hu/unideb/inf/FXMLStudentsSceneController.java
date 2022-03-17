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

    @FXML
    private Rectangle hood;

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
        } else {
            hood.setStyle("-fx-fill: #ffc2c2;");
            // státusz mentése adatbázisra
        }
    }

    @FXML
    void handleButtonPushed(){
        System.out.println("Hello world!!!");
        statusBack.setStyle("-fx-background-color: #d7facc;");
        statusLabel.setText("Saved!");
    }
}
