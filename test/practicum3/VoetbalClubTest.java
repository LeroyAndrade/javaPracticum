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

    }

//Uit die logische testgevallen komen fysieke testgevallen. Maak die ook in hetzelfde document.

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
    public void clubNaam_bevatNull_ThenSetClubName_FC() {
        vbc = new Voetbalclub(null);
        assertNull(vbc.getVoetbalclubNaam(), "Check of clubnaam NULL bevat en plaats dan \"FC\" ");
//        assertTrue(vbc.getVoetbalclubNaam().startsWith(null));
    }

    @Test
    public void clubNaam_bevatSpatie_ThenSetClubName_FC() {
        vbc = new Voetbalclub(" ");
        assertNotNull(vbc.getVoetbalclubNaam(), "Check of clubnaam een SPATIE bevat en plaats dan \"FC\" ");
    }

    @Test
    public void clubNaam_bevatLeegString_ThenSetsClubName() {
        vbc = new Voetbalclub("");
        assertNotEquals("", vbc.getVoetbalclubNaam(), "Check of clubnaam een leeg String bevat en plaats dan \"FC\" ");
    }


    @Test
    public void invoerResultaten_drie_één_en_Nul_punten(){
        vbc = new Voetbalclub("FC Hu");
        vbc.verwerkResultaat("w");
        vbc.verwerkResultaat("g");
        assertEquals("FC 3 1 0", vbc.toString());
    }

    @Test
    public void foutInvoerGespeeldeWedstrijdInputINT_BeinvloedResultatenNiet(){
        vbc = new Voetbalclub("FC");
        vbc.verwerkResultaat("w"); //+3punten
        vbc.verwerkResultaat("11"); // excpetion catched
        assertEquals("FC 3 0 0", vbc.toString());
    }












}
