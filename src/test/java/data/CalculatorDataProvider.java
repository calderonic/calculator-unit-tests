package data;

import org.testng.annotations.DataProvider;

public class CalculatorDataProvider {

    @DataProvider(name="sumData")
    public Object[][] sumData(){
        return new Object[][]{
                {2,3,5},
                {10,5,15},
                {7,8,15}
        };
    }

    @DataProvider(name="subtractionData")
    public Object[][] subtractionData(){
        return new Object[][]{
                {10,5,5},
                {20,10,10},
                {15,5,10}
        };
    }

    @DataProvider(name="multiplicationData")
    public Object[][] multiplicationData(){
        return new Object[][]{
                {2,3,6},
                {4,5,20},
                {7,2,14}
        };
    }

    @DataProvider(name="divisionData")
    public Object[][] divisionData(){
        return new Object[][]{
                {10,2,5},
                {9,3,3},
                {20,4,5}
        };
    }
}
