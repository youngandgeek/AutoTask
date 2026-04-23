package com.automation.pages;

import com.automation.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginSignupPage extends BasePage {

    public LoginSignupPage(WebDriver driver) {

        super(driver);
    }

    //LoginPage form
    private By loginEmailInput = By.cssSelector("[data-qa='login-email']");
    private By loginpasswordInput = By.cssSelector("[data-qa='login-password']");
    //signup form
    private final By signupNameInput = By.cssSelector("[data-qa='signup-name']");
    private final By signupEmailInput = By.cssSelector("[data-qa='signup-email']");
    private final By errorMessage = By.xpath("//p[normalize-space()='Your email or password is incorrect!']");



    //goes to home page after successful login
    private By loginButton = By.cssSelector("[data-qa='login-button']");

    //goes to register page
    private final By signUpBtn = By.cssSelector("[data-qa='signup-button']");


    public LoginSignupPage enterLoginEmail(String email) {
        type(loginEmailInput, email);
        return this;
    }


    public LoginSignupPage enterLoginPassword(String password) {
        type(loginpasswordInput, password);
        return this;
    }
    public HomePage clickLoginButton() {
        click(loginButton);
        return new HomePage(driver);
    }

// VERIFICATIONS

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

    public boolean isErrorDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }


    public LoginSignupPage enterSignupName(String name) {
        type(signupNameInput, name);
        return this;
    }

    public LoginSignupPage enterSignupEmail(String email) {
        type(signupEmailInput,email);
        return this;
    }

    public RegisterPage clickSignUpBtn() {
        click(signUpBtn);
        return new RegisterPage(driver);
    }
    //negative tests
    public LoginSignupPage clickSignupBtnExpectingFailure() {
        click(signUpBtn);
        return this;
    }

}
