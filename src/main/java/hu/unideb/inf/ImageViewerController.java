package hu.unideb.inf;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.util.Callback;
import org.h2.command.dml.Call;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ImageViewerController implements Initializable {

    private final ObservableList<Image> images = FXCollections.observableArrayList();

    @FXML
    public ImageView imageView;

    @FXML
    public ListView<Image> listView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (!images.isEmpty()) {
            imageView.setImage(images.get(0));
        }
        listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        listView.setItems(images);
        listView.getSelectionModel().selectFirst();

        listView.getSelectionModel().selectedItemProperty().addListener((observableValue, oldValue, newValue) -> imageView.setImage(newValue));

        listView.setCellFactory(param -> new ListCell<Image>() {
            @Override
            protected void updateItem(Image image, boolean b) {
                super.updateItem(image, b);

                if (b || image == null || image.getUrl() == null) {
                    setText(null);
                } else {
                    setText(image.getUrl().substring(image.getUrl().lastIndexOf('/')+1, image.getUrl().length()));
                }
            }
        });
    }

    @FXML
    public void deleteImage() {
        Image image = listView.getSelectionModel().getSelectedItem();
        images.remove(image);
    }

    @FXML
    public void addImage() {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("JPG, PNG, JPEG", "*.jpg", "*.png", "*.jpeg"));
        List<File> files = fc.showOpenMultipleDialog(null);
        
        if (!files.isEmpty()) {
            for (File file :
                    files) {
                images.add(new Image(file.toURI().toString()));
            }
        }
    }

    public void loadImages(List<Image> images) {
        this.images.addAll(images);
    }

    public List<Image> getImages() {
        return this.images;
    }

}
