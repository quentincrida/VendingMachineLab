package vendingItems;

import vendingMachine.Position;

public class Sweets extends Item {

    private String productName;
    private final double price;

    public Sweets(String brand, Position position, String productName) {
        super(brand, position);
        this.productName = productName;
        this.price = 0.65;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}
