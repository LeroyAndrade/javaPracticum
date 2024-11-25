package inlesTheorie;

public class Rekening {
    private int nummer; // de 2 attributen
    private double saldo;
    // de constructor
    public Rekening(int nr) {
        nummer = nr;
    }
    public int getNummer() { return nummer; }

    public double getSaldo() { return saldo; }
    public void stort(double bedrag) {
        saldo = saldo + bedrag; // saldonieuw = saldooud + bedrag
    }
    public void neemOp(double bedrag) {
        saldo = saldo - bedrag; // saldonieuw = saldooud - bedrag
    }
    public String toString() {
        String s = "Op rekening " + nummer + " staat " + saldo;
        return s;
    }
}
