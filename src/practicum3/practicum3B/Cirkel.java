package practicum3.practicum3B;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int radius, int xPositie, int yPositie) {
        this.radius = radius;
        this.xPositie = xPositie;
        this.yPositie = yPositie;

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getxPositie() {
        return xPositie;
    }

    public void setxPositie(int xPositie) {
        this.xPositie = xPositie;
    }

    public int getyPositie() {
        return yPositie;
    }

    public void setyPositie(int yPositie) {
        this.yPositie = yPositie;
    }


    @Override
    public String toString() {
        return "Cirkel{" +
                "radius=" + radius +
                ", xPositie=" + xPositie +
                ", yPositie=" + yPositie +
                '}';
    }

    public static void main(String[] args) {
        Cirkel c1 = null, c2 = null;

        try {
            c1 = new Cirkel(3, 0, 0);
        } catch (IllegalArgumentException iae) {
            System.out.println( iae.getMessage() );
        }

        try {
            c2 = new Cirkel(0, 0, 0);
        } catch (IllegalArgumentException iae) {
            System.out.println( iae.getMessage() );
        }

        System.out.println(c1);
        System.out.println(c2);
    }

}
