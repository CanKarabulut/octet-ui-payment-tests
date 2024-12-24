package com.cankarabulut.octetui.pageitems;

import org.openqa.selenium.By;

public class LoginPage {
    public static final By EMAIL_INPUT = By.cssSelector("[data-testid='formItem-email']");
    public static final By PASSWORD_INPUT = By.cssSelector("[data-testid='formItem-password']");
    public static final By SUBMIT_BUTTON = By.cssSelector("[data-testid='form-submit']");
    public static final By TFA_FIELD = By.cssSelector(".input-0");
    public static final By TFA_CONFIRM = By.cssSelector(".mt-16 > .button");
}
