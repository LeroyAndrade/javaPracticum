package practicum4.practicum4bTest;

import practicum4.practicum4B.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class practicum4bTest {
    private AutoHuur ah1;
    private Klant klant;
    private Auto auto;

    @BeforeEach
    public void init() {
        ah1 = new AutoHuur();
        klant = new Klant("Mijnheer Andrade");
        klant.setKortingsPercentage(10.0);
        auto = new Auto("Mercedes AMG One", 10.0);

        AutoHuur ah1 = new AutoHuur();
    }

    @Test
    void geenHuurderGeenAuto() {
        assertNull(ah1.getHuurder(), "Geen huurder");
        assertNull(ah1.getGehuurdeAuto(), "geen huurder geen auto");
    }

    @Test
    void geenHuurderWelAuto() {

        ah1.setGehuurdeAuto(auto);
        assertNull(ah1.getHuurder(), "Geen huurder");
        assertEquals(auto, ah1.getGehuurdeAuto(), "Geen huurder");
    }

    @Test
    void welHuurderGeenAuto() {
        ah1.setHuurder(klant);
        assertEquals(klant, ah1.getHuurder(), "Expected renter to be set correctly");
        assertNull(ah1.getGehuurdeAuto(), "wel huurder geen Auto");
    }

    @Test
    void welHuurderGeenKorting(){
        ah1.setHuurder(klant);
        klant.setKortingsPercentage(0.0);
        assertEquals("Op naam van: Mijnheer Andrade'(korting: 0.0%)", ah1.getHuurder(),
                "Wel huurder geen korting");
    }


}
