import org.junit.Before;
import org.junit.Test;
import vendingMachine.VendingMachine;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {
    private VendingMachine vendingMachine;

    @Before
    public  void before(){
        vendingMachine = new VendingMachine();
    }
    @Test
    public void checkStartsEmpty(){
        assertEquals(0, vendingMachine.countItems());
    }
    @Test
    public void checkCoinsStartEmpty(){
        assertEquals(0, vendingMachine.countCoins());
    }
}
