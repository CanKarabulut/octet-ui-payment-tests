package com.cankarabulut.octetui.base;

import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseTest {
    public static RemoteWebDriver driver;

    @Given("Select Browser As {string}")
    public static void setUp(String browserName) {
        String browser = browserName.toUpperCase();
        switch (browser.toUpperCase()) {
            case "CHROME":
                driver = Drivers.CHROME.browserConfigureOptions();
                break;
            case "FIREFOX":
                driver = Drivers.FIREFOX.browserConfigureOptions();
                break;
            case "SAFARI":
                driver = Drivers.SAFARI.browserConfigureOptions();
                break;
        }
        driver.manage().window().maximize();
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
