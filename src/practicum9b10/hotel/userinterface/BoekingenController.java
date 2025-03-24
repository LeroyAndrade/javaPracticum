package  practicum9b10.hotel.userinterface;


import practicum9b10.hotel.model.Boeking;
import practicum9b10.hotel.model.Hotel;
import practicum9b10.hotel.model.Kamer;
import practicum9b10.hotel.model.KamerType;
import practicum9b10.hotel.model.Klant;
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

