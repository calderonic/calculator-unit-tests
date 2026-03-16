package tests.arithmetic;

import data.CalculatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class DivLongTest extends BaseTest {

    @Test(dataProvider = "divLongData", dataProviderClass = CalculatorDataProvider.class, groups = {"regression"})
    public void verifyDivision(long a, long b, long expected){
        long result = calculator.div(a,b);
        Assert.assertEquals(result, expected, "Division result is incorrect");
    }
}
