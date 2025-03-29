package practicum8en9a;
import static practicum8en9a.Utils.euroBedrag;

public class Computer implements Goed {
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp, String adr, double pr, int jr) {
        this.type = tp;
        this.macAdres = adr;
        this.aanschafPrijs = pr;
        this.productieJaar = jr;
    }

    public double huidigeWaarde(){
        int jaartalNu = 2025;
        int jaarOud = jaartalNu - this.productieJaar;
        return jaarOud * Math.pow(0.6, jaarOud);
    }

    @Override
    public boolean equals(Object anderObject) {
        boolean gelijkeObjecten = false;

        if (anderObject instanceof Computer) {
            Computer anderComputer = (Computer) anderObject;

            if (this.type.equals(anderComputer.type) &&
                    this.macAdres.equals(anderComputer.macAdres) &&
                    this.aanschafPrijs == anderComputer.aanschafPrijs &&
                    this.productieJaar == anderComputer.productieJaar) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

    @Override
    public String toString() {
        return "Type: " + type
                + " aanschafPrijs: " + euroBedrag(aanschafPrijs, 2)
                + " productieJaar: " + productieJaar;
    }
}
