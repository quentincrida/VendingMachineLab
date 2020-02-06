package vendingItems;

public class Sweets extends Item {

    private String productName;
    private final double price;

    public Sweets(String brand, String productName) {
        super(brand);
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
