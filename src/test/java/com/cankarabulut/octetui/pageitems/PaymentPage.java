package com.cankarabulut.octetui.pageitems;

import org.openqa.selenium.By;

public class PaymentPage {
    public static final By ISLEMLER_MENU = By.xpath("/html/body/div[1]/div/div/div/div[1]/div/menu/ul/li[1]/div/p");
    public static final By TEST_ISLEMLERI_MENU = By.xpath("/html/body/div[1]/div/div/div/div[1]/div/menu/ul/li[1]/ul/div/div/div[2]/a[2]/p");
    public static final By ADD_PAYMENT_BUTTON = By.className("button-is-color-success");
    public static final By PAY_AMOUNT = By.cssSelector("[data-testid='formItem-amount']");
    public static final By BANK_LIST  = By.xpath("/html/body/div[4]/div/div/div/form/div/section/div/div[7]/div/div/input");
    public static final By QNB_BANK = By.xpath("//li[@data-value='55ed6b68-412a-43ba-9437-77cbf3e823c2']");
    public static final By CARD_NUMBER = By.cssSelector("[data-testid='formItem-cardNumber']");
    public static final By CARD_NAME = By.cssSelector("[data-testid='formItem-cardHolderName']");
    public static final By CARD_CVV = By.cssSelector("[data-testid='formItem-cardCvv2']");
    public static final By POS_NAME = By.xpath("//li[@data-value='1dfebfc2-065a-473e-bf69-9d2cfb21991d']");
    public static final By REFERENCE_NUMBER = By.cssSelector("[data-testid='formItem-referenceNumber']");
    public static final By PAY_BUTTON = By.cssSelector(":nth-child(14) > .row > :nth-child(1)");
    public static final By SECURITY_CODE_FIELD = By.id("txtPwd");
    public static final By RAPOR_MENU = By.xpath("/html/body/div[1]/div/div/div/div[1]/div/menu/ul/li[1]/ul/div/div/div[2]/a[1]/p");
    public static final By SUBMIT_PAYMENT_BUTTON = By.id("submitBtn");
}
