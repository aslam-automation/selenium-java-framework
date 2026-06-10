package tests;

import org.testng.annotations.Test;
import base.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin() {

        driver.get("https://example.com");

        System.out.println("Login test executed");
    }
}
