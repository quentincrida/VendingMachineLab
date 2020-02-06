import money.Coin;
import money.Pence;
import org.junit.Before;
import org.junit.Test;
import vendingItems.Item;
import vendingItems.SoftDrink;
import vendingMachine.Position;
import vendingMachine.VendingMachine;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class VendingMachineTest {
    private VendingMachine vendingMachine;
    private SoftDrink softDrink;
    private Coin coin1;
    private Coin coin2;
    private Coin coin3;

    @Before
    public void before(){
        vendingMachine = new VendingMachine();
        softDrink = new SoftDrink("Pepsi", Position.B1,"Max");
        coin1 = new Coin(Pence.FIVEPENCE);
        coin2 = new Coin(Pence.TWOPENCE);
        coin3 = new Coin(Pence.ONEPOUND);

    }
    @Test
    public void checkStartsEmpty(){
        assertEquals(0, vendingMachine.countItems());
    }
    @Test
    public void checkCoinsStartEmpty(){
        assertEquals(0, vendingMachine.countCoins());
    }
    @Test
    public void canStockMachine(){
        vendingMachine.stockItem(softDrink);
        assertEquals(1, vendingMachine.countItems());

    }
    @Test
    public void canAcceptCoin(){
        vendingMachine.acceptCoin(coin1);
        assertEquals(1, vendingMachine.countCoins());

    }
    @Test
    public void cannotAcceptInvalidCoins(){
        vendingMachine.acceptCoin(coin2);
        assertEquals(0, vendingMachine.countCoins());
    }
    @Test
    public void canGetCurrentTotal(){
        vendingMachine.acceptCoin(coin1);
        assertEquals(0.05, vendingMachine.getCurrentTotal(), 0.01);
    }

    @Test

    public void getProductByPosition(){
        vendingMachine.stockItem(softDrink);
        Item item = vendingMachine.getProductByPosition("B1");
        assertEquals(softDrink, item);
    }

    @Test
    public void canDispenseProduct(){
        vendingMachine.stockItem(softDrink);
        vendingMachine.acceptCoin(coin3);
        Item item = vendingMachine.dispenseProduct("B1");
        assertEquals(softDrink, item);

    }
    @Test
    public void cannotDispenseProductInsufficientFunds(){
        vendingMachine.stockItem(softDrink);
        vendingMachine.acceptCoin(coin1);
        Item item = vendingMachine.dispenseProduct("B1");
        assertNull(item);

    }

    @Test
    public void cannotDispenseProductIncorrectLocation(){
        vendingMachine.stockItem(softDrink);
        vendingMachine.acceptCoin(coin3);
        Item item = vendingMachine.dispenseProduct("C1");
        assertNull(item);

    }
}
