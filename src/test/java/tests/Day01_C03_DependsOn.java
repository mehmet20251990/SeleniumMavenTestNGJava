package tests;

import org.testng.annotations.Test;

public class Day01_C03_DependsOn {

    // Homepage testimiz login testimize bağlı old.dan dependsOn attribute'unu kullanabiliriz
    // Bağımlı olunan test fail olursa bağımlı olan method ignore edilir.
    // Bağımlı olan method alfabetik executiona bakılmaksızın bağımlı olunan methoddan sonra çalışır
    // Çoklu dependsOn kullanımında tüm bağımlı olunan methodlar pass oldugu durumda bagimli method calisir

    @Test
    public void loginTest(){
        System.out.println("login testi yapılıyor");
    }
    @Test
    public void registrationTest(){
        System.out.println("kayıt testi yapılıyor");
    }
    @Test (dependsOnMethods = {"loginTest","registrationTest"})
    public void homePageTest(){
        System.out.println("home page testi yapılıyor");
    }
}
