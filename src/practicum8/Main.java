package practicum8;

public class Main {
    public static void main(String[] args) {
        BedrijfInventaris inventaris1 = new BedrijfInventaris("Mijn Budget", 81888800);

        Computer computer1 = new Computer("Acer", "A7-C3-7B-B2-FE-7E", 1059.00,2025);
        Computer computer2 = new Computer("Acer", "A7-C3-7B-B2-FE-7E", 1059.00, 2025);
        Computer computer3 = new Computer("Alienware", "B6-C3-7B-B2-FE-6D", 858.00, 2025);

        Fiets fiets1 = new Fiets("Batavus Senz Active Exclusive City bike", 1099.00, 2021, 12300);
        Fiets fiets2 = new Fiets("Batavus Senz Active Exclusive City bike", 1099.00, 2021, 12300);
        Fiets fiets3 = new Fiets("Batavus Mambo Family Bikes", 899, 2022, 280600);

        Auto auto1 = new Auto("Mercedes-Benz A-klasse A 180", 29995.00, 2019, "4-ZTV-94");
        Auto auto2 = new Auto("Mercedes-Benz A-klasse A 180", 29995.00, 2019, "4-ZTV-94");
        Auto auto3 = new Auto("Mercedes-AMG ONE", 27200.00, 2022, "3-ZAB-22");


        inventaris1.schafAan(computer1);
        inventaris1.schafAan(computer2);
        inventaris1.schafAan(computer3);

        inventaris1.schafAan(fiets1);
        inventaris1.schafAan(fiets2);
        inventaris1.schafAan(fiets3);

        inventaris1.schafAan(auto1);
        inventaris1.schafAan(auto2);
        inventaris1.schafAan(auto3);

        System.out.println(inventaris1);
    }
}

