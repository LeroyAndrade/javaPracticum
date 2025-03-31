package practicum11;

public abstract class Geheugen implements ImplementorInventory {
    protected String naamProduct, typeProduct, typeGeheugenGrootte;
    protected Integer geheugenProduct;
    protected double prijsProduct;

    // Constructor
    public Geheugen(String naamProduct, Integer geheugenProduct, String typeProduct, String typeGeheugenGrootte, double prijsProduct) {
        this.naamProduct = naamProduct;
        this.geheugenProduct = geheugenProduct;
        this.typeProduct = typeProduct;
        this.prijsProduct = prijsProduct;
        this.typeGeheugenGrootte = typeGeheugenGrootte;
    }

    public double prijs() {
        return prijsProduct;
    }

    @Override
    public String toString() {
        return naamProduct
                + " " + geheugenProduct
                + " " + typeGeheugenGrootte
                + " ("+typeProduct+") :"
                + " " + prijsProduct;
    }
}
