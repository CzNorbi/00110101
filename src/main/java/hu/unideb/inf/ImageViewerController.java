package hu.unideb.inf;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ImageViewerController implements Initializable {

    private final ObservableList<File> files = FXCollections.observableArrayList();

    @FXML
    public ImageView imageView;

    @FXML
    public ListView<File> listView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (!files.isEmpty()) {
            imageView.setImage(new Image(files.get(0).toURI().toString()));
        }
        listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        listView.setItems(files);
        listView.getSelectionModel().selectFirst();

        listView.getSelectionModel().selectedItemProperty().addListener((observableValue, oldValue, newValue)
                -> imageView.setImage(new Image(newValue.toURI().toString())));

        listView.setCellFactory(param -> new ListCell<>() {
            @Override
            protected void updateItem(File file, boolean b) {
                super.updateItem(file, b);

                if (b || file == null) {
                    setText(null);
                } else {
                    setText(file.getName());
                }
            }
        });
    }

    @FXML
    public void deleteFile() {
        File file = listView.getSelectionModel().getSelectedItem();
        files.remove(file);
    }

    @FXML
    public void addFile() {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("JPG, PNG, JPEG", "*.jpg", "*.png", "*.jpeg"));
        List<File> uploaded = fc.showOpenMultipleDialog(null);
        
        if (!uploaded.isEmpty()) {
            files.addAll(uploaded);
        }
    }

    public void loadFiles(List<File> files) {
        this.files.addAll(files);
    }

    public List<File> getFiles() {
        return this.files;
    }

}
