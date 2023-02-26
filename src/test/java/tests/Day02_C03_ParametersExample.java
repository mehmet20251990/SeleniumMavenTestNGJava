package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Day02_C03_ParametersExample {
    String driver;
    @BeforeMethod
    @Parameters("browser")
    public void setup(String browserName){
        // Driver config yapılıyor
        if (browserName.equals("chrome")){
            driver = "chrome";
        } else if (browserName.equals("firefox")){
            driver = "firefox";
        } else if (browserName.equals("oper")){
            driver = "opera";
        }
        System.out.println("Driver objesi oluşturuldu - " + driver);
    }
    @AfterMethod
    public void tearDown(){
        // Driver kapatılıyor
        driver = "-";
        System.out.println("çıkış " + driver);
    }
    @Test
    public void test(){
        // testimiz gerçekleşiyor
        System.out.println("Test execution basladi");
        System.out.println("Testte kullanilan driver = " + driver);
    }
}
