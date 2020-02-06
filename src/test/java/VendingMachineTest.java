import org.junit.Before;
import org.junit.Test;
import vendingItems.SoftDrink;
import vendingMachine.VendingMachine;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {
    private VendingMachine vendingMachine;
    private SoftDrink softDrink;

    @Before
    public void before(){
        vendingMachine = new VendingMachine();
        softDrink = new SoftDrink("Pepsi", "Max");

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
}
