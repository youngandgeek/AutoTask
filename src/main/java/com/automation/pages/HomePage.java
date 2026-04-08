package com.automation.pages;

import com.automation.base.BasePage;
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


//verify user logged
public HomePage verifyLoggedInAs(String expectedName) {
    String actualName = driver.findElement(loggedInUsername).getText();
    Assert.assertEquals(actualName, expectedName,
            "Expected logged in as '" + expectedName
                    + "' but found '" + actualName + "'");
    return this;
}

    public HomePage clickLogoutBtn() {
        click(logOutBtn);
        return this;
    }

}
