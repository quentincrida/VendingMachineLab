public class SoftDrink extends Item {
    private String flavour;
    private final double price;

    public SoftDrink(String brand, String flavour) {
        super(brand);
        this.flavour = flavour;
        this.price = 1.0;
    }

    public String getFlavour() {
        return flavour;
    }

    public double getPrice() {
        return price;
    }
}
