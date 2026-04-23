package com.automation.tests;

import com.automation.base.BaseTest;
import com.automation.pages.HomePage;
import com.automation.pages.LoginSignupPage;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLogin extends BaseTest {
    @Test(priority = 4, description = "Verify error message for invalid login")
    @Description("Negative Path: Invalid login credentials")
    public void TC_004_UserInvalidLogin_NegativePath() {

        LoginSignupPage loginSignupPage = new HomePage(driver)
                .clickSignupLogin()
                .enterLoginEmail("invalid@test.com")
                .enterLoginPassword("WrongPassword123");
        // Attempt login
                 loginSignupPage.clickLoginButton();
// verify error message

        Assert.assertEquals(
                loginSignupPage.getErrorMessage(),
                "Your email or password is incorrect!"
        );

        Assert.assertTrue(loginSignupPage.isErrorDisplayed());

        // Verify user not logged in
        Assert.assertFalse(new HomePage(driver).isUserLoggedIn());

    }
}
