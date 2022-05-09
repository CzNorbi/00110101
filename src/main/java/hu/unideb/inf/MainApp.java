package hu.unideb.inf;

import hu.unideb.inf.model.FileCrashDAO;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/view/MainWindow.fxml"));
        Scene scene = new Scene(loader.load());
        stage.getIcons().add(new Image("file:icon.png"));
        stage.setResizable(false);
        scene.getStylesheets().add("/styles/Styles.css");
        stage.setTitle("Czier's Incident");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        launch(args);
    }

}
