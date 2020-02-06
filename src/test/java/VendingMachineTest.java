import money.Coin;
import money.Pence;
import org.junit.Before;
import org.junit.Test;
import vendingItems.SoftDrink;
import vendingMachine.VendingMachine;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {
    private VendingMachine vendingMachine;
    private SoftDrink softDrink;
    private Coin coin1;
    private Coin coin2;

    @Before
    public void before(){
        vendingMachine = new VendingMachine();
        softDrink = new SoftDrink("Pepsi", "Max");
        coin1 = new Coin(Pence.FIVEPENCE);
        coin2 = new Coin(Pence.TWOPENCE);

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
}
