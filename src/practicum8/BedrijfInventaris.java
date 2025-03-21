package practicum8;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class BedrijfInventaris {
    private String bedrijfsNaam;
    private double budget;
    private ArrayList<Goed> alleGoederen = new ArrayList<Goed>();

//    public BedrijfInventaris(String nm) {
//        this.bedrijfsNaam = nm;
//        this.alleGoederen = new ArrayList<>();
//    }
//
    public BedrijfInventaris(double bud) {
        this.budget = bud;
        this.alleGoederen = new ArrayList<>();
    }

    public BedrijfInventaris(String nm, double bud) {
        this.bedrijfsNaam = nm;
        this.budget = bud;
        this.alleGoederen = new ArrayList<>();
    }

    public void schafAan(Goed g){
//        debug
        System.out.println("Huidige waarde van item: " +  formatCurrency(g.huidigeWaarde()));  // Print the current value of the item
        System.out.println("Huidig budget: " + formatCurrency(budget));  // Print the current budget
 //        debug

        if (!alleGoederen.contains(g)) {
            if (budget >= g.huidigeWaarde()) {
                alleGoederen.add(g);
                System.out.println("Toegevoegd");
                budget -= g.huidigeWaarde();
            } else {
                System.out.println("Geen saldo: " +  formatCurrency(budget));
            }
        } else {
            System.out.println("Item bestaat al in het lijstje, niet toegevoegd");
        }
    }

    private String formatCurrency(double value) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        return df.format(value);
    }

    @Override
    public String toString() {
        String inventarisTotaal = "";

        for (Goed g : alleGoederen) {
            inventarisTotaal += "Inventory: - " + g + " buget: " +  formatCurrency(budget) + "\n";
        }
        return inventarisTotaal;
    }
}
