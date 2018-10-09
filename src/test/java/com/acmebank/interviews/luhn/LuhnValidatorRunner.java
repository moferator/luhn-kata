package com.acmebank.interviews.luhn;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/luhn_validator.feature",
        glue = "com.acmebank.interviews.luhn.stepdefs")
public class LuhnValidatorRunner {
}
