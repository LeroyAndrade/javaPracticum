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

    @Test
    public void clubNaam_null_or_empty_ThenSetClubName_FC() {

        assertEquals("FC", vbc.getVoetbalclubNaam(), "Check of clubnaam FC is.");
    }

    @Test
    public void foutInvoerGespeeldeWedstrijd_BeinvloedResultatenNiet(){
        vbc.verwerkResultaat('w');
        vbc.verwerkResultaat('g');
        vbc.verwerkResultaat('1');
        System.out.println(vbc);
    }
}

