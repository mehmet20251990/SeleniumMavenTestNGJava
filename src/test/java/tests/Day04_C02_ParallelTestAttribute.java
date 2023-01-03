package tests;

import org.testng.annotations.Test;

public class Day04_C02_ParallelTestAttribute {
    @Test(
            threadPoolSize = 3,    // testimizin kac cekirdekte paralel olarak calisacagini belirler
            invocationCount = 7    // testimizin kac defa calistiralacagini belirler
    )
    public void test(){
        System.out.println("Current thread Id = " + Thread.currentThread().getId());
    }
    /*
    Current thread Id = 16
    Current thread Id = 18
    Current thread Id = 17
    Current thread Id = 16
    Current thread Id = 17
    Current thread Id = 18
    Current thread Id = 16
     */
}