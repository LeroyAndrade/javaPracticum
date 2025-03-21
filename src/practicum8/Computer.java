package practicum8;

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

//    @Override
//    public String toString() {
//        return "Computermerk: "+ type
//                + " - " + "MAC: "+ macAdres
//                +" - huidige waarde: "+ huidigeWaarde()
//                +" - productieJaar: "+ productieJaar;
//    }

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
}
