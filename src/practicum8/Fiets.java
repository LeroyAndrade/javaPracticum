package practicum8;

public class Fiets extends Voertuig {
    int framenummer;

    public Fiets(String tp, double pr, int jr, int fnr) {
        super(tp, pr, jr);
        framenummer = fnr;
    }

    @Override
    public double huidigeWaarde() {
        int jarenOud = 2024 - bouwjaar;
        return nieuwprijs * Math.pow(0.9, jarenOud);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Fiets)) {
            return false;
        }
        Fiets fiets = (Fiets) obj;
        return super.equals(obj) && framenummer == fiets.framenummer;
    }
}