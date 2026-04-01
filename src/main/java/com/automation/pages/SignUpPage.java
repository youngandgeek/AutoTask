package com.automation.pages;

import com.automation.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends BasePage {


    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    //locators to define web elements
    /*
    private By emailInput = By.id("email");
    private By passwordInput = By.id("password");
     */ //and methods to perform actions on those web elements
    /**
     *  public LoginPage enterEmail(String email) { driver.findElement(emailInput).sendKeys(email);
     *         return this; } */
    private final By signupNameInput = By.cssSelector("input[data-qa='signup-name']");
    private final By signupEmailInput = By.cssSelector("input[data-qa='signup-email']");
    private final By signupButton= By.cssSelector("button[data-qa='signup-button']");
    // By loginButton = By.cssSelector("button[data-qa='login-button']");


    public SignUpPage enterName(String name) {
        type(signupNameInput, name);
        return this;
    }

    public SignUpPage enterEmail(String email) {
      type(signupEmailInput,email);
      return this;
    }

    public RegisterPage clickSignupBtn() {
      click(signupButton);
       return new RegisterPage(driver);
    }

}

