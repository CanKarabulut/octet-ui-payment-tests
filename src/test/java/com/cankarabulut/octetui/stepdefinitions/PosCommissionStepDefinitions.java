package com.cankarabulut.octetui.stepdefinitions;

import com.cankarabulut.octetui.steps.PosCommissionSteps;
import io.cucumber.java.en.And;

public class PosCommissionStepDefinitions {

    PosCommissionSteps posCommissionSteps = new PosCommissionSteps();

    @And("By entering POS information, the user determines the installment commission rate for individual cards and commercial cards, starting from tomorrow.")
    public void byEnteringPOSInformationTheUserDeterminesTheInstallmentCommissionRateForIndividualCardsAndCommercialCardsStartingFromTomorrow() throws InterruptedException {
        posCommissionSteps.definesCommissions();
    }
}
