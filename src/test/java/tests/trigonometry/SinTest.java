package tests.trigonometry;

import data.CalculatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SinTest extends BaseTest {

    @Test(dataProvider = "sinData", dataProviderClass = CalculatorDataProvider.class)
    public void verifySin(double input, double expected){
        double result = calculator.sin(input);
        Assert.assertEquals(result, expected, "Sin result incorrect");
    }
}
