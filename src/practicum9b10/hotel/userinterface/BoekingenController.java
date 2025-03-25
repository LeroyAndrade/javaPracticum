package  practicum9b10.hotel.userinterface;


import practicum9b10.hotel.model.Boeking;
import practicum9b10.hotel.model.Hotel;
import practicum9b10.hotel.model.KamerType;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*; // This imports Button, ComboBox, TextField, DatePicker, Label, etc.
import javafx.stage.Stage;

import java.time.LocalDate;

public class BoekingenController {
    @FXML private TextField naamVeld;
    @FXML private TextField adresVeld;
    @FXML private DatePicker btnAankomstDatumVeld;
    @FXML private DatePicker btnVertrekDatumVeld;
    @FXML private ComboBox<KamerType> btnKamerTypeVeld;
    @FXML private Button btnResetVeld;
    @FXML private Button btnBoekVeld;
    

    public void onActionbBtnKamerType(ActionEvent event) {
//        Kopie van werkend getHotel, reverse het naar onActionbBtnKamerType
//        hotelnaamLabel.setText("Boekingen hotell " + hotel.getNaam());
//        overzichtDatePicker.setValue(LocalDate.now());
//        toonBoekingen();

    }
    public void onActionNaamVeld(ActionEvent event) {}
    public void onActionAdresVeld(ActionEvent event) {}
    public void onActionbBtnAankomstDatum(ActionEvent event) {}
    public void onActionbBtnVertrekDatum(ActionEvent event) {}
    public void handleButtonReset(ActionEvent event) {}
    public void nieuweBoeking(ActionEvent event) {}
    }


