package com.cankarabulut.octetui.stepdefinitions;

import com.cankarabulut.octetui.steps.LoginPageSteps;
import io.cucumber.java.en.And;

public class LoginPageStepDefinitions {
    LoginPageSteps loginPageSteps = new LoginPageSteps();

    @And("The user fills in the email and password fields and clicks the continue button.")
    public void fillEmailAndPasswordFieldsAndLogin() throws InterruptedException {
        String email = "virkiyokku@gufum.com";
        String password = "Otomasyon123";
        Thread.sleep(2000);
        loginPageSteps.fillEmailAndPasswordFieldAndlogin(email, password);
        Thread.sleep(2000);
    }

    @And("The user fills TFA code and click confirm button")
    public void theUserFillsTFACodeAndClickConfirmButton() throws InterruptedException {
        int TFACode = 123456;
        Thread.sleep(2000);
        loginPageSteps.fill2FACodeAndLogin(TFACode);
        Thread.sleep(1000);
    }
}
