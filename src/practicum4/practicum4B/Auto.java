package practicum4.practicum4B;

public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto(String tp, double prPd) {
        this.type = tp;
        this.prijsPerDag = prPd;
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    public void setPrijsPerDag(double prijsPerDag) {
        this.prijsPerDag = prijsPerDag;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "type='" + type + '\'' +
                ", prijsPerDag=" + prijsPerDag +
                '}';
    }
}
