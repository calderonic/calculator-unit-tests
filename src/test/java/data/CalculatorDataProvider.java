package data;

import org.testng.annotations.DataProvider;

public class CalculatorDataProvider {

    @DataProvider(name="sumLongData", parallel=true)
    public static Object[][] sumLongData() {
        return new Object[][]{
                {5L,3L,8L},
                {-5L,3L,-2L},
                {0L,4L,4L}
        };
    }

    @DataProvider(name="sumDoubleData", parallel=true)
    public static Object[][] sumDoubleData() {
        return new Object[][]{
                {5.5,3.5,9.0},
                {-2.5,1.5,-1.0}
        };
    }

    @DataProvider(name="subLongData", parallel=true)
    public static Object[][] subLongData() {
        return new Object[][]{
                {10L,3L,7L},
                {-5L,3L,-8L}
        };
    }

    @DataProvider(name="subDoubleData", parallel=true)
    public static Object[][] subDoubleData() {
        return new Object[][]{
                {5.5,2.5,3.0},
                {-5.0,2.0,-7.0}
        };
    }

    @DataProvider(name="multiLongData", parallel=true)
    public static Object[][] multLongData() {
        return new Object[][]{
                {5L,3L,15L},
                {-5L,3L,-15L}
        };
    }

    @DataProvider(name="multiDoubleData", parallel=true)
    public static Object[][] multDoubleData() {
        return new Object[][]{
                {2.5,2.0,Math.floor(5.0)},
                {3.2,2.0,Math.floor(6.4)}
        };
    }

    @DataProvider(name="divLongData", parallel=true)
    public static Object[][] divLongData() {
        return new Object[][]{
                {10L,2L,5L},
                {9L,3L,3L}
        };
    }

    @DataProvider(name="divDoubleData", parallel=true)
    public static Object[][] divDoubleData() {
        return new Object[][]{
                {10.0,2.0,5.0},
                {9.0,3.0,3.0}
        };
    }

    @DataProvider(name="powData", parallel=true)
    public static Object[][] powData() {
        return new Object[][]{
                {2.0,3.0,Math.pow(2,3)},
                {4.0,2.0,Math.pow(4,2)}
        };
    }

    @DataProvider(name="sqrtData", parallel=true)
    public static Object[][] sqrtData() {
        return new Object[][]{
                {4.0,2.0},
                {-16.0,4.0}
        };
    }

    @DataProvider(name="sinData", parallel=true)
    public static Object[][] sinData() {
        return new Object[][]{
                {0.0, Math.sin(0)},
                {Math.PI/2, Math.sin(Math.PI/2)}
        };
    }

    @DataProvider(name="cosData", parallel=true)
    public static Object[][] cosData() {
        return new Object[][]{
                {0.0, Math.cos(0)},
                {Math.PI/2, Math.cos(Math.PI/2)}
        };
    }

    @DataProvider(name = "tgData")
    public Object[][] tgData(){
        return new Object[][]{
                {Math.PI / 4, 1.0},
        };
    }

    @DataProvider(name="ctgData", parallel=true)
    public static Object[][] ctgData() {
        return new Object[][]{
                {1.0, 1 / Math.tan(1.0)},
                {2.0, 1 / Math.tan(2.0)}
        };
    }

    @DataProvider(name="positiveData", parallel=true)
    public static Object[][] positiveData() {
        return new Object[][]{
                {10L,true},
                {-5L,false},
                {0L,false}
        };
    }

    @DataProvider(name="negativeData", parallel=true)
    public static Object[][] negativeData() {
        return new Object[][]{
                {-10L,true},
                {5L,false},
                {0L,false}
        };
    }
}
