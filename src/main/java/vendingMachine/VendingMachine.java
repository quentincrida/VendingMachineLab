package vendingMachine;

import money.Coin;
import vendingItems.Crisps;
import vendingItems.Item;
import vendingItems.SoftDrink;
import vendingItems.Sweets;

import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Item> inventory;
    private ArrayList<Coin> coins;

    public VendingMachine() {
        this.inventory = new ArrayList<>();
        this.coins = new ArrayList<>();
        Crisps crisps = new Crisps("Walkers", Position.B2, "Cheese & Vinegar");
        SoftDrink softdrink = new SoftDrink("Barr's", Position.A3, "Irn Bru");
        Sweets sweets = new Sweets("Nestle", Position.C3, "Aero");
        this.inventory.add(crisps);
        this.inventory.add(softdrink);
        this.inventory.add(sweets);

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
    public void acceptCoin(Coin coin){
        if(coin.getDenomination() != "1p" && coin.getDenomination() != "2p"){
            this.coins.add(coin);
        }

    }
    public double getCurrentTotal(){
        double currentTotal = 0;
        for(Coin coin : this.coins) {
            currentTotal += coin.getValue();
        }
       return currentTotal;
    }

    public Item getProductByPosition(String position){
        for(Item item : this.inventory) {
            if(item.getPosition() == position){
                return item;
            }
        }
        return null;
    }

    public Item dispenseProduct(String position){
        Item item = getProductByPosition(position);
        if(item != null && item.getPrice() <= getCurrentTotal()){
            clearCurrentTotal();
            return item;
        }
        return null;
    }

    public void clearCurrentTotal() {
        this.coins.clear();
    }
}
