package practicum8;

public abstract class Voertuig {
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

    public boolean equals(Object obj){
        if(obj instanceof Voertuig){
            Voertuig voertuig = (Voertuig)obj;
        }
        return false;
    }

    public abstract double huidigeWaarde();
}
