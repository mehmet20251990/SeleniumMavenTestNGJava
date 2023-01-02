package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day03_C01_DataProvider {
    @Test(dataProvider = "dataProvider")
    public void test01(String name) {
        // Verileri dataProvider methodundan alarak çalışacak olan test
        System.out.println(name);
    }
    @DataProvider
    public Object[][] dataProvider() {
        // Verileri teste sağlayacak olan method
        Object[][] data= {
                {"Karl"},
                {"Ortis"},
                {"CW"},
        };
        return  data;
    }
}
