package tests.arithmetic;

import data.CalculatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SubLongTest extends BaseTest {

    @Test(dataProvider = "subLongData", dataProviderClass = CalculatorDataProvider.class, groups = {"regression"})
    public void verifySub(long a, long b, long expected) {
        long result = calculator.sub(a, b);
        Assert.assertEquals(result, expected, "Subtraction result is incorrect");
    }
}
