package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BaseCrossBrowserTest;
public class Day03_C06_CrossBrowser extends BaseCrossBrowserTest {
    // browser bilgisi testing.xml dosyasından alınacağı için kod aşamasında herhangi bir değişiklik görülmeyecektir.
    @Test
    public void crossBrowserTest() throws InterruptedException {
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(), "Google");
    }
}
