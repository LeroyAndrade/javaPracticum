package practicum4.practicum4B;

public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public AutoHuur() {

    }
    public void setAantalDagen(int aD) {
        this.aantalDagen = aD;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setGehuurdeAuto(Auto gA) {
        this.gehuurdeAuto = gA;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setHuurder(Klant k) {
        this.huurder = k;
    }

    public Klant getHuurder() {
        if (huurder == null) {
            return null;
        }   return this.huurder;
    }

    public double totaalPrijs() {
        if (gehuurdeAuto == null || aantalDagen == 0) {
            return 0.0;
        }

        double tijdelijkOpslagPrijs = aantalDagen * gehuurdeAuto.getPrijsPerDag();
        double korting = 0.0;

        if (huurder != null) {
            korting = tijdelijkOpslagPrijs * (huurder.getKorting() / 100);
        }

        return tijdelijkOpslagPrijs - korting;
    }

    @Override
    public String toString() {
          String overrideHuurder;
          if (huurder == null){
              overrideHuurder = "  Er is geen huurder bekend";
          } else { overrideHuurder = huurder.toString();}

        String overrideGehuurdeAuto;
        if (gehuurdeAuto == null) {
            overrideGehuurdeAuto = "  Er is geen auto bekend";
        } else {
            overrideGehuurdeAuto = gehuurdeAuto.toString();
        }

        String overrideAantalDagen;
        if (aantalDagen == 0) {
            overrideAantalDagen = "  Aantal dagen: 0";
        } else {
            overrideAantalDagen = Integer.toString(aantalDagen);
        }

        String overrideTotaalPrijs;
        if (aantalDagen == 0) {
            overrideAantalDagen = "  Aantal dagen: 0";
        } else {
            overrideAantalDagen = ""+aantalDagen;
        }

//  Override
        return  overrideGehuurdeAuto + "\n"
                + overrideHuurder + "\n"
                + "  aantal dagen: " + overrideAantalDagen + " en dat kost: " + totaalPrijs();
    }


    public static void main(String[] args)  {
        AutoHuur ah1 = new AutoHuur();

            System.out.println("Eerste autohuur:\n" + ah1 + "\n");

            Klant k = new Klant("Mijnheer Andrade");
            k.setKorting(10.0);
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
