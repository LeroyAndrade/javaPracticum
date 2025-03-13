package practicum8;

public class BedrijfInventaris {
    private String bedrijfsNaam;
    private double budget;
    private Goed alleGoederen;

    public BedrijfInventaris(String nm, double bud) {
        this.bedrijfsNaam = nm;
        this.budget = bud;
    }

    public void schafAan(Goed g){

    }

    @Override
    public String toString() {
        return "bedrijfsNaam :"+ bedrijfsNaam
                  +" alleGoederen :"+ alleGoederen
                  +" budget :"+ budget;
    }



}
