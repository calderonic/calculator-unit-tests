package tests.trigonometry;

import data.CalculatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class CosTest extends BaseTest {

    @Test(dataProvider = "cosData", dataProviderClass = CalculatorDataProvider.class)
    public void verifyCos(double input, double expected){
        double result = calculator.cos(input);
        Assert.assertEquals(result, expected, "Cos result incorrect");
    }
}
