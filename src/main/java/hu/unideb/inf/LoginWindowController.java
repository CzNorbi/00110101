package hu.unideb.inf;

import hu.unideb.inf.model.CrashIncident;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class LoginWindowController {

    @FXML
    private AnchorPane loginAnchorPane;

    @FXML
    private RadioButton AdminMode;

    @FXML
    private RadioButton UserMode;

    @FXML
    private TextField Name;

    @FXML
    private TextField Password;

    @FXML
    private Button LoginButton;

    boolean checkInput(TextField Name, TextField Password) {
        return true;
    }

    @FXML
    void loadMainWindow() throws IOException{
        Stage stage =  (Stage) LoginButton.getScene().getWindow();;
        Parent root;

        root = FXMLLoader.load(getClass().getResource("/view/MainWindow.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void handleLoginButton() throws IOException {
        if (checkInput(Name, Password)) {
            loadMainWindow();
        }
    }

    @FXML
    void handleRegistrationButton() {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(loginAnchorPane.getScene().getWindow());
        FXMLLoader fxmlLoader = new FXMLLoader();
        dialog.setTitle("Regisztráció");
        fxmlLoader.setLocation(getClass().getResource("/view/RegistrationWindow.fxml"));
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
            // TODO adat eltárolása
        }
    }

}
