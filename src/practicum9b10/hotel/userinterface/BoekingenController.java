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
import java.util.List;

public class BoekingenController {
    @FXML private TextField naamVeld;
    @FXML private TextField adresVeld;
    @FXML private DatePicker btnAankomstDatumVeld;
    @FXML private DatePicker btnVertrekDatumVeld;
    @FXML private ComboBox<KamerType> btnKamerTypeVeld;
    @FXML private Button btnResetVeld;
    @FXML private Button btnBoekVeld;
    @FXML private Label LabelBerichtEnFoutmelding;

    private Hotel hotel = Hotel.getHotel();
    public void initialize(){
        List<KamerType> kamerTypen = hotel.getKamerTypen();
        // Zet de lijst in ComboBox
        btnKamerTypeVeld.setItems(FXCollections.observableArrayList(kamerTypen));
    }

    public void onActionbBtnKamerType(ActionEvent event) {
        toonBoekingen();
    }

    private void toonBoekingen() {
    }

    public void onActionNaamVeld(ActionEvent event) {}
    public void onActionAdresVeld(ActionEvent event) {}
    public void onActionbBtnAankomstDatum(ActionEvent event) {}
    public void onActionbBtnVertrekDatum(ActionEvent event) {}
    public void handleButtonReset(ActionEvent event) {

        naamVeld.setText("");
        adresVeld.setText("");
        btnAankomstDatumVeld.setValue(null);
        btnVertrekDatumVeld.setValue(null);
        btnKamerTypeVeld.setValue(null);

        LabelBerichtEnFoutmelding.setText(" ");

    }
    public void nieuweBoeking(ActionEvent event) {
        String naam = naamVeld.getText();
        String adres = adresVeld.getText();
        LocalDate aankomstDatum = btnAankomstDatumVeld.getValue();
        LocalDate vertrekDatum = btnVertrekDatumVeld.getValue();
        KamerType kamerType = btnKamerTypeVeld.getValue();
        LocalDate vandaag = LocalDate.now();

        if (naam == null || naam.equals("")) {
            LabelBerichtEnFoutmelding.setText("Foutmelding: naam niet ingevuld!");
            return;
        }
        if (adres == null || adres.equals("")) {
            LabelBerichtEnFoutmelding.setText("Foutmelding: dres  niet ingevuld!");
        }
        if (aankomstDatum == null) {
            LabelBerichtEnFoutmelding.setText("Foutmelding: Kies een aankomstdatum niet ingevuld!");
        }
        if (vertrekDatum == null) {
            LabelBerichtEnFoutmelding.setText("Foutmelding: vertrekdatum niet ingevuld!!");
        }
        if (kamerType == null) {
            LabelBerichtEnFoutmelding.setText("Foutmelding: kamertype niet ingevuld!");
        }
        if (aankomstDatum.isBefore(vandaag)) {
            LabelBerichtEnFoutmelding.setText("Foutmelding: aankomstdatum is in het verleden!");
        }
        if (vertrekDatum.isBefore(vandaag)) {
            LabelBerichtEnFoutmelding.setText("Foutmelding: vertrekdatum is in het verleden!");
        }
        if (aankomstDatum.isAfter(vertrekDatum) || aankomstDatum.equals(vertrekDatum)) {
            LabelBerichtEnFoutmelding.setText("Foutmelding: aankomstdatum moet voor vertrekdatum zijn!");
        }

        try {
            Boeking nieuweBoeking = hotel.voegBoekingToe(aankomstDatum, vertrekDatum, naam, adres, kamerType);
            LabelBerichtEnFoutmelding.setText("Boeking gelukt voor " + naam + "!");
            Stage scherm = (Stage) btnBoekVeld.getScene().getWindow();
            scherm.close();
        } catch (Exception e) {
            LabelBerichtEnFoutmelding.setText(e.getMessage());
        }
    }
}


