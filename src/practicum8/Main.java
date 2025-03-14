package practicum8;

public class Main {
    public static void main(String[] args) {

        BedrijfInventaris inventaris1 = new BedrijfInventaris("Voeding", 999000000);
        System.out.println(inventaris1+"\n");

        Computer computer1 = new Computer("Acer", "A7-C3-7B-B2-FE-7E", 1059.99, 2025);
        Computer computer2 = new Computer("Windows", "B6-C3-7B-B2-FE-6D", 858.99, 2025);


        Fiets fiets1 = new Fiets("Batavus Senz Active Exclusive City bike", 1099.00, 2021, 1230100);
        Fiets fiets2 = new Fiets("Batavus Mambo Family Bikes", 899.00, 2022, 280600);


        Auto auto1 = new Auto("Mercedes-Benz A-klasse A 180", 29995.00, 2019, "4-ZTV-94");
        Auto auto2 = new Auto("Ferrari F40", 400.000, 1987, "30");
        Auto auto3 = new Auto("Mercedes-AMG ONE", 272.00000, 2022, "110");


//        inventaris1.schafAan(computer1);
//        inventaris1.schafAan(computer2);
        inventaris1.schafAan(fiets1);
//        inventaris1.schafAan(fiets2);
//        inventaris1.schafAan(auto1);
        inventaris1.schafAan(auto2);
//        inventaris1.schafAan(auto3);

        System.out.println(inventaris1);
    }
}
