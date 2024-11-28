package practicum4.practicum4B;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String nm) {
        this.naam = nm;
    }

    public double getKortingsPercentage() {
        if (kortingsPercentage == 0.0){
            return 0;
        } else{
        return kortingsPercentage;
    }
    }

    public void setKortingsPercentage(double kortingsPercentage) {
        this.kortingsPercentage = kortingsPercentage;
    }

    @Override
    public String toString() {
        return "Op naam van: "
                +naam + '\''
                +"(korting: " + kortingsPercentage + "%)";
    }
}
