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

            ChromeOptions options = new ChromeOptions();

            // works locally + CI
            options.addArguments("--headless=new");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");

            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        }

        return driver;
    }
    //setup WebDriver (e.g., Chrome) and return it


    /** works without ci
  *  public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();

         driver = new ChromeDriver();
            driver.manage().window().maximize();


        }

     return driver;
}
  **/



//close the browser after test execution

    public static void quitDriver () {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

 }