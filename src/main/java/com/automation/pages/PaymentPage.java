package com.automation.pages;

import com.automation.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage extends BasePage {

    public PaymentPage(WebDriver driver) {
        super(driver);
    }
//"[data-qa='name']"
    By nameOnCard = By.cssSelector("[data-qa='name-on-card']");
    By cardNumber = By.cssSelector("[data-qa='card-number']");
    By cvv = By.cssSelector("[data-qa='cvc']");
    By expiryMonth = By.cssSelector("[data-qa='expiry-month']");

    By expiryYear = By.cssSelector("[data-qa='expiry-year']");
    By payBtn = By.cssSelector("[data-qa='pay-button']");

    By orderSuccessMsg = By.xpath("//*[contains(normalize-space(),'Order Placed')]");
    By continueBtn = By.xpath("//a[contains(text(),'Continue')]");

    public PaymentPage enterNameOnCard(String name) {
      type(nameOnCard, name);
                return this;
    }

    public PaymentPage enterCardNumber(String number) {
      type(cardNumber, number);
        return this;
    }

    public PaymentPage enterCvv(String code) {
 type(cvv,code);
return this;
    }

    public PaymentPage enterExpiryMonth(String month) {
type(expiryMonth,month);
return this;
    }

    public PaymentPage enterExpiryYear(String year) {
      type(expiryYear, year);
        return this;
    }

    public PaymentPage clickPayAndConfirmOrder() {
click(payBtn);
        return this;
    }

    // ASSERTION METHOD
    public boolean isOrderPlaced() {
        return driver.findElement(orderSuccessMsg).isDisplayed();
    }

    public HomePage clickContinue() {
        click(continueBtn);
        return new HomePage(driver);
    }
}

