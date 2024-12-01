package practicum4.practicum4B;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String nm) {
        this.naam = nm;
    }

    public void setKorting(double kP) {
        this.kortingsPercentage = kP;
    }

    public double getKorting() {
        if (kortingsPercentage == 0.0){
            return 0.0;
        } else {
            return this.kortingsPercentage;
        }
    }

    @Override
    public String toString() {
        return "  Op naam van: "
                +naam + " (korting: " + getKorting() + "%)";
    }
}
