package practicum3;

import practicum3.practicum3A.Voetbalclub;
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

/*
Logische testgevallen
Testgeval omschrijving-test    resultaat
1         clubnaam is leeg     Clubnaam moet FC zijn
2                   heeft naam          krijgt de naam

Fysieke testgeval: voor ieder testgeval 1 fysieke maken
1  clubnaam is " "  clubnaam moet FC zijn en mag geen spatie zijn
               null clubnaam moet FC zijn en geen null
                ""                          en geen " "

2           heeft naam   clubnaam krijgt die willekeurige





*/

    @Test
    public void clubNaam_null_or_empty_ThenSetClubName_FC() {
        assertEquals("FC", vbc.getVoetbalclubNaam(), "Check of clubnaam FC is.");
        assertTrue(vbc.getVoetbalclubNaam().startsWith("FC"));
    }

    @Test
    public void clubNaam_null_or_empty_ThenSetClubName_FwC() {
        assertEquals("FC", vbc.getVoetbalclubNaam(), "Check of clubnaam FC is.");
        String abc = new Voetbalclub(null).toString();
    }

    @Test
    public void clubNaam_bevatSpatie_ThenSetClubName_FwC() {
        String abc = new Voetbalclub(" ").toString();
    }

    @Test
    public void foutInvoerGespeeldeWedstrijd_BeinvloedResultatenNiet(){
        vbc.verwerkResultaat('w');
        vbc.verwerkResultaat('g');
        vbc.verwerkResultaat('1');
        System.out.println(vbc);
    }
}

// logisch >=19
// fysiek:     18>
