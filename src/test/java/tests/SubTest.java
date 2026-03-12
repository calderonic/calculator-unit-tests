package tests;

import data.CalculatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubTest extends BaseTest {

    @Test(dataProvider = "sumData", dataProviderClass = CalculatorDataProvider.class, groups = {"smoke","regression"})
    public void verifySum(long a, long b, long expected){
        long result = calculator.sum(a,b);
        Assert.assertEquals(result, expected, "Sum calculation is incorrect");
    }
}
