package vendingItems;

import vendingMachine.Position;

public abstract class Item {

    private String brand;
    private Position position;

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
}
