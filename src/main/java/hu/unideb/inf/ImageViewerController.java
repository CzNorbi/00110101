package hu.unideb.inf;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.ResourceBundle;

public class ImageViewerController implements Initializable {

    private final ObservableList<File> files = FXCollections.observableArrayList();
    private final String path = "src/main/resources/images/";

    @FXML
    public ImageView imageView;

    @FXML
    public ListView<File> listView;
    public Button rmImg;
    public Button addImg;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (!files.isEmpty()) {
            imageView.setImage(new Image(files.get(0).toURI().toString()));
        }
        listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        listView.setItems(files);
        listView.getSelectionModel().selectFirst();

        listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<File>() {
            @Override
            public void changed(ObservableValue<? extends File> observableValue, File oldValue, File newValue) {
                if (newValue != null) {
                    imageView.setImage(new Image(newValue.toURI().toString()));
                } else {
                    imageView.setImage(null);
                }
            }
        });

        listView.setCellFactory(param -> new ListCell<>() {
            @Override
            protected void updateItem(File file, boolean b) {
                super.updateItem(file, b);

                if (b || file == null) {
                    setText(null);
                } else {
                    if (file.getName().length() >= 13) {
                        setText(file.getName().substring(13));
                    } else {
                        setText(file.getName());
                    }
                }
            }
        });
    }

    @FXML
    public void deleteFile() {
        File file = listView.getSelectionModel().getSelectedItem();
        files.remove(file);
        //noinspection ResultOfMethodCallIgnored
        file.delete();
    }

    @FXML
    public void addFile() {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("JPG, PNG, JPEG", "*.jpg", "*.png", "*.jpeg"));
        List<File> filesToStore = fc.showOpenMultipleDialog(null);

        if (!filesToStore.isEmpty()) {
            for (File file :
                    filesToStore) {
                try {
                    Path targetPath = Files.copy(file.toPath(), (new File(path + System.currentTimeMillis() + file.getName()).toPath()), StandardCopyOption.REPLACE_EXISTING);
                    files.add(targetPath.toFile());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void loadFiles(List<File> files) {
        this.files.addAll(files);
    }

    public List<File> getFiles() {
        return this.files;
    }

}
