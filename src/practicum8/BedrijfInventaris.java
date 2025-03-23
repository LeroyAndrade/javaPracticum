package practicum8;
import java.util.ArrayList;

public class BedrijfInventaris {
    private String bedrijfsNaam;
    private double budget;
    private ArrayList<Goed> alleGoederen = new ArrayList<Goed>();

    public BedrijfInventaris(String nm, double bud) {
        this.bedrijfsNaam = nm;
        this.budget = bud;
        this.alleGoederen = new ArrayList<>();
    }

    public void schafAan(Goed g) {
        if (alleGoederen.contains(g)) {
            System.out.println("Aanschaf mislukt, het is al toegevoegd -" + g.toString());
        } else if (budget < g.huidigeWaarde()) {
            System.out.println("Aanschaf mislukt, onvoldoende budget voor: " + g);
        } else {
            alleGoederen.add(g);
            budget -= g.huidigeWaarde();
        }
    }

    @Override
    public String toString() {
        String inventarisTotaal = "\nInventaris van " + bedrijfsNaam + ":\n";

        for (Goed g : alleGoederen) {
            inventarisTotaal += g.toString() + "\n";
        }
        return inventarisTotaal;
    }
}
