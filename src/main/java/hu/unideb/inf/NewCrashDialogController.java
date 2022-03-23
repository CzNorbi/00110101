package hu.unideb.inf;

import hu.unideb.inf.model.CarPart;
import hu.unideb.inf.model.CrashIncident;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

// TODO Autórészeken a kattintásokat megcsinálni

public class NewCrashDialogController implements Initializable {

    List<CarPart> listOfCarParts;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listOfCarParts = CarPart.initCarPartList();

        //TODO: Márkákat, típusokat és hajtásláncot felvinni a ChoiceBoxokba
    }

    @FXML
    public TextField nameField;

    @FXML
    public TextField cityField;

    @FXML
    public TextField phoneNumberField;

    @FXML
    public TextField licensePlateField;

    @FXML
    public ChoiceBox<String> brandChoiceBox;

    @FXML
    public ChoiceBox<String> typeChoiceBox;

    @FXML
    public ChoiceBox<String> powertrainChoiceBox;

    @FXML
    public DatePicker dateOfCrashPicker;

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

    @FXML
    private Rectangle roof;

    @FXML
    private Rectangle fWindshield;

    @FXML
    private Rectangle bWindshield;

    // TODO az alábbiakat megcsinálni | NE felejtsd el a carPart lista elemek sérültségét változtatni

    @FXML
    public void handleHoodClicked() {

    }

    @FXML
    public void handleFrontRightDoor() {
    }

    @FXML
    public void handleBackRightDoor() {
    }

    @FXML
    public void handleBackLeftDoor() {
    }

    @FXML
    public void handleFrontLeftDoor() {
    }

    @FXML
    public void handleTrunkClicked() {
    }

    @FXML
    public void handleFrontWindshield() {
    }

    @FXML
    public void handleBackWindshield() {
    }

    public void handleRoof() {
    }

    @FXML
    public CrashIncident processResult() {
        CrashIncident result = new CrashIncident(nameField.getText(), cityField.getText(), phoneNumberField.getText(),
                                            licensePlateField.getText().toUpperCase(),
                                            brandChoiceBox.getSelectionModel().getSelectedItem(),
                                            typeChoiceBox.getSelectionModel().getSelectedItem(),
                                            powertrainChoiceBox.getSelectionModel().getSelectedItem(),
                                            dateOfCrashPicker.getValue(), listOfCarParts);

        return result;
    }
}
