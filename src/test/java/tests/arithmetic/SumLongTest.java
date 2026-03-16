package tests.arithmetic;
import data.CalculatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SumLongTest extends BaseTest {

    @Test(dataProvider = "sumLongData", dataProviderClass = CalculatorDataProvider.class, groups = {"regression"})
    public void verifySum(long a, long b, long expected) {
        long result = calculator.sum(a,b);
        Assert.assertEquals(result, expected, "Sum calculation is incorrect");
    }
}
