package com.automation.pages;

import com.automation.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    //By placeOrderBtn = By.xpath("//a[contains(text(),'Place Order')]");
    By placeOrderBtn = By.xpath("//a[@href='/payment']");


    public PaymentPage clickPlaceOrder() {
      click(placeOrderBtn);
      return new PaymentPage(driver);
    }
}