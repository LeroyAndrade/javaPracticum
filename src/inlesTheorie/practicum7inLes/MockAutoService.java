package inlesTheorie.practicum7inLes;
import java.util.*;

public class MockAutoService implements AutoService {

    public void voegAutoToe(Auto a){
        System.out.printf("Methode voegAutoToe");
    }

    public List<Auto> getAutos(){
        ArrayList<Auto> autos = new ArrayList<Auto>();
        autos.add(new Auto("Merc", "AMG One", 2018));
        return autos;
    }

    @Override
    public String toString() {
        return "MockAutoService{}";
    }

    public static void main(String[] args) {
        System.out.println(1);
    }
}
