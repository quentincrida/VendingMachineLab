import org.junit.Before;
import org.junit.Test;
import vendingItems.Crisps;

import static org.junit.Assert.assertEquals;

public class CrispsTest {
    private Crisps crisps;


    @Before
    public void before(){
        crisps = new Crisps("Skips", "Prawn Cocktail");
    }

    @Test
    public void canGetBrand(){
        assertEquals("Skips", crisps.getBrand());
    }
    @Test
    public void canGetFlavour(){
        assertEquals("Prawn Cocktail", crisps.getFlavour());
    }
    @Test
    public void canGetPrice(){
        assertEquals(0.5, crisps.getPrice(), 0.01);
    }
}
