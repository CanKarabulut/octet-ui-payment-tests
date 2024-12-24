package com.cankarabulut.octetui.stepdefinitions;

import com.cankarabulut.octetui.steps.PaymentPageSteps;
import io.cucumber.java.en.And;

public class PaymentPageStepDefinitions {

    PaymentPageSteps paymentPageSteps = new PaymentPageSteps();

    @And("The user selects a card information and attempts to make payment.")
    public void TheUserSelectsaCardInformationAndAttemptstoMakePayment() throws InterruptedException {
        paymentPageSteps.tryToPay();
    }
}
