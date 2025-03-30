package practicum9b10.hotel.userinterface;

import practicum9b10.hotel.model.Boeking;
import practicum9b10.hotel.model.Hotel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class HotelOverzichtController {
    @FXML private Label hotelnaamLabel;
    @FXML private ListView boekingenListView;
    @FXML private DatePicker overzichtDatePicker;

    private Hotel hotel = Hotel.getHotel();

    public void initialize() {
        hotelnaamLabel.setText("Boekingen hotell " + hotel.getNaam());
        overzichtDatePicker.setValue(LocalDate.now());
        toonBoekingen();
    }

    public void toonVorigeDag(ActionEvent actionEvent) {
        LocalDate dagEerder = overzichtDatePicker.getValue().minusDays(1);
        overzichtDatePicker.setValue(dagEerder);
    }

    public void toonVolgendeDag(ActionEvent actionEvent) {
        LocalDate dagLater = overzichtDatePicker.getValue().plusDays(1);
        overzichtDatePicker.setValue(dagLater);
    }

    public void nieuweBoeking(ActionEvent actionEvent) {
//        System.out.println("nieuweBoeking() is nog niet geïmplementeerd!");
        try {
            // Maak in je project een nieuwe FXML-pagina om boekingen te kunnen invoeren
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Boekingen.fxml"));
            Parent root = loader.load();
            // Open de nieuwe pagina in deze methode
            Stage boekingScherm = new Stage();
            boekingScherm.setTitle("Hotel "+ hotel.getNaam() + ": schrijf uw boeking in.");
            boekingScherm.setScene(new Scene(root));
            // Zorg dat de gebruiker ondertussen geen gebruik kan maken van de HotelOverzicht-pagina
            boekingScherm.initModality(Modality.APPLICATION_MODAL);
            // Update na sluiten van de nieuwe pagina het boekingen-overzicht
            boekingScherm.showAndWait();
            toonBoekingen();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void toonBoekingen() {
        // System.out.println("toonBoekingen() is nog niet geïmplementeerd!");
        LocalDate vandaag = LocalDate.now();
        ObservableList<String> boekingen = FXCollections.observableArrayList();

        LocalDate geselecteerdeDatum = overzichtDatePicker.getValue();

        // Vraag de boekingen op bij het Hotel-object.
        List<Boeking> alleBoekingen = hotel.getBoekingen();
        for (Boeking boeking : alleBoekingen) {
            LocalDate vertrekDatum = boeking.getVertrekDatum();
            LocalDate aankomstDatum = boeking.getAankomstDatum();

            boolean vertrekNietVoorGeselecteerdeDatum = !vertrekDatum.isBefore(geselecteerdeDatum);
            boolean aankomstNietNaGeselecteerdeDatum = !aankomstDatum.isAfter(geselecteerdeDatum);

            if (!aankomstDatum.isBefore(vandaag) && !vertrekDatum.isBefore(vandaag)) {
                // Voeg voor elke boeking in nette tekst (string) toe aan de boekingen-lijst.
                String boekingDetails = "Incheck: " + aankomstDatum
                        + " uitcheck: " + vertrekDatum
                        + " Kamer: " + boeking.getKamer().getKamerNummer()
                        + " Klant: " + boeking.getBoeker().getNaam();

                // Voeg voor elke boeking in nette tekst (string) toe aan de boekingen-lijst.
                boekingen.add(boekingDetails);
            }
        }

        boekingenListView.setItems(boekingen);
    }
}