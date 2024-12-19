package inlesTheorie.practicum7inLes;

public class Voertuig {
    private String merk;
    private String type;

    public Voertuig(){

    }

    public Voertuig(String merk){

    }

    public Voertuig(String merk, String type){

    }

    @Override
    public String toString() {
        return "Voertuig [merk=" + merk + ", type=" + type + "]";
    }
}
