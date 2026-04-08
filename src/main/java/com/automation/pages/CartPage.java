package com.automation.pages;

import com.automation.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CartPage extends BasePage {


    public CartPage(WebDriver driver) {
        super(driver);
    }
  //By.xpath("(//a[normalize-space()='Proceed To Checkout'])[1]")
    By proceedToCheckoutBtn = By.xpath("//a[contains(text(),'Proceed To Checkout')]");



    public CartPage deleteProduct(int productId) {
        clickDeleteButton(productId);
        return this;
    }


    public CartPage deleteMultipleProducts(int... productIds) {
        for (int id : productIds) {
            clickDeleteButton(id);
        }
        return this;
    }
    public CartPage clickDeleteButton(int productId) {
        By deleteProductBtn = By.xpath("//a[@data-product-id='" + productId + "']");
        driver.findElement(deleteProductBtn).click();
        return this;
    }

    public CheckoutPage clickProceedToCheckout() {
        driver.findElement(proceedToCheckoutBtn).click();
        return new CheckoutPage(driver);
    }
}
