package practicum8;

public class Auto extends Voertuig implements Goed{
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt) {
        super(tp, pr, jr);
        this.kenteken = kt;
    }

    public Auto(String tp, int jr, String kt) {
        super(tp, 0.0, jr);
        this.kenteken = kt;
    }

    public double huidigeWaarde(){
        int jaartalNu = 2025;
        int jaarOud = jaartalNu - bouwjaar;
        return nieuwprijs * Math.pow(0.7, jaarOud);
//        return this.pr * Math.pow(0.7, this.jr);
    }

    @Override
    public boolean equals(Object anderObject) {
        boolean gelijkeObjecten = false;

        if (anderObject instanceof Fiets) {
            Auto anderAuto = (Auto) anderObject;

            if (this.kenteken == anderAuto.kenteken) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

}
