package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (Day05_C02_ITestListener.class)
public class Day05_C03_UseListener {
    @Test
    public void passedtest() {
        System.out.println("Test passed");
    }
    @Test
    public void failedTest() {
        System.out.println("Test failed");
        Assert.fail();
    }
    @Test (timeOut = 500)
    public void timedOutTest() throws InterruptedException {
        System.out.println("Timed out test");
        Thread.sleep(600);
    }
}
