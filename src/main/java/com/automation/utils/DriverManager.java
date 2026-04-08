package com.automation.utils;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
//Create and manage WebDriver
    private static WebDriver driver;

    //setup WebDriver (e.g., Chrome) and return it
    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
            driver.manage().window().maximize();

        /**if there's a problem with the default ChromeDriver setup, you can try using ChromeOptions to configure the driver with specific arguments. This can help resolve issues related to browser compatibility or security settings. Here's how you can modify the getDriver() method to include ChromeOptions:
         *  ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("--disable-notifications");
            options.addArguments("--disable-infobars");
            options.addArguments("--start-maximized");

            driver = new ChromeDriver(options);
**/
        }

     return driver;
}
//close the browser after test execution

    public static void quitDriver () {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

 }