package Eigenaar;

public class Eigenaar {
    private String naam;
    private int giroNr;

    public Eigenaar(String naam, int giroNr) {
        this.naam = naam;
        this.giroNr = giroNr;
    }

    public Eigenaar(String naam) { this.naam = naam; }

    public void setGiroNr(int giroNr){ this.giroNr = giroNr; }

    public int getGiroNr(int giroNr){   return giroNr; }

    public String getNaam(String naam){ return naam; }

    @Override
    public String toString() {
        return "Eigenaar{" +
                "naam='" + naam + '\'' +
                ", giroNr=" + giroNr +
                '}';
    }
}
