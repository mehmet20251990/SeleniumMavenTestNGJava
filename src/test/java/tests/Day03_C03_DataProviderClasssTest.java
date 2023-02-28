package tests;

import org.testng.annotations.Test;
public class Day03_C03_DataProviderClasssTest {
    @Test( dataProvider = "testData",
           dataProviderClass = Day03_C03_DataProviderClasss.class)
    public void dataProviderTest(String english, String turkish) {
        System.out.println(english);
        System.out.println(turkish);
    }
}
