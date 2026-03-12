package tests;

import data.CalculatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivTest extends BaseTest {

    @Test(dataProvider = "divisionData", dataProviderClass = CalculatorDataProvider.class, groups = {"regression"})
    public void verifyDivision(long a, long b, long expected){
        long result = calculator.div(a,b);
        Assert.assertEquals(result, expected, "Division result is incorrect");
    }
}
