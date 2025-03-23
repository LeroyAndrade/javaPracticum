package practicum8;

public abstract class Voertuig implements Goed {
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

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

    @Override
    public  String toString() {
        return "Type: "+ type
                + " nieuwprijs: " + nieuwprijs +", "
                + " bouwjaar: " + bouwjaar;
    }
}

