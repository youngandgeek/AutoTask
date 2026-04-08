package com.automation.tests;

import com.automation.base.BaseTest;
import com.automation.pages.AccountCreatedPage;
import com.automation.pages.HomePage;
import com.automation.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups = "notLogged")

public class RegisterTest extends BaseTest {

    @Test
    public void TC_001_UserRegistration_HappyPath() {

        String signupName = "Test@12345";
        String signupEmail = "autouser_" + System.currentTimeMillis() + "@testmail.com";

        RegisterPage registerPage = new HomePage(driver)
                .clickSignupLogin()
                .enterSignupName(signupName)
                .enterSignupEmail(signupEmail)
                .clickSignUpBtn();


//from home page navigate to login/signup page and fill signup form
        AccountCreatedPage accountCreatedPage =
                registerPage.selectTitle()
               //    .enterName("Auto User"
              //    .enterEmail(email)
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
                .clickCreateAccountBtn();

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("automationexercise.com"),
                "User was NOT redirected to Account Created page after signup");
        // Step 4: continue to homepage
        accountCreatedPage.clickContinueBtn();
        }

}
