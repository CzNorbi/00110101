package hu.unideb.inf;

import hu.unideb.inf.model.Incidents;
import hu.unideb.inf.model.CrashIncident;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import javafx.scene.shape.Rectangle;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable {
    private Incidents incidents;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        incidents = new Incidents();
        incidentPicker.setItems(incidents.getListOfCrashIncidents());
    }

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
    private Rectangle fWindshield;

    @FXML
    private Rectangle bWindshield;

    // End of Car parts

    @FXML
    private AnchorPane mainAnchorPane;

    @FXML
    private Label loadDateOfIncidentLabel;

    @FXML
    private Label loadCarNameLabel;

    @FXML
    private Label statusLabel;

    @FXML
    private TextField crashUserName;

    @FXML
    private ChoiceBox<CrashIncident> incidentPicker;

    @FXML
    private Region statusBack;

    @FXML
    private TextField crashCarName;

    @FXML
    private Label loadNameLabel;

    @FXML
    private DatePicker datePicker;

    @FXML
    void handleLoadButtonPushed(ActionEvent event) {
        // TODO
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
    void handleHoodClicked() {}

    @FXML
    void handleTrunkClicked() {}

    @FXML
    void handleFrontRightDoor() {}

    @FXML
    void handleFrontLeftDoor() {}

    @FXML
    void handleBackRightDoor() {}

    @FXML
    void handleBackLeftDoor() {}

    @FXML
    void handleFrontWindshield() {}

    @FXML
    void handleBackWindshield() {}

    @FXML
    void handleRoof() {}

    @FXML
    void handleInputChange() {
        statusBack.setStyle("-fx-background-color: #FFC2C2FF;");
        statusLabel.setText("Not saved");
    }

    @FXML
    void handleButtonPushed(){
        boolean valid = true;
        if (crashUserName.getText().equals("")) {
            crashUserName.setStyle("-fx-background-color: #ffc2c2;");
            valid = false;
        }
        else {
            crashUserName.setStyle("-fx-background-color: white;");
        }
        if (crashCarName.getText().equals("")) {
            crashCarName.setStyle("-fx-background-color: #ffc2c2;");
            valid = false;
        }
        else {
            crashCarName.setStyle("-fx-background-color: white;");
        }
        if (datePicker.getValue() == null) {
            datePicker.getEditor().setStyle("-fx-background-color: #ffc2c2;");
            valid = false;
        }
        else {
            datePicker.getEditor().setStyle("-fx-background-color: white;");
        }

        if (valid) {
            statusBack.setStyle("-fx-background-color: #d7facc;");
            statusLabel.setText("Saved!");
            System.out.println("Hello world!!!");
            // Gomb funkcionalitás
            // TODO: Megváltozott
            //incidents.addCrashIncident(new CrashIncident(crashUserName.getText(), crashCarName.getText(), datePicker.getValue()));
        }
        else {
            statusBack.setStyle("-fx-background-color: #FFC2C2FF;");
            statusLabel.setText("Invalid input!");
            System.out.println("Not valid input!!!");
        }
    }

    @FXML
    void handleButtonNewIncident() {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainAnchorPane.getScene().getWindow());
        FXMLLoader fxmlLoader = new FXMLLoader();
        dialog.setTitle("Új baleset felvétele");
        dialog.setHeaderText("Használd ezt az ablakot új baleset felvételéhez");
        fxmlLoader.setLocation(getClass().getResource("/view/NewIncidentDialog.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e) {
            System.out.println("Nem sikerült az új ablakot betölteni");
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);

        Optional<ButtonType> result = dialog.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK)
        {
            // Megadott adatok elmentése
            NewCrashDialogController controller = fxmlLoader.getController();
            CrashIncident newCrash = controller.processResult();
            // TODO Listába beletenni
        }
    }
}
