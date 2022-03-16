package hu.unideb.inf;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FXMLStudentsSceneController {
    @FXML
    private Label birthDayLabel;

    @FXML
    private Label creditsLabel;

    @FXML
    private Label statusLabel;

    @FXML
    private Label nameLabel;

    @FXML
    void handleLoadButtonPushed(ActionEvent event) {

    }

    @FXML
    void handleButtonPushed(){
        System.out.println("Hello world!!!");
        statusLabel.setText("Saved!");
    }
}
