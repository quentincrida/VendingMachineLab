import money.Coin;
import money.Pence;
import vendingMachine.VendingMachine;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert Coins: ");
        String insertedCoin = sc.nextLine();
        Coin coin = createCoin(insertedCoin);
        vendingMachine.acceptCoin(coin);
    }

    public static Coin createCoin(String value){
        Coin coin = new Coin(Pence.valueOf(value);
        return coin;
    }

}
