package hu.unideb.inf;

import hu.unideb.inf.model.Client;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.IOException;

public class LoginWindowController {

    @FXML
    private AnchorPane mainAnchorPane;

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
        final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("cziers.incident");
        final EntityManager entityManager = entityManagerFactory.createEntityManager();

        Client c = new Client();
        c.setName("John Smith");
        c.setCity("Debrecen");
        c.setPhone("062069420");

        entityManager.getTransaction().begin();
        entityManager.persist(c);
        entityManager.getTransaction().commit();

        loadMainWindow();
    }
}
