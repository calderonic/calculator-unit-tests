package tests;

import data.CalculatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiTest extends BaseTest {

    @Test(dataProvider = "multiplicationData", dataProviderClass = CalculatorDataProvider.class, groups = {"regression"})
    public void verifyMultiplication(long a, long b, long expected){
        long result = calculator.mult(a,b);
        Assert.assertEquals(result, expected, "Multiplication result is incorrect");
    }
}
