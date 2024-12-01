package practicum3.practicum3B;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int radius, int x, int y) throws IllegalArgumentException  {
        this.radius = radius;
        this.xPositie = x;
        this.yPositie = y;

            if (radius <=0) {
                throw new IllegalArgumentException  ("Radius moet groter dan 0 zijn!");
            }
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Cirkel (" + xPositie + ", " + yPositie + ") "
                +"met radius: " + radius;
    }

    public static void main(String[] args) throws LeroyException {
        Cirkel c1 = null, c2 = null;

        try {
            c1 = new Cirkel(10, 0, 0);
            c2 = new Cirkel(0, 10, 10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(c1);
        System.out.println(c2);
    }
}
