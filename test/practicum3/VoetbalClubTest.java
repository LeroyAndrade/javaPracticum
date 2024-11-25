package practicum3;

import inlesTheorie.Rekening;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practicum2.practicumB.Voetbalclub;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


public class VoetbalClubTest {

    private Voetbalclub club;
    @BeforeEach
    public void init(){
        System.out.println("init");
        club = new Voetbalclub("Fejj");
        //    init is een methode die altijd wordt gerunt voordat de rest wordt gerunt
        // zo doe je dus Dont repeat yourself
        Rekening r = new Rekening(13245698);
    }


    @Test
    public void clubNaam_null_or_empty_ThenSetClubName_FC() {
         // Creating a club with null name
//        club.voetbalclubNaam = "FC ";
//        club.voetbalclubNaam = "";
//        club.voetbalclubNaam = null;
        if (club.voetbalclubNaam.isEmpty() || this.club.voetbalclubNaam == null) {
            club.voetbalclubNaam = "FC";
        }
        assertEquals("FC", club.voetbalclubNaam, "Club name should default to 'FC' if null or empty.");
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

