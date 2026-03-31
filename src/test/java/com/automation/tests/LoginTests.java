package com.automation.tests;

import com.automation.base.BaseTest;
import org.testng.annotations.Test;


public class LoginTests extends BaseTest {
// This class will contain test methods related to login functionality Tests = only actions + assertions, such as:
// - Valid login test

public void openSite() {
    driver.get("https://automationexercise.com/login/");
}
    /**@Test

    public void testLogin() {
    new LoginPage(driver)
    .enterEmail("test@test.com")
    .enterPassword("123")
    .clickLogin();
    }**/

}
