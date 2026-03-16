package tests.math;

import data.CalculatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SqrtTest extends BaseTest {

    @Test(dataProvider = "sqrtData", dataProviderClass = CalculatorDataProvider.class)
    public void verifySqrt(double input, double expected){
        double result = calculator.sqrt(input);
        Assert.assertEquals(result, expected, "Sqrt result incorrect");
    }
}
