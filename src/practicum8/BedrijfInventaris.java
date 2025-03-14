package practicum8;
import java.util.ArrayList;
import java.util.List;

public class BedrijfInventaris {
    private String bedrijfsNaam;
    private double budget;
    private ArrayList<Goed> alleGoederen;

    public BedrijfInventaris(String nm) {
        this.bedrijfsNaam = nm;
        this.alleGoederen = new ArrayList<>();
    }

    public BedrijfInventaris(String nm, double bud) {
        this.bedrijfsNaam = nm;
        this.budget = bud;
        this.alleGoederen = new ArrayList<>();
    }



    public void schafAan(Goed g){
        alleGoederen.add(g);
    }

    public double getTotaleNieuwprijs() {
        double totaal = 0;
        for (Goed g : alleGoederen) {
            if (g instanceof Voertuig) {
                budget -= ((Voertuig) g).getNieuwprijs();
            }
        }
        return totaal;
    }

    @Override
    public String toString() {
        String inventarisTotaal = "";

        for (Object key : alleGoederen) {
            inventarisTotaal += "Inventory: - " + key + "\n" + alleGoederen + getTotaleNieuwprijs() + "\n";
        }
        return inventarisTotaal;
    }
}
