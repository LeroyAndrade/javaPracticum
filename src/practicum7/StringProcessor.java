package practicum7;
import java.util.ArrayList;


public class StringProcessor {
    private ArrayList<?> processen;

    public StringProcessor() {
        processen = new ArrayList<>();
    }

    public String verwerk(String input) {
        String resultaat = input;
        for (OpmaakProcess proces : processen) {
            resultaat = proces.maakOp(resultaat);
        }
        return resultaat;
    }


    public void voegProcesToe(Object proces) {
        processen.add(proces);
    }
}
