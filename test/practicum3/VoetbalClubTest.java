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





    @Test
    public void clubNaam_bevatNull_ThenSetClubName_FC() {
        vbc = new Voetbalclub(null);
        assertEquals("FC", vbc.getVoetbalclubNaam(), "clubnaam bevat een NULL en waarde is \"FC\" ");
    }

    @Test
    public void clubNaam_bevatSpatie_ThenSetClubName_FC() {
        vbc = new Voetbalclub(" ");
        assertNotNull(vbc.getVoetbalclubNaam(), "clubnaam bevat een SPATIE en waarde is \"FC\" ");
    }

    @Test
    public void clubNaam_bevatLeegString_ThenSetsClubName() {
        vbc = new Voetbalclub("");
        assertNotEquals("", vbc.getVoetbalclubNaam(), "Check of clubnaam een leeg String bevat en plaats dan \"FC\" ");
    }


    @Test
    public void invoerResultaten_drie_één_en_Nul_punten(){
        vbc = new Voetbalclub("FC Hu Lets Gooo");
        vbc.verwerkResultaat("w");
        vbc.verwerkResultaat("g");
        assertEquals("FC 3 1 0", vbc.toString(), "invoer resultaten zijn: 3 1 en 0");
    }

    @Test
    public void invoerResultaten_twe_cijfers_ingevoerd_en_éémKeerGewonnen_VerwerktZonderError(){
        vbc = new Voetbalclub("FC Hu Lets Gooo");
        vbc.verwerkResultaat("1");
        vbc.verwerkResultaat("w");
        assertEquals("FC 3 0 0", vbc.toString(), "invoer resultaten zijn: 3 0 en 0");
        System.out.println(vbc.toString());
    }

    @Test
    public void Invoer_is_onbekend_String_nummer_en_juiste_invoer_TeltScoreOpZonderErrorTeSpuwen(){
        vbc = new Voetbalclub("");
        vbc.verwerkResultaat("w"); //+3punten
        vbc.verwerkResultaat("11");
        assertEquals("FC 3 0 0", vbc.toString());
        System.out.println(vbc.toString());
    }
}
