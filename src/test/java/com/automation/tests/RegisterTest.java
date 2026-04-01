package com.automation.tests;

import com.automation.base.BaseTest;
import com.automation.pages.HomePage;
import com.automation.pages.RegisterPage;
import com.automation.pages.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void TC_001_UserRegistration_HappyPath() {

        String email = "autouser_" + System.currentTimeMillis() + "@testmail.com";
        String password = "Test@12345";

        // Step 1: home page loaded by BaseTest
        // Step 2: click Signup/Login
        SignUpPage signupPage = new HomePage(driver).clickSignupLogin();

        // Step 3: fill signup form
        RegisterPage registerPage = signupPage
                .enterName("Auto sUser")
                .enterEmail(email)
                .clickSignupBtn();

        // Step 4: fill registration detail form
        registerPage
                .selectTitle()
                .enterName("Auto User")
         //       .enterEmail(email)
                .enterPassword("password")
                .selectDayOfBirth("10")
                .selectMonthOfBirth("5")
                .selectYearOfBirth("1995")
                .enterFirstName("Auto")
                .enterLastName("User")
                .enterAddress("123 Test Street")
                .selectCountry("United States")
                .enterState("California")
                .enterCity("Los Angeles")
                .enterZipcode("90001")
                .enterMobileNumber("0123456789")
                .clickCreateAccount();

        // Step 5: verify account created
        Assert.assertEquals(registerPage.getAccountCreatedMessage(), "ACCOUNT CREATED!");
    }

}
