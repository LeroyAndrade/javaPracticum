package practicum3.practicum3A;

public class Voetbalclub {
    public String voetbalclubNaam;
    private int aantalGewonnen = 0;
    private int aantalGelijk = 0;
    private int aantalVerloren = 0;

    public String getVoetbalclubNaam() {
        return voetbalclubNaam;
    }

    public void setVoetbalclubNaam(String voetbalclubNaam) {
        this.voetbalclubNaam = voetbalclubNaam;
    }

    public Voetbalclub(String voetbalclubNaam) {

        if (this.voetbalclubNaam == null || this.voetbalclubNaam.isEmpty()) {
            this.setVoetbalclubNaam("FC");
            System.out.println("De naam van de club is nu toegevoegd en is omgezet naar: " + this.getVoetbalclubNaam());
        }
    }

    public void setAantalGewonnen(int aantalGewonnen) {
        this.aantalGewonnen = aantalGewonnen;
    }

    public int getAantalGelijk() {
        return aantalGelijk;
    }

    public void setAantalGelijk(int aantalGelijk) {
        this.aantalGelijk = aantalGelijk;
    }

    public int getAantalVerloren() {
        return aantalVerloren;
    }

    public void setAantalVerloren(int AantalVerloren) {
        this.aantalVerloren = aantalVerloren;
    }

    public int aantalPunten() {
        return this.aantalVerloren + this.aantalGelijk + this.aantalGewonnen * 3;
    }


    public void verwerkResultaat(String ch) {
        try {
             if (ch == "w") {
                this.aantalGewonnen = aantalGewonnen + 1;
            } else if (ch == "g") {
                this.aantalGelijk = aantalGelijk + 1;
            } else if (ch == "v") {
                this.aantalVerloren = aantalVerloren + 0;
            } else if (ch == " ") {
                this.aantalVerloren = aantalVerloren + 0;
                System.out.printf("Invalide input: spatie gedetecteerd");
            } else {
                System.out.println("Invalide input");
            }
        } catch (ClassCastException e){
            System.out.printf("Invalide input");
        }
    }

    public int aantalGespeeld(){
        return  aantalVerloren+aantalGewonnen+aantalGelijk;
    }

    @Override
    public String toString() {
        return  voetbalclubNaam
                + " " +this.aantalGewonnen *3
                + " " +this.aantalGelijk
                + " " +this.aantalVerloren;
    }

//    overide

        public static void main(String[] args) {
            Voetbalclub ajx = new Voetbalclub("Aja`x      ");
            Voetbalclub feij = new Voetbalclub("Feijenoord");

            feij.verwerkResultaat("w");
            feij.verwerkResultaat("w");
            feij.verwerkResultaat("g");
            feij.verwerkResultaat("v");

            ajx.verwerkResultaat("v");
            ajx.verwerkResultaat("v");
            ajx.verwerkResultaat("v");
            ajx.verwerkResultaat("v");

            System.out.println("Feijenoord punten: " + feij.aantalPunten());
            System.out.println("Ajax gespeeld: " + ajx.aantalGespeeld());
            System.out.println();
//
//            System.out.println(ajx);
//            System.out.println(feij);
        }
    }

