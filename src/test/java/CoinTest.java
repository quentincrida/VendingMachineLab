import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinTest {
    private Coin coin;


    @Before
    public void before() {
        coin = new Coin(Pence.FIFTYPENCE);
    }
    @Test
    public void canGetValue(){
        assertEquals(0.5, coin.getValue(),0.01);
    }
    @Test
    public void canGetDenomination(){
        assertEquals("50p", coin.getDenomination());
    }
}