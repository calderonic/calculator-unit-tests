package tests.arithmetic;

import data.CalculatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class MultiDoubleTest extends BaseTest {

    @Test(dataProvider = "multiDoubleData", dataProviderClass = CalculatorDataProvider.class, groups = {"regression"})
    public void verifyMultiDouble(double a, double b, double expected) {
        double result = calculator.mult(a, b);
        Assert.assertEquals(result, expected, 0.0001, "Multiplication double result incorrect");
    }
}
