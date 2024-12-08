package inlesTheorie.opdracht6_2;

public class Vriend {
    private String voornaam;
    private String achternaam;
    private String email;

    public Vriend(String vmn, String amn, String em) {
        this.voornaam = vmn;
        this.achternaam = amn;
        this.email = em;
    }

    public boolean Equals(Object andereObject){
        boolean anderObject = false;
        if(andereObject instanceof Vriend){
//          Downcasten
            Vriend andereVriend = (Vriend) andereObject;

        }
        return anderObject;
    }

    @Override
    public String toString() {
        return "Vriend{" +
                "voornaam='" + voornaam + '\'' +
                ", achternaam='" + achternaam + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
