package theorie3.RekeningTest;

import inlesTheorie.Rekening;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RekeningTest {

//    init is een methode die altijd wordt gerunt voordat de rest wordt gerunt
    // zo doe je dus Dont repeat yourself
    private Rekening r;
    @BeforeEach
    public void init(){
        System.out.println("init");
        r = new Rekening(13245698);
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

