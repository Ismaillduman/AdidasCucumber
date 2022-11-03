package com.demoblazee.step_definitions;


import io.cucumber.java.en.And;

import com.demoblazee.pages.ProductPage;
import com.demoblazee.utilities.ConfigurationReader;
import com.demoblazee.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class PurchaseSteps {
ProductPage productPage= new ProductPage();
    @Given("User is on the page")
    public void user_is_on_the_page() {
        Driver.get().get(ConfigurationReader.get("demoblazee.url"));
    }
    @When("User adds {string} from {string}")
    public void user_adds_from(String product, String category) {
        productPage.navigateTo(product,category);
        productPage.addToCart();
        productPage.home.click();

    }

    @And("User navigates to cart and removes {string}")
    public void userNavigatesToCartAndRemoves(String product) {
        productPage.cart.click();
        productPage.deleteProduct(product);



    }

    @And("user click on place order")
    public void userClickOnPlaceOrder() {
        productPage.place();

    }
}
