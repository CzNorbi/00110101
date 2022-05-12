package hu.unideb.inf;

import hu.unideb.inf.model.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class NewIncidentDialogController {

    // CarParts

    private final CarParts aParts = new CarParts();
    private final CarParts bParts = new CarParts();

    // Lists of images

    private final List<File> aFiles = new ArrayList<>();
    private final List<File> bFiles = new ArrayList<>();

    // ImageViewer buttons

    @FXML
    public Button buttonImageViewerA;

    @FXML
    public Button buttonImageViewerB;

    //Incident data
    @FXML
    private TextArea locationOfIncident;

    @FXML
    private DateTimePicker timeOfIncident;

    // Person A data
    @FXML
    private TextField aFirstName;

    @FXML
    private TextField aLastName;

    @FXML
    private DatePicker aDateOfBirth;

    @FXML
    private TextArea aAddress;

    @FXML
    private TextField aDrivingLicenseNumber;

    @FXML
    private TextField aPhone;

    //Car A data
    @FXML
    private TextField aCarBrand;

    @FXML
    private TextField aCarType;

    @FXML
    private TextField aCarLicensePlate;

    @FXML
    private TextArea aInsurer;

    @FXML
    private TextArea aComment;

    //Car A parts
    @FXML
    private Rectangle aHood;

    @FXML
    private Rectangle aRoof;

    @FXML
    private Rectangle aTrunk;

    @FXML
    private Rectangle aBackLeftDoor;

    @FXML
    private Rectangle aBackRightDoor;

    @FXML
    private Rectangle aBackLeftWheel;

    @FXML
    private Rectangle aBackRightWheel;

    @FXML
    private Rectangle aBackWindshield;

    @FXML
    private Rectangle aFrontLeftDoor;

    @FXML
    private Rectangle aFrontLeftWheel;

    @FXML
    private Rectangle aFrontRightDoor;

    @FXML
    private Rectangle aFrontRightWheel;

    @FXML
    private Rectangle aFrontWindshield;

    //Person B data
    @FXML
    private TextField bFirstName;

    @FXML
    private TextField bLastName;

    @FXML
    private DatePicker bDateOfBirth;

    @FXML
    private TextArea bAddress;

    @FXML
    private TextField bDrivingLicenseNumber;

    @FXML
    private TextField bPhone;

    //Car B data
    @FXML
    private TextField bCarBrand;

    @FXML
    private TextField bCarType;

    @FXML
    private TextField bCarLicensePlate;

    @FXML
    private TextArea bInsurer;

    @FXML
    private TextArea bComment;

    //Car B parts
    @FXML
    private Rectangle bBackLeftDoor;

    @FXML
    private Rectangle bBackLeftWheel;

    @FXML
    private Rectangle bBackRightDoor;

    @FXML
    private Rectangle bBackRightWheel;

    @FXML
    private Rectangle bBackWindshield;

    @FXML
    private Rectangle bFrontLeftDoor;

    @FXML
    private Rectangle bFrontLeftWheel;

    @FXML
    private Rectangle bFrontRightDoor;

    @FXML
    private Rectangle bFrontRightWheel;

    @FXML
    private Rectangle bFrontWindshield;

    @FXML
    private Rectangle bHood;

    @FXML
    private Rectangle bRoof;

    @FXML
    private Rectangle bTrunk;

    @FXML
    private GridPane gridPane;

    @FXML
    CarParts.Level damageLevel(Rectangle carPart)
    {
        CarParts.Level level = CarParts.Level.NONE;
        String basicFill = "-fx-fill: white";

        if (carPart.equals(aBackWindshield) || carPart.equals(aFrontWindshield) || carPart.equals(bBackWindshield) ||
                carPart.equals(bFrontWindshield)){
            basicFill = "-fx-fill: dodgerblue;";
        }
        else if (carPart.equals(aBackLeftWheel) || carPart.equals(aBackRightWheel) || carPart.equals(aFrontLeftWheel) ||
                carPart.equals(aFrontRightWheel) || carPart.equals(bBackLeftWheel) || carPart.equals(bBackRightWheel) ||
                carPart.equals(bFrontLeftWheel) || carPart.equals(bFrontRightWheel)) {
            basicFill = "-fx-fill: black;";
        }

        if (carPart.getStyle().equals("-fx-fill: #ff0000;")) {
            carPart.setStyle(basicFill);
            level = CarParts.Level.NONE;
        }
        else if (carPart.getStyle().equals("-fx-fill: #ff5c5c;")){
            carPart.setStyle("-fx-fill: #ff0000;");
            level = CarParts.Level.SEVERE;
        }
        else if (carPart.getStyle().equals("-fx-fill: #ffc2c2;"))
        {
            carPart.setStyle("-fx-fill: #ff5c5c;");
            level = CarParts.Level.MODERATE;
        }
        else {
            carPart.setStyle("-fx-fill: #ffc2c2;");
            level = CarParts.Level.MINOR;
        }
        return level;
    }

    // A Events
    @FXML
    void handleAHoodClicked(MouseEvent event) {
        aParts.setHood(damageLevel(aHood));
        System.out.println(aParts.getHood());
    }

    @FXML
    void handleARoofClicked(MouseEvent event) {
        System.out.println(damageLevel(aRoof));
        aParts.setRoof(CarParts.next(aParts.getRoof()));
    }

    @FXML
    void handleATrunkClicked(MouseEvent event) {
        System.out.println(damageLevel(aTrunk));
        aParts.setTrunk(CarParts.next(aParts.getTrunk()));
    }

    @FXML
    void handleABackLeftDoorClick(MouseEvent event) {
        System.out.println(damageLevel(aBackLeftDoor));
        aParts.setBlDoor(CarParts.next(aParts.getBlDoor()));
    }

    @FXML
    void handleABackRightDoorClicked(MouseEvent event) {
        System.out.println(damageLevel(aBackRightDoor));
        aParts.setBrDoor(CarParts.next(aParts.getBrDoor()));
    }

    @FXML
    void handleAFrontLeftDoorClick(MouseEvent event) {
        System.out.println(damageLevel(aFrontLeftDoor));
        aParts.setFlDoor(CarParts.next(aParts.getFlDoor()));
    }

    @FXML
    void handleAFrontRightDoorClicked(MouseEvent event) {
        System.out.println(damageLevel(aFrontRightDoor));
        aParts.setFrDoor(CarParts.next(aParts.getFrDoor()));
    }

    @FXML
    void handleABackLeftWheelClick(MouseEvent event) {
        System.out.println(damageLevel(aBackLeftWheel));
        aParts.setBlWheel(CarParts.next(aParts.getBlWheel()));
    }

    @FXML
    void handleABackRightWheelClicked(MouseEvent event) {
        System.out.println(damageLevel(aBackRightWheel));
        aParts.setBrWheel(CarParts.next(aParts.getBrWheel()));
    }

    @FXML
    void handleAFrontLeftWheelClicked(MouseEvent event) {
        System.out.println(damageLevel(aFrontLeftWheel));
        aParts.setFlWheel(CarParts.next(aParts.getFlWheel()));
    }

    @FXML
    void handleAFrontRightWheelClicked(MouseEvent event) {
        System.out.println(damageLevel(aFrontRightWheel));
        aParts.setFrWheel(CarParts.next(aParts.getFrWheel()));
    }

    @FXML
    void handleABackWindshieldClicked(MouseEvent event) {
        System.out.println(damageLevel(aBackWindshield));
        aParts.setbWindshield(CarParts.next(aParts.getbWindshield()));
    }

    @FXML
    void handleAFrontWindshieldClicked(MouseEvent event) {
        System.out.println(damageLevel(aFrontWindshield));
        aParts.setfWindshield(CarParts.next(aParts.getfWindshield()));
    }

    // B Events
    @FXML
    void handleBHoodClicked(MouseEvent event) {
        System.out.println(damageLevel(bHood));
        bParts.setHood(CarParts.next(bParts.getHood()));
    }

    @FXML
    void handleBRoofClicked(MouseEvent event) {
        System.out.println(damageLevel(bRoof));
        bParts.setRoof(CarParts.next(bParts.getRoof()));
    }

    @FXML
    void handleBTrunkClicked(MouseEvent event) {
        System.out.println(damageLevel(bTrunk));
        bParts.setTrunk(CarParts.next(bParts.getTrunk()));
    }

    @FXML
    void handleBBackLeftDoorClick(MouseEvent event) {
        System.out.println(damageLevel(bBackLeftDoor));
        bParts.setBlDoor(CarParts.next(bParts.getBlDoor()));
    }

    @FXML
    void handleBBackRightDoorClicked(MouseEvent event) {
        System.out.println(damageLevel(bBackRightDoor));
        bParts.setBrDoor(CarParts.next(bParts.getBrDoor()));
    }

    @FXML
    void handleBFrontLeftDoorClick(MouseEvent event) {
        System.out.println(damageLevel(bFrontLeftDoor));
        bParts.setFlDoor(CarParts.next(bParts.getFlDoor()));
    }

    @FXML
    void handleBFrontRightDoorClicked(MouseEvent event) {
        System.out.println(damageLevel(bFrontRightDoor));
        bParts.setFrDoor(CarParts.next(bParts.getFrDoor()));
    }

    @FXML
    void handleBBackLeftWheelClick(MouseEvent event) {
        System.out.println(damageLevel(bBackLeftWheel));
        bParts.setBlWheel(CarParts.next(bParts.getBlWheel()));
    }

    @FXML
    void handleBBackRightWheelClicked(MouseEvent event) {
        System.out.println(damageLevel(bBackRightWheel));
        bParts.setBrWheel(CarParts.next(bParts.getBrWheel()));
    }

    @FXML
    void handleBFrontLeftWheelClicked(MouseEvent event) {
        System.out.println(damageLevel(bFrontLeftWheel));
        bParts.setFlWheel(CarParts.next(bParts.getFlWheel()));
    }

    @FXML
    void handleBFrontRightWheelClicked(MouseEvent event) {
        System.out.println(damageLevel(bFrontRightWheel));
        bParts.setFrWheel(CarParts.next(bParts.getFrWheel()));
    }

    @FXML
    void handleBBackWindshieldClicked(MouseEvent event) {
        System.out.println(damageLevel(bBackWindshield));
        bParts.setbWindshield(CarParts.next(bParts.getbWindshield()));
    }

    @FXML
    void handleBFrontWindshieldClicked(MouseEvent event) {
        System.out.println(damageLevel(bFrontWindshield));
        bParts.setfWindshield(CarParts.next(bParts.getfWindshield()));
    }

    @FXML
    void setColorByDamageLevel(Rectangle carPart, CarParts.Level level)
    {
        if (level == CarParts.Level.NONE)
        {
            if (carPart.equals(aBackWindshield) || carPart.equals(aFrontWindshield) || carPart.equals(bBackWindshield) ||
                    carPart.equals(bFrontWindshield)){
                carPart.setStyle("-fx-fill: dodgerblue;");
            }
            else if (carPart.equals(aBackLeftWheel) || carPart.equals(aBackRightWheel) || carPart.equals(aFrontLeftWheel) ||
                    carPart.equals(aFrontRightWheel) || carPart.equals(bBackLeftWheel) || carPart.equals(bBackRightWheel) ||
                    carPart.equals(bFrontLeftWheel) || carPart.equals(bFrontRightWheel)) {
                carPart.setStyle("-fx-fill: black;");
            }
            else {
                carPart.setStyle("-fx-fill: white;");
            }
        }
        else if (level == CarParts.Level.MINOR)
        {
            carPart.setStyle("-fx-fill: #ffc2c2;");
        }
        else if (level == CarParts.Level.MODERATE)
        {
            carPart.setStyle("-fx-fill: #ff5c5c;");
        }
        else
        {
            carPart.setStyle("-fx-fill: #ff0000;");
        }
    }

    public void openImageViewerA(MouseEvent mouseEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/ImageViewer.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("Képek módosítása");
            stage.getIcons().add(new Image("file:icon.png"));
            stage.setResizable(false);
            ImageViewerController controller = fxmlLoader.getController();
            controller.loadFiles(aFiles);
            stage.showAndWait();
            aFiles.clear();
            aFiles.addAll(controller.getFiles());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void openImageViewerB(MouseEvent mouseEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/ImageViewer.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("Képek módosítása");
            stage.getIcons().add(new Image("file:icon.png"));
            stage.setResizable(false);
            ImageViewerController controller = fxmlLoader.getController();
            controller.loadFiles(bFiles);
            stage.showAndWait();
            bFiles.clear();
            bFiles.addAll(controller.getFiles());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // bemenet ellenőrzés
    public boolean isEmptyTextField(TextField tf)
    {
        if (tf.getText().trim().isEmpty()) {
            tf.setStyle("-fx-background-color: #ff8080;");
            return true;
        }
        else {
            tf.setStyle("-fx-background-color: white;");
            return false;
        }
    }

    public boolean isEmptyTextArea(TextArea ta)
    {
        if (ta.getText().trim().isEmpty()) {
            ta.setStyle("-fx-control-inner-background: #ff8080;");
            return true;
        }
        else {
            ta.setStyle("-fx-control-inner-background: white;");
            return false;
        }
    }

    boolean isEmptyDatePicker(DatePicker dp)
    {
        if (dp.getValue() == null) {
            dp.setStyle("-fx-control-inner-background: #ff8080;");
            return true;
        }
        else {
            dp.setStyle("-fx-control-inner-background: white;");
            return false;
        }
    }

    boolean isEmptyDateTimePicker(DateTimePicker dp)
    {
        if (dp.getValue() == null) {
            dp.setStyle("-fx-control-inner-background: #ff8080;");;
            return true;
        }
        else {
            dp.setStyle("-fx-control-inner-background: white;");
            return false;
        }
    }

    boolean isValidLicensePlate(TextField tf)
    {
        String lp = tf.getText().trim();

        if (lp.isEmpty())
        {
            tf.setStyle("-fx-background-color: #ff8080;");
            return false;
        }

        if (lp.length() != 7)
        {
            tf.setStyle("-fx-background-color: #ff8080;");
            return false;
        }

        char[] chars = lp.toCharArray();
        if ((Character.isLetter(chars[0]) == false) || (Character.isLetter(chars[1]) == false) || (Character.isLetter(chars[2]) == false) ||
                (Character.isDigit(chars[4]) == false) || (Character.isDigit(chars[5]) == false) || (Character.isDigit(chars[6]) == false) ||
                (chars[3] != '-'))
        {
            tf.setStyle("-fx-background-color: #ff8080;");
            return false;
        }

        tf.setStyle("-fx-background-color: white;");
        return true;
    }

    boolean isValidDrivingLicenseNumber(TextField tf)
    {
        if (isEmptyTextField(tf))
        {
            tf.setStyle("-fx-background-color: #ff8080;");
            return false;
        }

        char[] chars = tf.getText().trim().toCharArray();

        if (chars.length != 8)
        {
            tf.setStyle("-fx-background-color: #ff8080;");
            return false;
        }

        if (!Character.isLetter(chars[0]) || !Character.isLetter(chars[1]))
        {
            tf.setStyle("-fx-background-color: #ff8080;");
            return false;
        }

        for (int i = 2; i < 8; i++)
        {
            if (Character.isDigit(chars[i]) == false)
            {
                tf.setStyle("-fx-background-color: #ff8080;");
                return false;
            }
        }

        tf.setStyle("-fx-background-color: white;");
        return true;
    }

    boolean isValidPhoneNumber(TextField tf)
    {
        if (isEmptyTextField(tf))
        {
            tf.setStyle("-fx-background-color: #ff8080;");
            return false;
        }

        String phoneNumber = tf.getText().trim();

        if (phoneNumber.length() != 11 || phoneNumber.startsWith("06") == false)
        {
            tf.setStyle("-fx-background-color: #ff8080;");
            return false;
        }

        for (char c: phoneNumber.toCharArray()) {
            if (Character.isDigit(c) == false)
            {
                tf.setStyle("-fx-background-color: #ff8080;");
                return false;
            }
        }

        tf.setStyle("-fx-background-color: white;");
        return true;
    }

    boolean checkInput() {
        boolean isValid = true;
        if (isEmptyDateTimePicker(timeOfIncident))
        {
            isValid = false;
        }
        if (isEmptyTextArea(locationOfIncident))
        {
            isValid = false;
        }
        if (isEmptyTextField(aFirstName))
        {
            isValid = false;
        }
        if (isEmptyTextField(aLastName))
        {
            isValid = false;
        }
        if (isEmptyTextField(bFirstName))
        {
            isValid = false;
        }
        if (isEmptyTextField(bLastName))
        {
            isValid = false;
        }
        if (isEmptyTextArea(aAddress))
        {
            isValid = false;
        }
        if (isEmptyTextArea(bAddress))
        {
            isValid = false;
        }
        if (isEmptyTextArea(aInsurer))
        {
            isValid = false;
        }
        if (isEmptyTextArea(bInsurer))
        {
            isValid = false;
        }
        if (isEmptyDatePicker(aDateOfBirth))
        {
            isValid = false;
        }
        if (isEmptyDatePicker(bDateOfBirth))
        {
            isValid = false;
        }
        if (isEmptyTextField(aCarType))
        {
            isValid = false;
        }
        if (isEmptyTextField(aCarBrand))
        {
            isValid = false;
        }
        if (isEmptyTextField(bCarBrand))
        {
            isValid = false;
        }
        if (isEmptyTextField(bCarType))
        {
            isValid = false;
        }
        if (!isValidPhoneNumber(aPhone))
        {
            isValid = false;
        }
        if (!isValidPhoneNumber(bPhone))
        {
            isValid = false;
        }
        if (!isValidDrivingLicenseNumber(aDrivingLicenseNumber))
        {
            isValid = false;
        }
        if (!isValidDrivingLicenseNumber(bDrivingLicenseNumber))
        {
            isValid = false;
        }
        if (!isValidLicensePlate(aCarLicensePlate))
        {
            isValid = false;
        }
        if (!isValidLicensePlate(bCarLicensePlate))
        {
            isValid = false;
        }


    /*
        if isEmptyDateTimePicker(timeOfIncident) || isEmptyTextArea(locationOfIncident) || isEmptyTextField(aFirstName) ||
                isEmptyTextField(aLastName) || isEmptyTextField(bFirstName) || isEmptyTextField(bLastName) ||
                isEmptyTextArea(aAddress) || isEmptyTextArea(bAddress) || isEmptyTextArea(aInsurer) || isEmptyTextArea(bInsurer) ||
                isEmptyDatePicker(aDateOfBirth) || isEmptyDatePicker(bDateOfBirth) || isEmptyTextField(aCarBrand) ||
                isEmptyTextField(aCarType) || isEmptyTextField(bCarBrand) || isEmptyTextField(bCarType) || !isValidPhoneNumber(aPhone) ||
                !isValidPhoneNumber(bPhone) || !isValidDrivingLicenseNumber(aDrivingLicenseNumber) || !isValidDrivingLicenseNumber(bDrivingLicenseNumber) ||
                !isValidLicensePlate(aCarLicensePlate) || !isValidLicensePlate(bCarLicensePlate)) {
            isValid = false;
            }
    */

        return isValid;
    }

    @FXML
    public Crash processResult() {
        Person personA = new Person(aFirstName.getText().trim(), aLastName.getText().trim(), aDateOfBirth.getValue(), aDrivingLicenseNumber.getText().trim().toUpperCase(), aAddress.getText().trim(), aPhone.getText().trim());
        Person personB = new Person(bFirstName.getText().trim(), bLastName.getText().trim(), bDateOfBirth.getValue(), bDrivingLicenseNumber.getText().trim().toUpperCase(), bAddress.getText().trim(), bPhone.getText().trim());


        Car carA = new Car(aCarBrand.getText().trim(), aCarType.getText().trim(), aCarLicensePlate.getText().trim(), aInsurer.getText().trim(), aParts);
        Car carB = new Car(bCarBrand.getText().trim(), bCarType.getText().trim(), bCarLicensePlate.getText().trim(), bInsurer.getText().trim(), bParts);

        return new Crash(personA, personB, carA, carB, aComment.getText(), bComment.getText(), locationOfIncident.getText().trim(), timeOfIncident.getDateTimeValue(), aFiles, bFiles);
    }

    public void loadCrash(Crash crash) {
        // Location and date
        locationOfIncident.setText(crash.getCrashAddress());
        timeOfIncident.setDateTimeValue(crash.getDateOfCrash());

        // A
        aFirstName.setText(crash.getPersonA().getFirstName());
        aLastName.setText(crash.getPersonA().getLastName());
        aAddress.setText(crash.getPersonA().getAddress());
        aDrivingLicenseNumber.setText(crash.getPersonA().getDrivingLicenseNumber());
        aDateOfBirth.setValue(crash.getPersonA().getDateOfBirth());
        aPhone.setText(crash.getPersonA().getTelNum());
        aInsurer.setText(crash.getCarA().getNameOfInsurer());
        aCarLicensePlate.setText(crash.getCarA().getLicensePlate());
        aCarBrand.setText(crash.getCarA().getBrand());
        aCarType.setText(crash.getCarA().getType());
        aComment.setText(crash.getCommentA());

        // A car parts
        setColorByDamageLevel(aHood, crash.getCarA().getParts().getHood());
        setColorByDamageLevel(aTrunk, crash.getCarA().getParts().getTrunk());
        setColorByDamageLevel(aRoof, crash.getCarA().getParts().getRoof());
        setColorByDamageLevel(aBackRightDoor, crash.getCarA().getParts().getBrDoor());
        setColorByDamageLevel(aBackLeftDoor, crash.getCarA().getParts().getBlDoor());
        setColorByDamageLevel(aFrontRightDoor, crash.getCarA().getParts().getFrDoor());
        setColorByDamageLevel(aFrontLeftDoor, crash.getCarA().getParts().getFlDoor());
        setColorByDamageLevel(aBackRightWheel, crash.getCarA().getParts().getBrWheel());
        setColorByDamageLevel(aBackLeftWheel, crash.getCarA().getParts().getBlWheel());
        setColorByDamageLevel(aFrontRightWheel, crash.getCarA().getParts().getFrWheel());
        setColorByDamageLevel(aFrontLeftWheel, crash.getCarA().getParts().getFlWheel());
        setColorByDamageLevel(aBackRightDoor, crash.getCarA().getParts().getBrDoor());
        setColorByDamageLevel(aBackLeftDoor, crash.getCarA().getParts().getBlDoor());
        setColorByDamageLevel(aFrontRightDoor, crash.getCarA().getParts().getFrDoor());
        setColorByDamageLevel(aBackWindshield, crash.getCarA().getParts().getbWindshield());
        setColorByDamageLevel(aFrontWindshield, crash.getCarA().getParts().getfWindshield());

        //B
        bFirstName.setText(crash.getPersonB().getFirstName());
        bLastName.setText(crash.getPersonB().getLastName());
        bAddress.setText(crash.getPersonB().getAddress());
        bDrivingLicenseNumber.setText(crash.getPersonB().getDrivingLicenseNumber());
        bDateOfBirth.setValue(crash.getPersonB().getDateOfBirth());
        bPhone.setText(crash.getPersonB().getTelNum());
        bInsurer.setText(crash.getCarB().getNameOfInsurer());
        bCarLicensePlate.setText(crash.getCarB().getLicensePlate());
        bCarBrand.setText(crash.getCarB().getBrand());
        bCarType.setText(crash.getCarB().getType());
        bComment.setText(crash.getCommentB());

        // B car parts
        setColorByDamageLevel(bHood, crash.getCarB().getParts().getHood());
        setColorByDamageLevel(bTrunk, crash.getCarB().getParts().getTrunk());
        setColorByDamageLevel(bRoof, crash.getCarB().getParts().getRoof());
        setColorByDamageLevel(bBackRightDoor, crash.getCarB().getParts().getBrDoor());
        setColorByDamageLevel(bBackLeftDoor, crash.getCarB().getParts().getBlDoor());
        setColorByDamageLevel(bFrontRightDoor, crash.getCarB().getParts().getFrDoor());
        setColorByDamageLevel(bFrontLeftDoor, crash.getCarB().getParts().getFlDoor());
        setColorByDamageLevel(bBackRightWheel, crash.getCarB().getParts().getBrWheel());
        setColorByDamageLevel(bBackLeftWheel, crash.getCarB().getParts().getBlWheel());
        setColorByDamageLevel(bFrontRightWheel, crash.getCarB().getParts().getFrWheel());
        setColorByDamageLevel(bFrontLeftWheel, crash.getCarB().getParts().getFlWheel());
        setColorByDamageLevel(bBackRightDoor, crash.getCarB().getParts().getBrDoor());
        setColorByDamageLevel(bBackLeftDoor, crash.getCarB().getParts().getBlDoor());
        setColorByDamageLevel(bFrontRightDoor, crash.getCarB().getParts().getFrDoor());
        setColorByDamageLevel(bBackWindshield, crash.getCarB().getParts().getbWindshield());
        setColorByDamageLevel(bFrontWindshield, crash.getCarB().getParts().getfWindshield());

        // Images
        aFiles.addAll(crash.getFilesA());
        bFiles.addAll(crash.getFilesB());
    }

    public void disableInteract() {
        gridPane.setMouseTransparent(true);
        buttonImageViewerA.setMouseTransparent(false);
        buttonImageViewerB.setMouseTransparent(false);
    }
}
