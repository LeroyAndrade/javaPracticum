package practicum8;

public class Auto {
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt) {
        this.kenteken = tp;
    }

    public double huidigeWaarde(){
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Auto) {
            Auto a = (Auto) obj;
        }
        return super.equals(obj);
    }
}
