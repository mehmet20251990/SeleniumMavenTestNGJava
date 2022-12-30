package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day02_C02_Parameters {
    @Test
    @Parameters("isim")
    public void test01(String ad){
        System.out.println("Hello " + ad);
    }
}
