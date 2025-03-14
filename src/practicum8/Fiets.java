package practicum8;

public class Fiets extends Voertuig {
    int framenummer;

    public Fiets(String tp, double pr, int jr, int fnr) {
        super(tp, pr, jr);
        framenummer = fnr;
    }

    public double huidigeWaarde() {
    return framenummer;
    }

    public String toString() {
        return "Fiets: type=" + ", prijs=" + nieuwprijs + ", jaar=" + bouwjaar + ", framenummer=" + framenummer;
    }

//    public boolean equals(Object obj) {
//        if (!super.equals(obj)) {
//            return false;
//        }
//        Fiets other = (Fiets) obj;
//        return framenummer == other.framenummer;
//    }
}