package hu.unideb.inf;

import hu.unideb.inf.MainApp;

import hu.unideb.inf.model.Crash;
import hu.unideb.inf.model.FileCrashDAO;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable {

    private ObservableList<Crash> crashes;
    private FileCrashDAO crashDAO;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        crashDAO = new FileCrashDAO();
        crashes = FXCollections.observableArrayList();

        // Adatok betöltése
        crashes.setAll(crashDAO.getCrashes());

        crashTableView.setItems(crashes);
        crashTableView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        crashTableView.getSelectionModel().selectFirst();

        // Logo hozzáadása
        Image logo = new Image("file:logo.png");
        img.setImage(logo);

        // Populate TableViewColumns
        tableColumnNameA.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPersonA().getLastName() + " " + cellData.getValue().getPersonA().getFirstName()));
        tableColumnLicensePlateA.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCarA().getLicensePlate()));
        tableColumnNameB.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPersonB().getLastName() + " " + cellData.getValue().getPersonB().getFirstName()));
        tableColumnLicensePlateB.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCarB().getLicensePlate()));
        tableColumnCrashLocation.setCellValueFactory(new PropertyValueFactory<>("crashAddress"));
        tableColumnCrashDate.setCellValueFactory(new PropertyValueFactory<>("dateOfCrash"));
    }

    @FXML
    private AnchorPane mainAnchorPane;

    @FXML
    private ImageView img;

    @FXML
    private TableView<Crash> crashTableView;

    @FXML
    private TableColumn<Crash, String> tableColumnNameA;

    @FXML
    private TableColumn<Crash, String> tableColumnLicensePlateA;

    @FXML
    private TableColumn<Crash, String> tableColumnNameB;

    @FXML
    private TableColumn<Crash, String> tableColumnLicensePlateB;

    @FXML
    private TableColumn<Crash, String> tableColumnCrashLocation;

    @FXML
    private TableColumn<Crash, LocalDateTime> tableColumnCrashDate;

    @FXML
    void handleImgClick() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Verzió: 1.3.1");
        alert.setHeaderText(null);
        alert.setContentText("Fejlesztők: Czier Norbert, Dorsonszky Máté, Szabó Gedeon, Zelei Péter \nKárbejelentő\nDátum: 2022.05.12");
        alert.showAndWait();
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

        NewIncidentDialogController controller = fxmlLoader.getController();

        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);

        final Button okButton = (Button) dialog.getDialogPane().lookupButton(ButtonType.OK);
        okButton.addEventFilter(ActionEvent.ACTION, ae -> {
            if (controller.checkInput() == false) {
                ae.consume();
            }
        });
        Optional<ButtonType> result = dialog.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK)
        {
            // Megadott adatok elmentése
            crashDAO.saveCrash(controller.processResult());
            crashes.setAll(crashDAO.getCrashes());
        }
    }

    @FXML
    void handleButtonLoadIncident() {
        Crash selectedCrash = crashTableView.getSelectionModel().getSelectedItem();
        if (selectedCrash != null) {
            Dialog<ButtonType> dialog = new Dialog<>();
            dialog.initOwner(mainAnchorPane.getScene().getWindow());
            FXMLLoader fxmlLoader = new FXMLLoader();
            dialog.setTitle("Meglévő baleset szerkesztése");
            dialog.setHeaderText("Használd ezt az ablakot a szerkesztéshez");
            fxmlLoader.setLocation(getClass().getResource("/view/NewIncidentDialog.fxml"));
            try {
                dialog.getDialogPane().setContent(fxmlLoader.load());
            } catch (IOException e) {
                System.out.println("Nem sikerült az új ablakot betölteni");
                e.printStackTrace();
                return;
            }

            NewIncidentDialogController controller = fxmlLoader.getController();
            controller.loadCrash(selectedCrash);
            controller.disableEdit();


            dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

            Optional<ButtonType> result = dialog.showAndWait();
        }
    }

    public void handleButtonDeleteIncident(ActionEvent actionEvent) {
        Crash crashToDelete = crashTableView.getSelectionModel().getSelectedItem();
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Káresemény törlése");
        alert.setHeaderText("Korábban tárolt káresemény törlése");
        alert.setContentText("Biztos az eltávolításban?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            crashDAO.deleteCrash(crashToDelete);
            crashes.setAll(crashDAO.getCrashes());
        } else {
            // ... puki
        }
        // TODO: Hozzárendelt fájlok eltávolítása
    }
}
