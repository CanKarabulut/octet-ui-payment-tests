package com.cankarabulut.octetui.steps;

import com.cankarabulut.octetui.base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;


public class BaseSteps {
    protected WebDriver driver;

    public BaseSteps() {
        this.driver = BaseTest.driver;
    }

    public void getUrl(String url) {
        driver.get(url);
        String actualUrl = getCurrentUrl();
        Assertions.assertEquals(url, actualUrl, "Current Url is not correct");
    }

    public String getCurrentUrl() {
        String currentUrl = driver.getCurrentUrl();
        return currentUrl;
    }

    public WebElement findElement(By key) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(key));
        WebElement element = driver.findElement(key);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'center'})", element);
        return element;
    }

    public boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void findAndClickElement(By by, String text) {
        List<WebElement> elementList = driver.findElements(by);
        for (WebElement element : elementList) {
            if (element.getText().trim().equalsIgnoreCase(text)) {
                element.click();
                break;
            }
        }
    }

    public void hoverElement(By key) {
        WebElement element = findElement(key);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public void clickElement(By by) {
        findElement(by).click();
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public boolean isDiplayedClickElement(By by) {
        WebElement element = findElement(by);
        if (element.isDisplayed())
            clickElement(element);
        return element.isDisplayed();
    }

    public void sendText(By by, String text) {
        if (isElementPresent(by)) {
            findElement(by).sendKeys(text);
        }
    }

    public void scrollElement(By key) {
        scrollElement(findElement(key));
    }

    public void scrollElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
    }

    public static boolean isNumeric(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public String randomPOSGenerate() {
        Random random = new Random();
        int randomNumber = 10000 + random.nextInt(900000);
        return String.format("%06d", randomNumber);
    }

    public String randomSelectElementsAndClick(By by) {
        List<WebElement> randomElementList = driver.findElements(by);
        if (randomElementList.isEmpty()) {
            throw new NoSuchElementException("No Bank Found: " + by);
        }
        Random random = new Random();
        int randomIndex = random.nextInt(randomElementList.size());
        WebElement selectedElement = randomElementList.get(randomIndex);
        String selectedBankName = selectedElement.getText();
        selectedElement.click();
        return selectedBankName;
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }
}
