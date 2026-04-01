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
private final By UserNameInput = By.cssSelector("[data-qa='name']");
private final By UserEmailInput = By.cssSelector("[data-qa='email']");
private final By UserPasswordInput = By.cssSelector("[data-qa='password']");
private final By UserDayOfBirthInput = By.cssSelector("[data-qa='days']");
private final By UserMonthOfBirthInput = By.cssSelector("[data-qa='months']");
private final By UserYearOfBirthInput = By.cssSelector("[data-qa='years']");
//Sign up for our newsletter!
private final By UserNewsletterCheckbox = By.cssSelector("#newsletter");
//Receive special offers from our partners
private final By UserSpecialOffersCheckbox = By.xpath("//input[@id='optin']");

//Address Information Form locators
private final By UserFirstNameInput = By.cssSelector("[data-qa='first_name']");
private final By UserLastNameInput = By.cssSelector("[data-qa='last_name']");
private final By UserCompanyInput = By.cssSelector("[data-qa='company']");
private final By UserAddressInput = By.cssSelector("[data-qa='address']");
private final By UserAddress2Input = By.cssSelector("[data-qa='address2']");
private final By UserCountrySelect = By.cssSelector("[data-qa='country']");
private final By UserStateInput = By.cssSelector("[data-qa='state']");
private final By UserCityInput = By.cssSelector("[data-qa='city']");
private final By UserZipcodeInput = By.cssSelector("[data-qa='zipcode']");
private final By UserMobileNumberInput = By.cssSelector("[data-qa='mobile_number']");
private final By CreateAccountBtn = By.cssSelector("[data-qa='create-account']");
private final By accountCreatedMsg = By.cssSelector("[data-qa='account-created']");

    public RegisterPage selectTitle() {
        click(UserTitleRadioBtn);
        return this;
    }

   public RegisterPage enterName(String name) {
        type(UserNameInput, name);
        return this;
    }

    public RegisterPage enterEmail(String email) {
        type(UserEmailInput, email);
        return this;
    }

    public RegisterPage enterPassword(String password) {
        type(UserPasswordInput, password);
        return this;
    }

    public RegisterPage selectDayOfBirth(String day) {
        selectByValue(UserDayOfBirthInput, day);
        return this;
    }
    public RegisterPage selectMonthOfBirth(String month) {
        selectByValue(UserMonthOfBirthInput, month);
        return this;}
    public RegisterPage selectYearOfBirth(String year) {
        selectByValue(UserYearOfBirthInput, year);
        return this;
    }

    public RegisterPage selectNewsletter() {
        click(UserNewsletterCheckbox);
        return this;
    }
    public RegisterPage selectSpecialOffers() {
        click(UserSpecialOffersCheckbox);
        return this;    }


    public RegisterPage enterFirstName(String fName) {
        type(UserFirstNameInput, fName);
        return this;
    }


    public RegisterPage enterLastName(String lName) {
        type(UserLastNameInput, lName);
        return this;
    }
    public RegisterPage enterCompany(String company) {
        type(UserCompanyInput, company);
        return this;
    }
    public RegisterPage enterAddress(String address) {
        type(UserAddressInput, address);
        return this;
    }
    public RegisterPage enterAddress2(String address2) {
        type(UserAddress2Input, address2);
        return this;        }
    public RegisterPage selectCountry(String country) {
        selectByValue(UserCountrySelect, country);
        return this;
    }
    public RegisterPage enterState(String state) {
        type(UserStateInput, state);
        return this;
    }
    public RegisterPage enterCity(String city) {
        type(UserCityInput, city);
        return this;
    }
    public RegisterPage enterZipcode(String zipcode) {
        type(UserZipcodeInput, zipcode);
        return this;
    }
    public RegisterPage enterMobileNumber(String mobileNumber) {
        type(UserMobileNumberInput, mobileNumber);
        return this;
    }


    public RegisterPage clickCreateAccount() {
        click(CreateAccountBtn);
        return this;
    }
    public String getAccountCreatedMessage() {
        return getText(accountCreatedMsg);
    }
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

}
