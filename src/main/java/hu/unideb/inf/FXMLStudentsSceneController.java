package hu.unideb.inf;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLStudentsSceneController {
    @FXML
    private Label birthDayLabel;

    @FXML
    private Label creditsLabel;

    @FXML
    private Label statusLabel;

    @FXML
    private TextField crashUserName;

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
    void handleButtonPushed(){
        System.out.println("Hello world!!!");
        statusLabel.setText("Saved!");
    }
}
