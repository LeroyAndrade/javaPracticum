package practicum8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practicum6.practicum6A.Game;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import static org.junit.jupiter.api.Assertions.*;

public class inventoryTest {
    private ArrayList<Goed> alleGoederen = new ArrayList<Goed>();


    public static void main(String[] args) {
        BedrijfInventaris inventaris1 = new BedrijfInventaris( 818888000999.00);

        Auto auto1 = new Auto("Mercedes-Benz A-klasse A 180", 29995, 2019, "4-ZTV-94");
        inventaris1.schafAan(auto1);
        System.out.println(inventaris1);
    }
}
