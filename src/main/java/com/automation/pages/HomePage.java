package com.automation.pages;

import com.automation.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {




    public HomePage(WebDriver driver) {

        super(driver);
    }
    private final By signupLoginNavBtn = By.cssSelector("a[href='/login']");



    public SignUpPage clickSignupLogin() {
        click(signupLoginNavBtn);
        return new SignUpPage(driver);
    }
}
