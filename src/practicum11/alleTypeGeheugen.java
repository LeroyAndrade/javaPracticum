package practicum11;

public class alleTypeGeheugen extends Geheugen {
    private String productNaam;

    // Constructor
    public alleTypeGeheugen(String productNaam, Integer geheugenProduct,
                            String typeProduct, String typeGeheugenGrootte,
                            double prijsProduct) {
        super(productNaam, geheugenProduct, typeProduct, typeGeheugenGrootte, prijsProduct);
        this.productNaam = productNaam;
    }
    @Override
    public double prijs() {
        return prijsProduct;
    }
}

//private String naamProduct;
//protected Integer geheugenProduct;
//protected String typeProduct;
//protected double prijsProduct;