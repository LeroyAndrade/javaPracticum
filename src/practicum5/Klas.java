package practicum5;
import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling>deLeerlingen;

    public Klas(String kC) {
        this.klasCode = kC;
    }

    public void voegLeerlingToe(Leerling l){
        deLeerlingen.add(l);
    }

    public void wijzigCijfer(String nm, double nweCijfer){
        deLeerlingen.setCijfer(nweCijfer);
    }

    public ArrayList<Leerling> getDeLeerlingen() {
        return deLeerlingen;
    }

    public int aantalLeerlingen(){
        return deLeerlingen.size();
    }

}
