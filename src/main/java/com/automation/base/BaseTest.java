package com.automation.base;

import com.automation.pages.HomePage;
import com.automation.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


/**Setup & teardown (before/after tests) * Get driver from DriverManager * used by your test classes */

public class BaseTest {
protected WebDriver driver;
protected HomePage homePage;

    // @BeforeMethod — used by Login, Register tests
    @BeforeMethod(groups = "notLogged")
    public void setUp() {
        driver = DriverManager.getDriver();
        driver.get("https://automationexercise.com/");
    }
/**
//used by Purchase and any test needing login
    @BeforeMethod(groups = "Logged")
    public void setUpWithLogin() {
        driver = DriverManager.getDriver();
        driver.get("https://automationexercise.com/");
        homePage = new HomePage(driver)
                .clickSignupLogin()
                .enterLoginEmail("autouser_1@testmail.com")
                .enterLoginPassword("123456")
                .clickLoginButton();
    }
**/
   @AfterMethod
    public void tearDown() {
        DriverManager.quitDriver();
    }

}
