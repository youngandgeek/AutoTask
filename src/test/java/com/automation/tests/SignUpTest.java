package com.automation.tests;

import com.automation.base.BaseTest;
import com.automation.pages.HomePage;
import com.automation.pages.SignUpPage;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest {

/**
    @Test
    public void testNavigationToLogin() {

        new HomePage(driver)
                .clickSignupLogin();
    }

    @Test

    public void testSignUp() {

        new HomePage(driver)
                .clickSignupLogin()   // goes to SignUpPage
                .enterName("Test")
                .enterEmail("test" + System.currentTimeMillis() + "@test.com")
                .clickSignupBtn();
    }
    **/
/**
@Test
public void testFullNavigationToRegisterForm() {

    new HomePage(driver)
            .clickSignupLogin()   // Home → Signup page
            .enterName("Test")
            .enterEmail("test" + System.currentTimeMillis() + "@test.com")
            .clickSignupBtn()     // Signup → Register page
            .enterFirstName("Eman"); // Now on Register page


}
**/


}
