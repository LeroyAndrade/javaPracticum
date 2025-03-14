package practicum8;

public class Main {
    public static void main(String[] args) {

        BedrijfInventaris inventaris1 = new BedrijfInventaris("Voeding", 240);
        System.out.println(inventaris1+"\n");

        Auto auto1 = new Auto("Mercedes-Benz A-klasse A 180", 29995.00, 2019, "4-ZTV-94");
        System.out.println(auto1+"\n");

        Computer computer1 = new Computer("Acer", "A7-C3-7B-B2-FE-7E", 1059.99, 2025);
        Computer computer2 = new Computer("Windows", "B6-C3-7B-B2-FE-6D", 858.99, 2025);
        System.out.println(computer1+"\n");
        System.out.println(computer2+"\n");

        Fiets fiets1 = new Fiets("Senz Active Exclusive City bike", 1099.00, 2021, 1230100);
        Fiets fiets2 = new Fiets("Batavus Mambo Family Bikes", 899.00, 2022, 280600);
        System.out.println(fiets1+"\n");
        System.out.println(fiets2+"\n");

        inventaris1.schafAan(fiets1);
        inventaris1.schafAan(computer1);

        System.out.println(inventaris1);
    }
}
