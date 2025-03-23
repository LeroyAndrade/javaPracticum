package hotel.userinterface;

import hotel.model.Boeking;
import hotel.model.Hotel;
import hotel.model.Kamer;
import hotel.model.KamerType;
import hotel.model.Klant;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

import java.awt.*;
public class BoekingenController {
    @FXML private TextField text;
    @FXML private Label label;
    @FXML private DatePicker aankomstDatum;
    @FXML private DatePicker vertrekDatum;
    @FXML private ComboBox<Klant> klantComboBox;
    @FXML private ComboBox<KamerType> kamerTypeComboBox;
    @FXML private Button resetButton;
    @FXML private Button saveButton;
}


