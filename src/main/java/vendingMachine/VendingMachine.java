package vendingMachine;

import money.Coin;
import vendingItems.Item;

import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Item> inventory;
    private ArrayList<Coin> coins;

    public VendingMachine() {
        this.inventory = new ArrayList<>();
        this.coins = new ArrayList<>();
    }

    public int countItems(){
        return this.inventory.size();
    }
    public int countCoins(){
        return this.coins.size();
    }
    public void stockItem(Item item){
        this.inventory.add(item);
    }

}
