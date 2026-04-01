package com.automation.base;

import com.automation.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
/**Setup & teardown (before/after tests)
 * Get driver from DriverManager
 * used by your test classes
 */
protected WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = DriverManager.getDriver();
        driver.get("https://automationexercise.com/");
    }
/**
   @AfterMethod
    public void tearDown() {
        DriverManager.quitDriver();
    }
   **/
}
