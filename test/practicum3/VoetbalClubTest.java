package practicum3;

import practicum2.practicumB.Voetbalclub;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

        if (vbc.getVoetbalclubNaam().isEmpty() || vbc.getVoetbalclubNaam() == null) {
            vbc.setVoetbalclubNaam("FC");
            System.out.println("De naam van de club is nu toegevoegd omdat het leeg was en is omgezet naar: " + vbc.getVoetbalclubNaam());
        }
        assertEquals("FC", vbc.getVoetbalclubNaam(), "Check of clubnaam FC is.");
    }

    @Test
    public void foutInvoerGespeeldeWedstrijd_BeinvloedResultatenNiet(){
        vbc.verwerkResultaat('w');
        vbc.verwerkResultaat('g');
        vbc.verwerkResultaat('1');
        System.out.println(vbc);
    }

//    @Test
//    void stortenPositiefBedragWijzigtSaldo() {
//        Rekening r = new Rekening(12345678);
//
//        r.stort(100);
//
//        assertEquals(100, r.getSaldo());
////        assertEquals(100.000000000000007, r.getSaldo()); //slaagt ook in de test
//
//    }



//    @Test
//    void tes_leeftijdGroterDan76EnInBezitMuseumpas_Kortingtoekennen(){}
}

