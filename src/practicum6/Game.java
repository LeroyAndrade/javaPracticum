package practicum6;
import java.time.LocalDate;

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
        int huidigeJaar = LocalDate.now().getYear();
        int jaarWaarde = huidigeJaar - releaseJaar;

        return nieuwprijs ;
    }

    public boolean equals(Object andereObject){
        return naam.equals(((Game)andereObject).naam);
    }

    @Override
    public String toString() {
        return 0 + " " + naam + " " + releaseJaar + " " + nieuwprijs;
//        return "GameGame{" +
//                "naam='" + naam + '\'' +
//                ", releaseJaar=" + releaseJaar +
//                ", nieuwprijs=" + nieuwprijs +
//                '}';
    }

    public static void main(String[] args) {

    }
}
