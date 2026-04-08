package com.automation.pages;

import com.automation.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountCreatedPage extends BasePage {
    public AccountCreatedPage(WebDriver driver) {

        super(driver);
    }
    //goes to home page
    private final By continueBtn = By.cssSelector("[data-qa='continue-button']");


    public HomePage  clickContinueBtn() {
        click(continueBtn);
        return new HomePage(driver);
    }

}
