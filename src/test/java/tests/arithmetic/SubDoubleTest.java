package tests.arithmetic;

import data.CalculatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SubDoubleTest extends BaseTest {

    @Test(dataProvider = "subDoubleData", dataProviderClass = CalculatorDataProvider.class, groups = {"regression"})
    public void verifySubDouble(double a, double b, double expected) {
        double result = calculator.sub(a, b);
        Assert.assertEquals(result, expected, "Sub double result is incorrect");
    }
}
