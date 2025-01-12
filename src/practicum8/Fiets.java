package practicum8;

public class Fiets {
    private int framenummer;

    public Fiets(String tp, double pr, int jr, int fnr) {

    }

    public double huidigeWaarde(){
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fiets) {
            return false;
        }
        return super.equals(obj);
    }
}
