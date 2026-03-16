package tests.trigonometry;

import data.CalculatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class CtgTest extends BaseTest {

    @Test(dataProvider = "ctgData", dataProviderClass = CalculatorDataProvider.class)
    public void verifyCtg(double input, double expected){
        double result = calculator.ctg(input);
        Assert.assertEquals(result, expected, "Ctg result incorrect");
    }
}
