package practicum4.practicum4B;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String nm, int lft) {
        this.naam = nm;
        this.leeftijd = lft;
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "naam=" + naam +
                ", leeftijd=" + leeftijd +
                '}';
    }
}
