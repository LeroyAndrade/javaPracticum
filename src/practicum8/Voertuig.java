package practicum8;


public abstract class Voertuig implements Goed {
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
        if (anderObject == null || getClass() != anderObject.getClass()) {
            return false;
        }
        Voertuig nieuwVoertuig = (Voertuig) anderObject;
        return type.equals(nieuwVoertuig.type) && nieuwprijs == nieuwVoertuig.nieuwprijs && bouwjaar == nieuwVoertuig.bouwjaar;
    }

    public abstract double huidigeWaarde();


    @Override
    public  String toString() {
        return type +", "
                + nieuwprijs +", "
                + bouwjaar;
    }

}

