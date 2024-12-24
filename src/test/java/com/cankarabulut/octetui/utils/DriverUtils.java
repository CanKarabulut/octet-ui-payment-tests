package com.cankarabulut.octetui.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverUtils {
    public static WebDriver getChromeDriver() {
        String driverPath = System.getProperty("user.dir") + "/drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);

        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        options.addArguments("--disable-notifications");
        driver.manage().window().maximize();
        return driver;
    }
}
