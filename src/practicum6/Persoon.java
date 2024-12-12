package practicum6;

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
        return false;
    }

    public boolean verkoop(Game g, Persoon koper){
        return false;
    }

//    methode koop uitprogrammeren en 2 if statements
    /*
    equals van game overriden

    equals
    game doorgeven van je zelf aan de koper
     */

    @Override
    public String toString() {
        return "Persoon{" +
                "naam='" + naam + '\'' +
                ", budget=" + budget +
                ", mijnGame=" + mijnGame +
                '}';
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
