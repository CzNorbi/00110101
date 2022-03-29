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
    void handleFrontWindshield() {
        if (fWindshield.getStyle().equals("-fx-fill: #ffc2c2;")) {
            fWindshield.setStyle("-fx-fill: dodgerblue;");
            System.out.println("Declicked!");
        } else {
            fWindshield.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("fWindshield Clicked!");
        }
    }

    @FXML
    void handleBackWindshield() {
        if (bWindshield.getStyle().equals("-fx-fill: #ffc2c2;")) {
            bWindshield.setStyle("-fx-fill: dodgerblue;");
            System.out.println("Declicked!");
        } else {
            bWindshield.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("bWindshield Clicked!");
        }
    }

    public void handleRoof() {
        if (roof.getStyle().equals("-fx-fill: #ffc2c2;")) {
            roof.setStyle("-fx-fill: white;");
            System.out.println("Declicked!");
        } else {
            roof.setStyle("-fx-fill: #ffc2c2;");
            System.out.println("blDoor Clicked!");
        }
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
