package inlesTheorie.rest;

public class stringbuilder {
    public static void main(String[] args) {
        String woord1 = "Klas";
        String woord2 = "Leerling";
        String woord3 = woord1+woord2;
        StringBuilder stWoorden = new StringBuilder("Klas");
        stWoorden.append("Leerling");
        System.out.println(stWoorden.toString());

//
        String hoofdLetterWoord = woord1.toUpperCase();
        System.out.println(woord1);

    }
}
