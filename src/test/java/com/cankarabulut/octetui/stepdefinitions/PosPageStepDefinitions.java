package com.cankarabulut.octetui.stepdefinitions;

import com.cankarabulut.octetui.steps.PosPageSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

public class PosPageStepDefinitions {

    PosPageSteps posPageSteps = new PosPageSteps();

    @And("The user first defines a POS, if membership information is not received, defines a bank.")
    public void definesPos(DataTable table) throws InterruptedException {
        posPageSteps.definesPos(table);
    }
}
