package tests;

import org.testng.annotations.Test;
public class Day01_C02_Priority {
    // TestNG (default) olarak annotation'ları naturel alfabtetik olarak çalıştırır.
    // TestNG prioritysinin sayi degeri en az olan testi ilk once calistirir
    // Priporty attribute'u icin negatif degerler kullanilabilir
    // TestNG default (varsayilan) priority = 0 dir
    @Test (priority = -1000)
    public void test02(){
        System.out.println("Test 2 çalıştı");
    }
    @Test (priority = -1001)
    public void test04(){
        System.out.println("Test 4 çalıştı");
    }
    @Test (priority = -1500)
    public void test01(){
        System.out.println("Test 1 çalıştı");
    }
    @Test (priority = -2000)
    public void test03(){
        System.out.println("Test 3 çalıştı");
    }
}
