package practicum8;

import practicum6.practicum6B.Game;

public abstract class Voertuig implements Goed{
    // Instance variables
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    // Constructor
    public Voertuig(String tp, double pr, int jr) {
        this.type = tp;
        this.nieuwprijs = pr;
        this.bouwjaar = jr;
    }

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

    public abstract double huidigeWaarde();
}
