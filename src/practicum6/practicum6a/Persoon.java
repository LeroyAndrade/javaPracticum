package practicum6.practicum6a;

import java.time.LocalDate;
import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijnGame;

    public Persoon(String nm, double bud) {
        this.naam = nm;
        this.budget = bud;
        this.mijnGame = new ArrayList<>();
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g){
        if (!mijnGame.contains(g) && budget >= g.huidigeWaarde()) {
            mijnGame.add(g);
            budget -= g.huidigeWaarde();
            System.out.println("game verkocht");
            return true;
        }
        return false;
    }

    public boolean verkoop(Game g, Persoon koper) {
        if (mijnGame.contains(g) && koper.koop(g)) {
            mijnGame.remove(g);
            budget += g.huidigeWaarde();
            return true;
        }
        return false;
    }
    @Override
    public boolean equals(Object andereObject) {
        boolean gelijkeObjecten = false;

        // Check if the other object is an instance of Persoon
        if (andereObject instanceof Persoon) {
            Persoon anderePersoon = (Persoon) andereObject;

            // Compare the name and the games collection
            if (this.naam.equals(anderePersoon.naam) && this.mijnGame.equals(anderePersoon.mijnGame)) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }
    @Override
    public String toString() {
        return  naam
                +" heeft een budget van "
                +String.format("%.2f", budget) + " "
                +"en bezit de volgende games: " + mijnGame;
    }

    public static void main(String[] args) {
        int releaseJaar1 = LocalDate.now().getYear() - 1; // 1 jaar geleden

        Game g1 = new Game("Just Cause 3", releaseJaar1, 49.98);
        Game g2 = new Game("Need for Speed: Rivals", releaseJaar1, 45.99);
        Game g3 = new Game("Need for Speed: Rivals", releaseJaar1, 45.99);

        Persoon p1 = new Persoon("Eric", 200);
        Persoon p2 = new Persoon("Hans", 55);

        System.out.println("p1 koopt g1:" + (p1.koop(g1) ? "" : " niet") + " gelukt");
        System.out.println("p1 koopt g2:" + (p1.koop(g2) ? "" : " niet") + " gelukt");
        System.out.println("p1 koopt g3:" + (p1.koop(g3) ? "" : " niet") + " gelukt");
        System.out.println("\np1: " +p1+ "\n\np2: " +p2+ "\n");

        System.out.println("p1 verkoopt g2 aan p2:"+(p1.verkoop(g2, p2) ? "" : " niet")+" gelukt");
        System.out.println("p1 verkoopt g1 aan p2:"+(p1.verkoop(g1, p2) ? "" : " niet")+" gelukt");
        System.out.println("\np1: " +p1+ "\n\np2: " +p2+ "\n");
    }
}
