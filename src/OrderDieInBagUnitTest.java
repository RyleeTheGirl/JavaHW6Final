import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderDieInBagUnitTest {
    @Test
    public void testSomething() {
        DiceBag test = new DiceBag();
        OrderDie newToken = new OrderDie("RyDie", "purple");
        test.addToken(newToken);
        Token drawnToken = test.drawToken();
        assertEquals(newToken, drawnToken);

    }
}