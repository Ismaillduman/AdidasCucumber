package com.demoblazee.step_definitions;


import com.demoblazee.pages.PlaceOrderPage;
import com.demoblazee.utilities.BrowserUtils;
import io.cucumber.java.en.And;

import com.demoblazee.pages.ProductPage;
import com.demoblazee.utilities.ConfigurationReader;
import com.demoblazee.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PurchaseSteps {

    ProductPage productPage = new ProductPage();
    PlaceOrderPage placeOrderPage = new PlaceOrderPage();
    int expectedPurchaseAmount;

    @Given("User is on the page")
    public void user_is_on_the_page() {
        Driver.get().get(ConfigurationReader.get("demoblazee.url"));
    }

    @When("User adds {string} from {string}")
    public void user_adds_from(String product, String category) {
        productPage.navigateTo(product, category);
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
        productPage.cart.click();
        //wait.until(ExpectedConditions.visibilityOf(placeOrder));
        expectedPurchaseAmount=Integer.parseInt(productPage.totalPrice.getText());
        productPage.placeOrder.click();
        BrowserUtils.sleep(2);


    }


    @And("user fills the form for order and clicks on purchase button")
    public void userFillsTheFormForOrderAndClicksOnPurchaseButton() {
        placeOrderPage.fillForm();

    }

    @Then("Order id and order amount should be as expected")
    public void orderIdAndOrderAmountShouldBeAsExpected() {
        String orderId= placeOrderPage.orderDetails.getText().split("\n")[0];

        System.out.println("orderId = " + orderId);

      int actuelAmount= Integer.parseInt(placeOrderPage.orderDetails.getText().split("\n")[1].split(" ")[1]);

        System.out.println("actuelAmount = " + actuelAmount);

        Assert.assertEquals("Price is not as expected",expectedPurchaseAmount,actuelAmount);

    }
}
