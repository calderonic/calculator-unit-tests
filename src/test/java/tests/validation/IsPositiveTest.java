package tests.validation;

import data.CalculatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class IsPositiveTest extends BaseTest {

    @Test(dataProvider = "positiveData", dataProviderClass = CalculatorDataProvider.class, groups = {"smoke"})
    public void verifyIsPositive(long value, boolean expected){
        boolean result = calculator.isPositive(value);
        Assert.assertEquals(result, expected, "isPositive result incorrect");
    }
}
