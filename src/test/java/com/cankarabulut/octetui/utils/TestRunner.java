package com.cankarabulut.octetui.utils;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.cankarabulut.octetui.base",
                "com.cankarabulut.octetui.stepdefinitions",
        },
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class TestRunner {
}
