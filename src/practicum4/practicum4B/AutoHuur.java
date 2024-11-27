package practicum4.practicum4B;

public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

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

    public double totaalPrijs(){
        return 0;
    }
}
