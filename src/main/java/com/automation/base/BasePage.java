package com.automation.base;

import com.automation.utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    //Common actions for all pages.,
//    contains reusable methods that all page objects inherit from to reduce code duplication.
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public BasePage() {
    }

    // Waits for element to be clickable before clicking
    protected void click(org.openqa.selenium.By locator) {
        //remove ads if present before clicking to avoid click interception
        removeAdsIfPresent();

        try {
            wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
        } catch (Exception e) {
            WebElement el = driver.findElement(locator);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", el);
        }
    }
    // Waits for element to be visible then types into it
    protected void type(org.openqa.selenium.By locator, String text) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(text);
    }

    // Waits for element to be visible and returns its text
    protected String getText(org.openqa.selenium.By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
    }

    // Waits for element to be visible and returns the element
    protected WebElement getElement(org.openqa.selenium.By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void selectByValue(By locator, String value) {
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(locator));
        new Select(dropdown).selectByValue(value);
    }

    protected void selectByVisibleText(By locator, String text) {
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(locator));
        new Select(dropdown).selectByVisibleText(text);
    }
    protected  void removeAdsIfPresent() {
            ((JavascriptExecutor) driver).executeScript(
                    "document.querySelectorAll(\"iframe[id^='aswift']\").forEach(el => el.remove());"
            );
        }

}
