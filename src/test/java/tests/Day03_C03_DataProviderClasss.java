package tests;

import org.testng.annotations.DataProvider;
public class Day03_C03_DataProviderClasss {
    @DataProvider
    public  Object[][] testData() {
        Object[][] returnData = {
                {"First Test", "birinci test"},
                {"Second Test", "ikinici test"},
                {"Third Test", "ucuncu test"},
        }; return returnData;
    }
}
