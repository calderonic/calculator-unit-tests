package tests.math;

import data.CalculatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class PowTest extends BaseTest {

    @Test(dataProvider = "powData", dataProviderClass = CalculatorDataProvider.class)
    public void verifyPow(double a, double b, double expected){
        double result = calculator.pow(a,b);
        Assert.assertEquals(result, expected, "Pow result incorrect");
    }
}
