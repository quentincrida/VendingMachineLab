import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SoftDrinkTest {

    private SoftDrink softDrink;

    @Before
    public void before(){
        softDrink = new SoftDrink("Coca Cola", "Classic");
    }

    @Test
    public void canGetBrand(){
        assertEquals("Coca Cola", softDrink.getBrand());
    }

    @Test
    public void canGetFlavour(){
        assertEquals("Classic", softDrink.getFlavour());
    }

    @Test
    public void canGetPrice(){
        assertEquals(1.0, softDrink.getPrice(), 0.01);
    }
}
