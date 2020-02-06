package vendingItems;

import vendingMachine.Position;

public abstract class Item {

    private String brand;
    private Position position;
    private double price;

    public Item(String brand, Position position) {
        this.brand = brand;
        this.position = position;


    }


    public String getBrand() {
        return brand;
    }

    public String getPosition() {
        return position.getPosition();
    }

    public double getPrice() {
        return price;
    }
}
