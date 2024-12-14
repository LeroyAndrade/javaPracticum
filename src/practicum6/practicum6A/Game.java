package practicum6.practicum6A;
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

    public double huidigeWaarde() {
        int jarenOud = LocalDate.now().getYear() - releaseJaar;
        double waarde = nieuwprijs;

        for (int i = 0; i < jarenOud; i++) {
            waarde -= waarde * 0.3;
        }
        return waarde;
    }

    @Override
    public boolean equals(Object anderObject) {
        boolean gelijkeObjecten = false;

         if (anderObject instanceof Game) {
             Game anderGame = (Game) anderObject;

            if (this.naam.equals(anderGame.naam) &&
                this.releaseJaar == anderGame.releaseJaar)
                {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

    @Override
    public String toString() {
        return naam + ", uitgegeven in " + releaseJaar + "; nieuwprijs: " + "\u20AC" + String.format("%.2f",nieuwprijs)
                +" nu voor: " + "\u20AC" +  String.format("%.2f", huidigeWaarde());
    }
}
