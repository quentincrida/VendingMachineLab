import org.junit.Before;
import org.junit.Test;
import vendingItems.Sweets;
import vendingMachine.Position;

import static org.junit.Assert.assertEquals;

public class SweetsTest {

    private Sweets sweets;

    @Before
    public void before(){
        sweets = new Sweets("Cadbury", Position.A1, "Dairy Milk");

    }

    @Test
    public void getBrand(){
        assertEquals("Cadbury", sweets.getBrand());
    }
    @Test
    public void getProductName(){
        assertEquals("Dairy Milk", sweets.getProductName());
    }
    @Test
    public void getPrice(){
        assertEquals(0.65, sweets.getPrice(), 0.01);
    }
    @Test
    public void getPosition(){
        assertEquals("A1", sweets.getPosition());
    }
}
