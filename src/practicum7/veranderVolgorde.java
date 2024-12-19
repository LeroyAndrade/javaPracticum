package practicum7;

public class veranderVolgorde implements OpmaakProces{
    private String zoekWoord;;

    public veranderVolgorde(String zoekWoord){
        this.zoekWoord = zoekWoord;
    }

    @Override
    public String maakOp(String input) {
        if (input.contains(zoekWoord)) {
            String woordOmgekeerd = new StringBuilder(zoekWoord).reverse().toString();
            input = input.replace(zoekWoord, woordOmgekeerd);
        }
        return input;
    }
}
