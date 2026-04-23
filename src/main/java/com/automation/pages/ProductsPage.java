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

   private final By continueShoppingBtn = By.xpath("//button[contains(text(),'Continue Shopping')]");
    //driver.findElement(By.xpath("//u[normalize-space()='View Cart']"))
    private final     By viewCartBtn = By.xpath("//a[@href='/view_cart']");


    public ProductsPage navigateToProducts() {
      click(productsNavBtn);
        return this;
    }

    //one product at a time
    public ProductsPage addProductToCart(int productId) {
        By addToCart = By.xpath("//a[@data-product-id='" + productId + "']");
        click(addToCart);
       return this;
    }
/** without ci accepts multiple product ids and adds them to cart
public ProductsPage addMultipleProducts(int... productIds) {
    for (int id : productIds) {
        By addToCart = By.xpath("//a[@data-product-id='" + id + "']");
        click(addToCart);
        continueShopping();

    }
    return this;
}
**/
// Add multiple products (CI SAFE VERSION)
public ProductsPage addMultipleProducts(int... productIds) {

    for (int id : productIds) {

        By addToCart = By.xpath("//a[@data-product-id='" + id + "']");

        // 1. Click product safely
        wait.until(ExpectedConditions.elementToBeClickable(addToCart)).click();

        // 2. Wait modal appears
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueShoppingBtn));

        // 3. Click continue shopping safely
        wait.until(ExpectedConditions.elementToBeClickable(continueShoppingBtn)).click();

        // 4. Wait modal disappears before next iteration (VERY IMPORTANT)
        wait.until(ExpectedConditions.invisibilityOfElementLocated(continueShoppingBtn));
    }

    return this;
}

    private void waitForModal() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueShoppingBtn));
    }
    public ProductsPage continueShopping() {
        waitForModal();
       click(continueShoppingBtn);
        return this;
    }

    public CartPage clickViewCart() {
      click(viewCartBtn);
      return new CartPage(driver);
    }
}

