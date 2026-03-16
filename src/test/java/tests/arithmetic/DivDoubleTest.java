package tests.arithmetic;

import data.CalculatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class DivDoubleTest extends BaseTest {

    @Test(dataProvider = "divDoubleData", dataProviderClass = CalculatorDataProvider.class, groups = {"regression"})
    public void verifyDivisionDouble(double a, double b, double expected){
        double result = calculator.div(a,b);
        Assert.assertEquals(result, expected, "Division double result incorrect");
    }
}
