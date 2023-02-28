package tests;

import org.testng.annotations.Test;
import utilities.BaseCrossBrowserTest;
public class Day04_C01_ParallelTest extends BaseCrossBrowserTest {
    @Test
    public void test01(){
        driver.get("https://www.google.com/");
    }
    @Test
    public void test02(){
        driver.get("https://www.amazon.com/");
    }
    @Test
    public void test03(){
        driver.get("https://www.trendyol.com/");
    }
}