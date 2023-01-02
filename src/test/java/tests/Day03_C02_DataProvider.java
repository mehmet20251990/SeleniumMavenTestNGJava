package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day03_C02_DataProvider {
    // username, email, password, number
    @Test(dataProvider = "getData")
    public void test(String username, String email, String password, int number) {
        System.out.println("username: " + username);
        System.out.println("email: " + email);
        System.out.println("password: " + password);
        System.out.println("number: " + number);
    }
    @DataProvider
    public Object[][] getData() {
        Object[][] data = {
                {"Karl", "karl@cw.com", "123",1},
                {"Drake", "drake@cw.com", "asd",2},
                {"Garry", "garry@cw.com", "qwe123",3},
                {"Elly", "elly@cw.com", "423asd",4},
        }; return data;
    }
}
