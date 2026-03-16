package tests.arithmetic;

import data.CalculatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class MultiLongTest extends BaseTest {

    @Test(dataProvider = "multiLongData", dataProviderClass = CalculatorDataProvider.class, groups = {"regression"})
    public void verifyMultiplication(long a, long b, long expected){
        long result = calculator.mult(a,b);
        Assert.assertEquals(result, expected, "Multiplication result is incorrect");
    }
}
