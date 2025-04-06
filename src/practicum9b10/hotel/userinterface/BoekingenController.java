package practicum9b10.hotel.userinterface;

import practicum9b10.hotel.model.Boeking;
import practicum9b10.hotel.model.Hotel;
import practicum9b10.hotel.model.KamerType;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
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

    public void initialize() {
        List<KamerType> kamerTypen = hotel.getKamerTypen();
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
        String naam = naamVeld.getText().trim();
        String adres = adresVeld.getText().trim();
        LocalDate aankomstDatum = btnAankomstDatumVeld.getValue();
        LocalDate vertrekDatum = btnVertrekDatumVeld.getValue();
        KamerType kamerType = btnKamerTypeVeld.getValue();
        LocalDate vandaag = LocalDate.now();

        LabelBerichtEnFoutmelding.setText("");

        boolean foutOpgetreden = false;


        if (naam.equals("")) {
            LabelBerichtEnFoutmelding.setText("Fout: geen naam!\n");
            foutOpgetreden = true;
        }
        if (adres.equals("")) {
            LabelBerichtEnFoutmelding.setText("Fout: geen adres!\n");
            foutOpgetreden = true;
        }

        if (aankomstDatum == null) {
            LabelBerichtEnFoutmelding.setText("Fout: kies een aankomstdatum!\n");
            foutOpgetreden = true;
        }
        if (aankomstDatum != null && aankomstDatum.isBefore(vandaag)) {
            LabelBerichtEnFoutmelding.setText("Fout: aankomst is al geweest!\n");
            foutOpgetreden = true;
        }

        if (vertrekDatum == null) {
            LabelBerichtEnFoutmelding.setText("Fout: geen vertrekdatum!\n");
            foutOpgetreden = true;
        }
        if (vertrekDatum != null && vertrekDatum.isBefore(vandaag)) {
            LabelBerichtEnFoutmelding.setText("Fout: vertrek is al geweest!\n");
            foutOpgetreden = true;
        }
        if (aankomstDatum != null && vertrekDatum != null) {
            if (vertrekDatum.isBefore(aankomstDatum) || aankomstDatum.equals(vertrekDatum)) {
                LabelBerichtEnFoutmelding.setText("Fout: aankomst moet voor vertrek zijn!\n");
                foutOpgetreden = true;
            }
        }

        if (kamerType == null) {
            LabelBerichtEnFoutmelding.setText("Fout: geen kamer gekozen!\n");
            foutOpgetreden = true;
        }

        if (foutOpgetreden) {
            return;
        }

        try {
            Boeking nieuweBoeking = hotel.voegBoekingToe(aankomstDatum, vertrekDatum, naam, adres, kamerType);
            LabelBerichtEnFoutmelding.setText("Boeking gelukt voor " + naam + "!");
            Stage scherm = (Stage) btnBoekVeld.getScene().getWindow();
            scherm.close();
        } catch (Exception e) {
            LabelBerichtEnFoutmelding.setText("Oeps: " + e.getMessage());
        }
    }
}