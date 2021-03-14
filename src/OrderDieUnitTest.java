import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderDieUnitTest {
    @Test
    public void testSomething() {
        DiceBag test = new DiceBag();
        OrderDie newToken = new OrderDie("RyDie", "purple");
        test.addToken(newToken);
        String number = test.toString();
        assertEquals(" Dice left: 1\n" + "RyDie purple\n", number);

    }
}


