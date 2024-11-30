package practicum4.practicum4B;

public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public AutoHuur() {

    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public Klant getHuurder() {
        if (huurder == null) {
            return null;
        }   return this.huurder;

    }


//    ? Voor in de les, wat is het verschil?
//    public Klant getHuurder() {
//        if (huurder == null) {
//            return "er is geen huurder";
//        }
//        return huurder.toString();
//    }


    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public void setHuurder(Klant huurder) {
        this.huurder = huurder;
    }

    public void setGehuurdeAuto(Auto gehuurdeAuto) {
        this.gehuurdeAuto = gehuurdeAuto;
    }

    public double totaalPrijs() {
        if (gehuurdeAuto == null || aantalDagen == 0) {
            return 0.0;
        }

        double tijdelijkOpslagPrijs = aantalDagen * gehuurdeAuto.getPrijsPerDag();
        double korting = 0.0;

        if (huurder != null) {
            korting = tijdelijkOpslagPrijs * (huurder.getKortingsPercentage() / 100);
        }

        return tijdelijkOpslagPrijs - korting;
    }

    @Override
    public String toString() {
          String overrideHuurder;
          if (huurder == null){
              overrideHuurder = "Er is geen huurder bekend";
          } else { overrideHuurder = huurder.toString();}

        String overrideGehuurdeAuto;
        if (gehuurdeAuto == null) {
            overrideGehuurdeAuto = "Er is geen auto bekend";
        } else {
            overrideGehuurdeAuto = gehuurdeAuto.toString();
        }

        String overrideAantalDagen;
        if (aantalDagen == 0) {
            overrideAantalDagen = "Aantal dagen: 0";
        } else {
            overrideAantalDagen = gehuurdeAuto.toString();
        }

        String overrideTotaalPrijs;
        if (aantalDagen == 0) {
            overrideAantalDagen = "Aantal dagen: 0";
        } else {
            overrideAantalDagen = String.valueOf(aantalDagen);
        }

//  Override
        return  overrideGehuurdeAuto + "\n"
                + overrideHuurder + "\n"
                + "aantal dagen " + overrideAantalDagen + " en dat kost: " + totaalPrijs() + "\n";
    }


    public static void main(String[] args)  {
        AutoHuur ah1 = new AutoHuur();

            System.out.println("Eerste autohuur:\n" + ah1 + "\n");

            Klant k = new Klant("Mijnheer Andrade");
            k.setKortingsPercentage(0.0);
            ah1.setHuurder(k);
            System.out.println("Eerste autohuur:\n" + ah1 + "\n");

            Auto a1 = new Auto("Mercedes AMG One", 50);
            ah1.setGehuurdeAuto(a1);
            ah1.setAantalDagen(4);
            System.out.println("Eerste autohuur:\n" + ah1 + "\n");

            AutoHuur ah2 = new AutoHuur();
            Auto a2 = new Auto("Ferrari 488 Spider", 3500);
            ah2.setGehuurdeAuto(a2);
            ah2.setHuurder(k);
            ah2.setAantalDagen(1);
            System.out.println("Tweede autohuur:\n" + ah2 + "\n");
            System.out.println("Gehuurd: " + ah1.getGehuurdeAuto());
            System.out.println("Gehuurd: " + ah2.getGehuurdeAuto());

        }
}
