package practicum1;

//1
public class practicum1 {
    public static void main(String[] args) {
    //1
        System.out.print("Practicum 1\n");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
        }System.out.println();

    //2
        System.out.print("\nPracticum 2\n");
        int getalNul = 0;
        while (getalNul < 10){
            getalNul++;
            System.out.print(getalNul);
        }System.out.println();

    //3
        System.out.print("\nPracticum 3\n");
        for (double i = 0.0; i <=10; i++){
            double randomGetal = Math.random();
            System.out.println(randomGetal);
        }System.out.println();


    //4
        System.out.print("\nPracticum 4\n");
        int opslagGetal = 0;
        for (int i = 0; i <=39; i++){
            opslagGetal += i;
            if (opslagGetal == 780){
                System.out.print(opslagGetal);
            }
        }System.out.println();

    //5
        System.out.print("\nPracticum 5\n");
        String opslagS = "s";
        String opslagSS = "ss";
        for (int i = 0; i <=3; i++){
                if (i %2 ==0){
                    System.out.println(opslagS);
            } else {
                    System.out.println(opslagSS);
                }
        }








    }
}
