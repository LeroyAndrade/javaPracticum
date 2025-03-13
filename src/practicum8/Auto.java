package practicum8;

public class Auto {
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt) {
        this.kenteken = tp;
    }

    public double huidigeWaarde(){
        return 0;
    }

    public boolean equals(Object andereObject) {
        boolean gelijkeObjecten = false; // blijft false tenzij:
        // het andereObject van hetzelfde type is als dit (this) object
        // EN de attributen van dit (this) object gelijk zijn aan die van andereObject
        // EN (indien van toepassing) de attributen van de superklasse ook overeenkomen
        return gelijkeObjecten;
    }

    public double huidigeWaarde(){
        return this.aanschafPrijs * Math.pow(0.7, this.productieJaar);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Auto) {
            Auto a = (Auto) obj;
        }
        return super.equals(obj);
    }
}
