package art.kikill;

import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {
    private final Calculator calculator = new KikillTwo();

    @Test
    public void testCalc() {
        double res = calculator.calc(2.,2., '+');
        Assert.assertEquals(4., res, 0);
    }


}
