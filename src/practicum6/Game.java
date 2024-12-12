package practicum6;

public class Game{
private String naam;
private int releaseJaar;
private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr){
        this.naam = nm;
        this.releaseJaar = rJ;
        this.nieuwprijs = nwpr;
    }

    public String getNaam() {
        return naam;
    }

    public double huidigeWaarde(){
        return 0.0;
    }

    public boolean equals(Object andereObject){
        return naam.equals(((Game)andereObject).naam);
    }

    @Override
    public String toString() {
        return "Game{" +
                "naam='" + naam + '\'' +
                ", releaseJaar=" + releaseJaar +
                ", nieuwprijs=" + nieuwprijs +
                '}';
    }

    public static void main(String[] args) {

    }
}
