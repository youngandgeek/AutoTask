package com.automation.tests;

import com.automation.base.BaseTest;
import com.automation.pages.*;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

//@Test(groups = "Logged")

public class PurchaseTests extends BaseTest {
    @Test(priority = 3, description = "Verify complete product purchase flow")
    @Description("Happy Path: Add product to cart and complete checkout")

    public void TC_003_ProductPurchase_CompleteFlow() {
    //    HomePage homePage = new HomePage(driver);
//        homePage.verifyLoggedInAs("auto user");

        String email = "autouser_1@testmail.com";
        String password = "123456";

        HomePage homePage = new HomePage(driver)
                .clickSignupLogin()
                .enterLoginEmail(email)
                .enterLoginPassword(password)
                .clickLoginButton();

        CartPage cartPage = new ProductsPage(driver)
                .navigateToProducts()
                .addProductToCart(1)
                .continueShopping()
                .addMultipleProducts(2,3,4)
                .clickViewCart();

        PaymentPage paymentPage = cartPage
                .deleteProduct(3)
                .clickProceedToCheckout()
                .clickPlaceOrder();

        paymentPage
                .enterNameOnCard("Auto User")
                .enterCardNumber("4111111111111111")
                .enterCvv("311")
                .enterExpiryMonth("12")
                .enterExpiryYear("2027")
                .clickPayAndConfirmOrder()
                .isOrderPlaced();
    }


}
