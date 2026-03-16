package tests.arithmetic;

import data.CalculatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SumDoubleTest extends BaseTest {

    @Test(dataProvider = "sumDoubleData", dataProviderClass = CalculatorDataProvider.class, groups = {"regression"})
    public void verifySumDouble(double a, double b, double expected) {
        double result = calculator.sum(a, b);
        Assert.assertEquals(result, expected, "Sum double result is incorrect");
    }
}
