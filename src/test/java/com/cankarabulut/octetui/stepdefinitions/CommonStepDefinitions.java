package com.cankarabulut.octetui.stepdefinitions;

import com.cankarabulut.octetui.steps.BaseSteps;
import io.cucumber.java.en.Given;

public class CommonStepDefinitions {

    BaseSteps baseSteps = new BaseSteps();

    @Given("User get {string} address")
    public void driverSet(String url) {
        baseSteps.getUrl(url);
    }
}
