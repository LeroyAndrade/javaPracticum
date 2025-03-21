package practicum8;

public class Fiets extends Voertuig {
    int framenummer;

    public Fiets(String tp, double pr, int jr, int fnr) {
        super(tp, pr, jr);
        framenummer = fnr;
    }

    public double huidigeWaarde() {
    return nieuwprijs;
    }


    @Override
    public boolean equals(Object anderObject) {
        boolean gelijkeObjecten = false;

        if (anderObject instanceof Fiets) {
            Fiets anderFiets = (Fiets) anderObject;

            if (this.framenummer == anderFiets.framenummer &&
                this.nieuwprijs == anderFiets.nieuwprijs &&
                this.bouwjaar == anderFiets.bouwjaar) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }
}