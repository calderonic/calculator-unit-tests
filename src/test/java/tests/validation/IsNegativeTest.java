package tests.validation;

import data.CalculatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class IsNegativeTest extends BaseTest {

    @Test(dataProvider = "negativeData", dataProviderClass = CalculatorDataProvider.class, groups = {"smoke"})
    public void verifyIsNegative(long value, boolean expected){
        boolean result = calculator.isNegative(value);
        Assert.assertEquals(result, expected, "isNegative result incorrect");
    }
}
