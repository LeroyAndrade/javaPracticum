package practicum5;
import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling>deLeerlingen;

    public Klas(String kC) {
      this.klasCode = kC;
      this.deLeerlingen = new ArrayList<>();
    }

    public void voegLeerlingToe(Leerling l){
        deLeerlingen.add(l);
    }

    public void wijzigCijfer(String nm, double nweCijfer){
       for (Leerling l : deLeerlingen){
           if (l.getNaam().equals(nm)){
               l.setCijfer(nweCijfer);
           }
       }
    }

    public ArrayList<Leerling> getLeerlingen() {
        return new ArrayList<>(deLeerlingen);
    }

    public int aantalLeerlingen(){
        return deLeerlingen.size();
    }

    @Override
    public String toString() {
        String leerlingenInKlas = "In klas " + klasCode + " zitten de volgende leerlingen:\n";

        for (Leerling l : deLeerlingen){
            leerlingenInKlas += l.getNaam()
                    + " heeft cijfer: " + l.getCijfer()+ "\n";
        }

        return leerlingenInKlas;
    }

    public static void main(String[] arg) {
        Klas k = new Klas("V1Z");
        Leerling l = new Leerling("Hans");
        k.voegLeerlingToe(l);
        l = new Leerling("Jan");
        k.voegLeerlingToe(l);
        l = new Leerling("Wim");
        k.voegLeerlingToe(l);
        System.out.println(k);
        k.wijzigCijfer(new String("Hans"), 7.6);
        k.wijzigCijfer("Klaas", 7.6);
        System.out.println(k.toString());
        System.out.println("Aantal leerlingen: " + k.aantalLeerlingen());
    }
}


