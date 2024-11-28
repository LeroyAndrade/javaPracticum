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
        return huurder;
    }

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
        if (gehuurdeAuto == null) {
            return 0;
        }
        return aantalDagen * gehuurdeAuto.getPrijsPerDag();
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

//        String autoStr = (gehuurdeAuto == null) ? "geen auto" : gehuurdeAuto.toString();
        return  overrideGehuurdeAuto + "\n"
                + overrideHuurder + "\n"
                + overrideAantalDagen + "en dat kost: " + totaalPrijs() + "\n";
    }


    public static void main(String[] args)  {
        AutoHuur ah1 = new AutoHuur();

            System.out.println("Eerste autohuur:\n" + ah1 + "\n");

            Klant k = new Klant("Mijnheer de Vries");
            k.setKortingsPercentage(10.0);
            ah1.setHuurder(k);
            System.out.println("Eerste autohuur:\n" + ah1 + "\n");

            Auto a1 = new Auto("Peugeot 207", 50);
            ah1.setGehuurdeAuto(a1);
            ah1.setAantalDagen(4);
            System.out.println("Eerste autohuur:\n" + ah1 + "\n");

            AutoHuur ah2 = new AutoHuur();
            Auto a2 = new Auto("Ferrari", 3500);
            ah2.setGehuurdeAuto(a2);
            ah2.setHuurder(k);
            ah2.setAantalDagen(1);
            System.out.println("Tweede autohuur:\n" + ah2 + "\n");
            System.out.println("Gehuurd: " + ah1.getGehuurdeAuto());
            System.out.println("Gehuurd: " + ah2.getGehuurdeAuto());

        }
}
