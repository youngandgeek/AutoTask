package com.automation.pages;

import com.automation.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {

        super(driver);
    }

    private final By signupLoginNavBtn = By.cssSelector("a[href='/login']");

    private final By loggedInUsername  = By.cssSelector("li a b");

    private final By logOutBtn = By.cssSelector("a[href='/logout']");

    public LoginSignupPage clickSignupLogin() {
        click(signupLoginNavBtn);
        return new LoginSignupPage(driver);
    }


    @Step("Verify user is logged in as: {expectedName}")
    public HomePage verifyLoggedInAs(String expectedName) {
        String actualName = getText(loggedInUsername);

        Assert.assertEquals(actualName, expectedName,
                "Expected logged in as '" + expectedName
                        + "' but found '" + actualName + "'");

        return this;
    }
    public boolean isUserLoggedIn() {
        try {
            return driver.findElement(logOutBtn).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    public HomePage clickLogoutBtn() {
        click(logOutBtn);
        return this;
    }

}
