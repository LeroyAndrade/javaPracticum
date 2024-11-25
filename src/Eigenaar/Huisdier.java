package Eigenaar;

public class Huisdier {
    private String naam;
    private String ras;
    private double gewicht;

//    linken
    private Eigenaar baasje;


    public Huisdier(String naam, String ras){
        this.naam = naam;
        this.ras = ras;
        this.gewicht = gewicht;
    }

    public String getNaam() {
        return naam;
    }

    public void setBaasje(Eigenaar e) {
        this.naam = naam;
    }

    public void getBaasje() {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Huisdier{" +
                "naam=" + naam +
                ", ras=" + ras +
                ", gewicht=" + gewicht +
                '}';
    }
}
