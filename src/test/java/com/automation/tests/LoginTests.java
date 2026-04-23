package com.automation.tests;

import com.automation.base.BaseTest;
import com.automation.pages.HomePage;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

/**autouser_1@testmail.com  * 123456  */
// This class will contain test methods related to login functionality Tests = only actions + assertions, such as:


@Test(groups = "notLogged")
public class LoginTests extends BaseTest {
    @Test(priority = 2, description = "Verify user successful login")
    @Description("Happy Path: User Registration and Login Flow")
    //Valid login test
public void TC_002_UserLogin_HappyPath() {

    String email = "autouser_1@testmail.com";
    String password = "123456";


    HomePage homePage = new HomePage(driver)
            .clickSignupLogin()
            .enterLoginEmail(email)
            .enterLoginPassword(password)
            .clickLoginButton();


    // Confirmation that user is logged in by checking the URL contains "automationexercise.com"
    String currentUrl = driver.getCurrentUrl();
    Assert.assertTrue(currentUrl.contains("automationexercise.com"),
            "User was NOT redirected to home page after login");
}

}
