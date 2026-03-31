package com.automation.pages;

import com.automation.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    //Enter Account Information Form locators https://automationexercise.com/signup
private final By UserTitleRadioBtn = By.cssSelector("#id_gender2");
private final By UserNameInput = By.cssSelector("input[data-qa='name']");
private final By UserEmailInput = By.cssSelector("input[data-qa='email']");
private final By UserPasswordInput = By.cssSelector("input[data-qa='password']");
private final By UserDayOfBirthInput = By.cssSelector("input[data-qa='days']");
private final By UserMonthOfBirthInput = By.cssSelector("input[data-qa='months']");
private final By UserYearOfBirthInput = By.cssSelector("input[data-qa='years']");
//Sign up for our newsletter!
private final By UserNewsletterCheckbox = By.cssSelector("#newsletter");
//Receive special offers from our partners
private final By UserSpecialOffersCheckbox = By.xpath("//input[@id='optin']");

//Address Information Form locators
private final By UserFirstNameInput = By.cssSelector("input[data-qa='first_name']");
private final By UserLastNameInput = By.cssSelector("input[data-qa='last_name']");
private final By UserCompanyInput = By.cssSelector("input[data-qa='company']");
private final By UserAddressInput = By.cssSelector("input[data-qa='address']");
private final By UserAddress2Input = By.cssSelector("input[data-qa='address2']");
private final By UserCountrySelect = By.cssSelector("select[data-qa='country']");
private final By UserStateInput = By.cssSelector("input[data-qa='state']");
private final By UserCityInput = By.cssSelector("input[data-qa='city']");
private final By UserZipcodeInput = By.cssSelector("input[data-qa='zipcode']");
private final By UserMobileNumberInput = By.cssSelector("input[data-qa='mobile_number']");
private final By CreateAccountBtn = By.cssSelector("button[data-qa='create-account']");
private final By accountCreatedMsg = By.cssSelector("h2[data-qa='account-created']");



    public RegisterPage enterFirstName(String fName) {
        type(UserFirstNameInput, fName);
        return this;
    }

    public RegisterPage enterPassword(String password) {
        type(UserPasswordInput, password);
        return this;
    }
    public RegisterPage selectTitle() {
        click(UserTitleRadioBtn);
        return this;
    }
}
