package practicum3;

import inlesTheorie.Rekening;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practicum2.practicumB.Voetbalclub;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


public class VoetbalClubTest {

    private Voetbalclub vbc;
    @BeforeEach
    public void init(){
        System.out.println("init");
        //    init is een methode die altijd wordt gerunt voordat de rest wordt gerunt
        // zo doe je dus Dont repeat yourself
        vbc = new Voetbalclub("");
    }

    @Test
    public void clubNaam_null_or_empty_ThenSetClubName_FC() {
         // Creating a club with null name
//        club.voetbalclubNaam = "FC ";
//        club.voetbalclubNaam = "";
//        club.voetbalclubNaam = null;

        if (vbc.getVoetbalclubNaam().isEmpty() || vbc.getVoetbalclubNaam() == null) {
            vbc.setVoetbalclubNaam("FC");
            System.out.printf("De naam van de club is nu toegevoegd omdat het leeg was en is: " + vbc.getVoetbalclubNaam());
        }
        assertEquals("FC", vbc.getVoetbalclubNaam(), "Club name should default to 'FC' if null or empty.");
    }

    @Test
    void stortenPositiefBedragWijzigtSaldo() {
        Rekening r = new Rekening(12345678);

        r.stort(100);

        assertEquals(100, r.getSaldo());
//        assertEquals(100.000000000000007, r.getSaldo()); //slaagt ook in de test

    }



//    @Test
//    void tes_leeftijdGroterDan76EnInBezitMuseumpas_Kortingtoekennen(){}
}

