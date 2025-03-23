package practicum8;
import java.text.DecimalFormat;

public class Utils {

    public static String euroBedrag(double bedrag) {
        return String.format("%.2f", bedrag);
    }
    public static String euroBedrag(double bedrag, int precisie) {
        return String.format("%.2f", bedrag);
    }
}
