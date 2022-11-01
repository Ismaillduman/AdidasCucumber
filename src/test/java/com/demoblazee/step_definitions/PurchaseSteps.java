package com.demoblazee.step_definitions;

import com.demoblazee.utilities.ConfigurationReader;
import com.demoblazee.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class PurchaseSteps {

    @Given("User is on the page")
    public void user_is_on_the_page() {
        Driver.get().get(ConfigurationReader.get("demoblazee.url"));
    }
    @When("User adds {string} from {string}")
    public void user_adds_from(String product, String category) {

    }
}
