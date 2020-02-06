package vendingItems;

public class Crisps extends Item {

    private final double price;
    private String flavour;

    public Crisps(String brand, String flavour){
        super(brand);
        this.price = 0.5;
        this.flavour = flavour;
    }

    public double getPrice() {
        return price;
    }

    public String getFlavour() {
        return flavour;
    }
}
