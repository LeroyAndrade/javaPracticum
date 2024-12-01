package practicum4.practicum4B;

public class Auto {
    private String type;
    public double prijsPerDag;

    public Auto(String tp, double prPd) {
        this.type = tp;
        this.prijsPerDag = prPd;
    }

    public void setPrijsPerDag(double prPd) {
        this.prijsPerDag = prPd;
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    @Override
    public String toString() {
        return "  autotype: "
                +type + " "
                +"met prijs per dag: " + prijsPerDag;
    }
}
//uml
//toString van AutoHuu
//Naamgevingen van methoden tussen UML en code komen ook niet overeen.