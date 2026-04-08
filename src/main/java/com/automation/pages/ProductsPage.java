package com.automation.pages;

import com.automation.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductsPage extends BasePage {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    private final By productsNavBtn = By.cssSelector("a[href='/products']");

    By continueShoppingBtn = By.xpath("//button[contains(text(),'Continue Shopping')]");
    //driver.findElement(By.xpath("//u[normalize-space()='View Cart']"))
    By viewCartBtn = By.xpath("//a[@href='/view_cart']");

    public ProductsPage navigateToProducts() {
        driver.findElement(productsNavBtn).click();
        return this;
    }

    //one product at a time
    public ProductsPage addProductToCart(int productId) {
        By addToCart = By.xpath("//a[@data-product-id='" + productId + "']");
        driver.findElement(addToCart).click();
        return this;
    }
//accepts multiple product ids and adds them to cart
public ProductsPage addMultipleProducts(int... productIds) {
    for (int id : productIds) {
        By addToCart = By.xpath("//a[@data-product-id='" + id + "']");
        click(addToCart);
        wait.until(ExpectedConditions
                .visibilityOfElementLocated(continueShoppingBtn));
        continueShopping();

    }
    return this;
}

    private void waitForModal() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueShoppingBtn));
    }
    public ProductsPage continueShopping() {
        waitForModal();
        driver.findElement(continueShoppingBtn).click();
        return this;
    }

    public CartPage clickViewCart() {
        driver.findElement(viewCartBtn).click();
        return new CartPage(driver);
    }
}

