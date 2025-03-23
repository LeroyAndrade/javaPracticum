package practicum8;
import java.util.ArrayList;
import java.text.DecimalFormat;

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
            System.out.println("Aanschaf mislukt, onvoldoende budget voor: " + g.toString());
        } else {
            alleGoederen.add(g);
            budget -= g.huidigeWaarde();
        }
    }

    private String formatCurrency(double value) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        return df.format(value);
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
