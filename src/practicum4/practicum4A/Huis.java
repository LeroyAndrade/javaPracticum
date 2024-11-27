package practicum4.practicum4A;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;


    public Huis(String adr, int bwj) {
        this.adres = adr;
        this.bouwjaar = bwj;
    }

    public Persoon getHuisbaas() {
        return huisbaas;
    }

    public void setHuisbaas(Persoon huisbaas) {
        this.huisbaas = huisbaas;
    }

    @Override
    public String toString() {
        return "Huis " + adres
                +" is gebouwd in " + bouwjaar
                +"\nen heeft " + this.getHuisbaas();
    }

        public static void main(String[] args) {
            Huis h1 = new Huis("Nijenoord 1", 1970);
            Persoon p1 = new Persoon("Kees van der Staaij", 56);
            h1.setHuisbaas(p1);
            System.out.println(h1);
            System.out.println();

            Huis h2 = new Huis("Vredenburg", 1991);
            Persoon p2 = new Persoon("Hans van Mierlo", 93);
            h2.setHuisbaas(p2);
            System.out.println(h2);
            System.out.println();
            System.out.println("Huisbaas 1: " + h1.getHuisbaas());
            System.out.println("Huisbaas 2: " + h2.getHuisbaas());
        }
   }
