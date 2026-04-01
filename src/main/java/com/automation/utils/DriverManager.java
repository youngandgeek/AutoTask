package com.automation.utils;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
//Create and manage WebDriver
    private static WebDriver driver;
public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
            driver.manage().window().maximize();

        /**    ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("--disable-notifications");
            options.addArguments("--disable-infobars");
            options.addArguments("--start-maximized");

            driver = new ChromeDriver(options);
**/
        }

     return driver;
}

/**
    public static void quitDriver () {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
**/
 }