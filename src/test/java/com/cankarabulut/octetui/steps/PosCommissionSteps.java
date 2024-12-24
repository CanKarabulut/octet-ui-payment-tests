package com.cankarabulut.octetui.steps;

import com.cankarabulut.octetui.pageitems.PosCommission;
import com.cankarabulut.octetui.pageitems.PosPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Date;


public class PosCommissionSteps extends BaseSteps {
    public void definesCommissions() throws InterruptedException {
        sendText(PosPage.POS_SEARCH_FIELD, PosPageSteps.randomPOSName);
        Thread.sleep(2000);
        clickElement(PosPage.POS_SEARCH_BUTTON);
        Thread.sleep(2000);
        clickElement(PosPage.POS_ACTION_BUTTON);

        Thread.sleep(5000);

        WebElement tab = driver.findElement(By.cssSelector(".tabs > :nth-child(2)"));
        tab.click();

        Thread.sleep(5000);

        WebElement button = driver.findElement(By.cssSelector(":nth-child(1) > .module-layout > .box > .justify-content-space-between > :nth-child(2) > .row > .button"));
        button.click();

        Thread.sleep(2000);

        WebElement inputField = driver.findElement(By.cssSelector(":nth-child(1) > .gap-4 > :nth-child(1) > .input > .col > .row > [data-testid='formItem-name']"));
        inputField.sendKeys("TestC");

        Thread.sleep(2000);

        WebElement startDateInput = driver.findElement(By.cssSelector("[data-testid='formItem-startDate'] > .input > .input-fieldset-container > .align-items-center > #input"));
        startDateInput.click();
        Date date = new Date();
        int day = date.getDate();
        int day2 = day + 7;

        String dateSelector = ".dates > :nth-child(" + day2 + ")";
        WebElement dateElement = driver.findElement(By.cssSelector(dateSelector));
        dateElement.click();

        Thread.sleep(1000);

        WebElement okButton = driver.findElement(By.cssSelector(".date-picker-actions > .row > :nth-child(2) > .button"));
        okButton.click();

        Thread.sleep(2000);

        WebElement diffrentValueForCard = driver.findElement(By.cssSelector("[data-testid='formItem-defineDifferentValuesForCommercialCards'] > .slider"));
        diffrentValueForCard.click();

        Thread.sleep(2000);

        WebElement bireyselKartKomisyonuInput = driver.findElement(By.xpath(
                "//tr[td//h6[text()='Not On Us Kredi']]//td[2]//input"
        ));

        bireyselKartKomisyonuInput.sendKeys("1");

        Thread.sleep(2000);

        double bireyselKartKomisyonu = 5.0;
        double ticariKartKomisyonu = 6.0;

        WebElement tekCekimInputBireysel = driver.findElement(By.xpath("//tr[td//h6[text()='Tek Çekim']]//td[2]//input"));
        tekCekimInputBireysel.sendKeys(String.valueOf(bireyselKartKomisyonu));

        WebElement tekCekimInputTicari = driver.findElement(By.xpath("//tr[td//h6[text()='Tek Çekim']]//td[3]//input"));
        tekCekimInputTicari.sendKeys(String.valueOf(ticariKartKomisyonu));

        WebElement ikiTaksitInputTicari = driver.findElement(By.xpath("//tr[td//h6[text()='2 Taksit']]//td[3]//input"));
        ikiTaksitInputTicari.sendKeys(String.valueOf(ticariKartKomisyonu));

        for (int i = 3; i <= 18; i++) {
            try {
                if (i % 2 != 0) {
                    bireyselKartKomisyonu += 1.5;

                    WebElement taksitInputBireysel = driver.findElement(By.xpath("//tr[td//h6[text()='" + i + " Taksit']]//td[2]//input"));
                    taksitInputBireysel.sendKeys(String.valueOf(bireyselKartKomisyonu));
                }

                if (i % 2 == 0) {
                    WebElement taksitInputTicari = driver.findElement(By.xpath("//tr[td//h6[text()='" + i + " Taksit']]//td[3]//input"));
                    taksitInputTicari.sendKeys(String.valueOf(ticariKartKomisyonu));
                }



            } catch (Exception e) {
                System.out.println(i + " Taksit için alanlar bulunamadı.");
            }
        }
        Thread.sleep(2000);
        clickElement(PosCommission.SAVE_BUTTON);
        Thread.sleep(5000);
        clickElement(PosCommission.SAVE_CONFIRM_BUTTON);
        Thread.sleep(2000);
        clickElement(PosCommission.DRAWER_CLOSE);
    }
}
