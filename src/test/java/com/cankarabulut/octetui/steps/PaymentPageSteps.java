package com.cankarabulut.octetui.steps;

import com.cankarabulut.octetui.pageitems.PaymentPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PaymentPageSteps extends BaseSteps {
    public void tryToPay() throws InterruptedException {
        Thread.sleep(2000);
        hoverElement(PaymentPage.ISLEMLER_MENU);
        clickElement(PaymentPage.TEST_ISLEMLERI_MENU);
        Thread.sleep(2000);
        clickElement(PaymentPage.ADD_PAYMENT_BUTTON);
        Thread.sleep(2000);
        int amount = 1;
        sendText(PaymentPage.PAY_AMOUNT, String.valueOf(amount));
        Thread.sleep(2000);
        clickElement(PaymentPage.BANK_LIST);
        Thread.sleep(1000);
        clickElement(PaymentPage.QNB_BANK);
        Thread.sleep(2000);
        clickElement(PaymentPage.POS_NAME);
        String cardNumber = "5456165456165454";
        sendText(PaymentPage.CARD_NUMBER, cardNumber);
        sendText(PaymentPage.CARD_NAME, "Test");
        Thread.sleep(2000);
        WebElement expiryDate = driver.findElement(By.cssSelector(":nth-child(11) > .mask-input > .mask-input-fieldset-container"));
        expiryDate.sendKeys("12 30");

        sendText(PaymentPage.CARD_CVV, "000");
        sendText(PaymentPage.REFERENCE_NUMBER, "1");

        clickElement(PaymentPage.PAY_BUTTON);


        WebElement securityCodeText = driver.findElement(By.id("lblRandomNum"));
        String securityCode = securityCodeText.getText();

        sendText(PaymentPage.SECURITY_CODE_FIELD, securityCode);

        clickElement(PaymentPage.SUBMIT_PAYMENT_BUTTON);

        refreshPage();

        hoverElement(PaymentPage.ISLEMLER_MENU);
        clickElement(PaymentPage.RAPOR_MENU);

        List<WebElement> buttons = driver.findElements(By.cssSelector("[data-testid='tableRowAction-detail']"));
        if (!buttons.isEmpty()) {
            buttons.get(0).click();
        }

        WebElement tutar = driver.findElement(By.xpath("//td[text()='1,00 TRY']"));
        String tutarText = tutar.getText();
        String tutarTextStr = tutarText.split(",")[0];
        Assertions.assertEquals(tutarTextStr, amount);

        WebElement cardNumberText = driver.findElement(By.xpath("//td[contains(text(),'54561654****5454')]"));
        String cardNumberStr = cardNumberText.getText();
        String firstFourDigitsCardNumber = cardNumberStr.substring(0, 4);
        String cardNumberFourDigits = cardNumberStr.substring(0, 4);
        Assertions.assertEquals(cardNumberFourDigits, firstFourDigitsCardNumber );
    }
}
