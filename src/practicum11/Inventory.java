package practicum11;

import java.util.ArrayList;

public class Inventory {
    private String artikelNaam;
    private double budget;
    private ArrayList<ImplementorInventory> alleGoederen;

    // Constructor
    public Inventory(String artikelNaam, double budget) {
        this.artikelNaam = artikelNaam;
        this.budget = budget;
        this.alleGoederen = new ArrayList<>();
    }

    // Method to purchase an item if there is enough budget
    public void schafAan(ImplementorInventory g) {
        if (alleGoederen.contains(g)) {
            System.out.println("Toevoegen mislukt, het is al toegevoegd - " + g.toString());
        } else if (budget >= g.prijs()) {
            alleGoederen.add(g);
            budget -= g.prijs();
            System.out.println("Aangeschaft: " + g);
        } else {
            System.out.println("Aanschaf mislukt, onvoldoende budget voor: " + g);
        }
    }

    // Returns inventory as a string
    @Override
    public String toString() {
        StringBuilder inventarisTotaal = new StringBuilder("\nInventaris: " + artikelNaam + ":\n");

        for (ImplementorInventory g : alleGoederen) {
            inventarisTotaal.append(g.toString()).append("\n");
        }
        return inventarisTotaal.toString();
    }
}
