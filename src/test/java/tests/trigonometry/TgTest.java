package tests.trigonometry;

import data.CalculatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class TgTest extends BaseTest {

    @Test(dataProvider = "tgData", dataProviderClass = CalculatorDataProvider.class)
    public void verifyTg(double input){
        double result = calculator.tg(input);
        Assert.assertNotNull(result);
    }
}
