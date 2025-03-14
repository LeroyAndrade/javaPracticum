package practicum8;
import java.util.ArrayList;
import java.util.List;

public class BedrijfInventaris {
    private String bedrijfsNaam;
    private double budget;
    private List<Goed> alleGoederen;

    public BedrijfInventaris(String nm) {
        this.bedrijfsNaam = nm;
        this.budget =0.0;
        this.alleGoederen = new ArrayList<>();
    }

    public BedrijfInventaris(String nm, double bud) {
        this.bedrijfsNaam = nm;
        this.budget = bud;
        this.alleGoederen = new ArrayList<>();
    }

    public BedrijfInventaris(double bud) {
        this.budget = bud;
        this.alleGoederen = new ArrayList<>();
    }

    public void schafAan(Goed g){
        alleGoederen.add(g);
    }

    @Override
    public String toString() {
        String inventarisTotaal = "";

        for (Object key : alleGoederen) {
            inventarisTotaal += "Inventory: - " + key + "\n";
        }
        return inventarisTotaal;
    }
}
