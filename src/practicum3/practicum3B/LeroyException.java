package practicum3.practicum3B;

import java.io.IOException;

public class LeroyException extends Exception {

//    Ik kom hier niet uit. :*(
    // het lukt niet om te zeggen: number <=0 ? catch{}
    // uw gedeelde MartijnException voorbeeld is helaas incompleet en via tutorials lukt het mij helaas niet
    //een eigen exception te maken
    public LeroyException(String arg) throws IllegalArgumentException {

        super(arg);



        try {
            double number = Double.parseDouble(arg);

            if (number <= 0) {

            }

        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn: " + arg);
        }
    }
}

//        // NullPointerException
//        if (arg == null) {
//            throw new NullPointerException("Argument is null.");
//        }
//
//        // Try to parse the argument as a number
//        try {
//            double number = Double.parseDouble(arg);  // Convert to a numeric value (double)
//
//            // Check if the number is less than or equal to 0
//            if (number <= 0) {
//                throw new IllegalArgumentException("0 of -0 gevonden " + arg);
//            }
//
//        } catch (NumberFormatException e) {
//            // Handle case when the argument cannot be parsed to a number
//            throw new IllegalArgumentException("Argument must be a valid number: " + arg);
//        }
//    }
//}
