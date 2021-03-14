import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BlueRedDieUnitTest {
    @Test
    public void testSomething() {
        DiceBag test = new DiceBag();
        OrderDie newToken = new OrderDie("red1", "red");
        OrderDie newToken2 = new OrderDie("red2", "red");
        OrderDie newToken3 = new OrderDie("blue1", "blue");
        OrderDie newToken4 = new OrderDie("blue2", "blue");
        OrderDie newToken5 = new OrderDie("blue3", "blue");


        test.addToken(newToken);
        test.addToken(newToken2);
        test.addToken(newToken3);
        test.addToken(newToken4);
        test.addToken(newToken5);
        String result = test.toString();
        Assert.assertEquals(" Dice left: 5\n" + "red1\nred2\nblue1\nblue2\nblue3\n", result);

    }
}