package practicum11;

import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;
import static practicum11.Utils.euroBedrag;

public class FileScanner {

    public void schrijfNaarBestandEnConvert(String bronBestandNaam, String bestemmingBestandPad, double wisselKoers) {
        String huidigeDirectory = System.getProperty("user.dir");
        String BestandPad = huidigeDirectory + "\\" + bronBestandNaam;

        File bronBestand = new File(BestandPad);

        if (!bronBestand.exists()) {
            System.out.println("Het bronbestand bestaat niet: " + BestandPad);
            return;
        }

        try (Scanner bestandScanner = new Scanner(bronBestand);
             BufferedWriter schrijver = new BufferedWriter(new FileWriter(bestemmingBestandPad))) {

            while (bestandScanner.hasNextLine()) {
                String regel = bestandScanner.nextLine();
                if (regel.contains(" : ")) {
                    String[] scannerGesplit = regel.split(" : ");
                    String artikelNaam = scannerGesplit[0];
                    String prijsUSDStr = scannerGesplit[1];

                    prijsUSDStr = prijsUSDStr.replace(',', '.');

                    try {
                        double prijsUSD = Double.parseDouble(prijsUSDStr);
                        double prijsEUR = prijsUSD * wisselKoers;
                        schrijver.write(artikelNaam + " : " + euroBedrag(prijsEUR) + "\n");
                    } catch (NumberFormatException e) {
                        System.out.println("Ongeldige prijs in regel: " + regel);
                    }
                } else {
                    System.out.println("Foute invoer. probeer getal als: 00,92: " + regel);
                }
            }
            System.out.println("Succesvol conversie naar bestand: " + bestemmingBestandPad);
        } catch (IOException e) {
            System.out.println("Error tijdens schrijven naar bestand.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Voer bestandsnaam - Artikelen (zonder .txt): ");
        String sourceFileName = scanner.nextLine() + ".txt";
        File sourceFile = new File(System.getProperty("user.dir") + "\\" + sourceFileName);

        while (!sourceFile.exists()) {
            System.out.println("Het bronbestand bestaat niet. Probeer opnieuw.");
            System.out.print("Voer bestandsnaam - Artikelen (zonder .txt): ");
            sourceFileName = scanner.nextLine() + ".txt";
            sourceFile = new File(System.getProperty("user.dir") + "\\" + sourceFileName);
        }

        System.out.print("Voer het bestemmingsbestand pad in (zonder .txt): ");
        String destinationFilePath = scanner.nextLine() + ".txt";

        double wisselKoers = 0;
        while (true) {
            System.out.print("De waarde van 1 US dollar in Eurocenten (bijv. 0,918720): ");
            String invoer = scanner.nextLine();

            // Als er een punt in de invoer staat, geef dan een foutmelding en vraag opnieuw.
            if (invoer.contains(".")) {
                System.out.println("Gebruik een komma als decimaalteken, niet een punt.");
                continue;
            }

            try {
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ongeldige invoer! De wisselkoers moet een geldig getal zijn.");
            }
        }

        System.out.println("De ingevoerde wisselkoers is: " + wisselKoers);

        FileScanner fileScanner = new FileScanner();
        fileScanner.schrijfNaarBestandEnConvert(sourceFile.getName(), destinationFilePath, wisselKoers);

        scanner.close();
    }
}
