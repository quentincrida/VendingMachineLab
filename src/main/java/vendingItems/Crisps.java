package vendingItems;

import vendingMachine.Position;

public class Crisps extends Item {

    private final double price;
    private String flavour;

    public Crisps(String brand, Position position, String flavour){
        super(brand, position);
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
