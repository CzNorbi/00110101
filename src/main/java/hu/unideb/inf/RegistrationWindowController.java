package hu.unideb.inf;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class RegistrationWindowController {
    @FXML
    private ComboBox<Integer> Year;

    @FXML
    private ComboBox<Integer> Month;

    @FXML
    private ComboBox<Integer> Day;

    @FXML
    private TextField E_Mail;

    @FXML
    private TextField Name;

    @FXML
    private TextField Password;

    @FXML
    private TextField Phonenumber;

    @FXML
    private TextField Address;
}
