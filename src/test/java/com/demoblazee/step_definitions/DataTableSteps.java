package com.demoblazee.step_definitions;

import com.demoblazee.pages.BasePage;
import com.demoblazee.pages.ProductPage;
import com.demoblazee.utilities.BrowserUtils;
import com.demoblazee.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DataTableSteps {

    ProductPage page = new ProductPage();

    @Then("Under {string} category User should be able to see the list of following products")
    public void under_category_user_should_be_able_to_see_the_list_of_following_products(String category, List<String> expectedProducts) {


        Driver.get().findElement(By.linkText(category)).click();
        BrowserUtils.sleep(2);
        List<WebElement> productsElements = page.products;
        List<String> actualProducts = BrowserUtils.getElementsText(page.products);

        System.out.println("expectedProducts = " + expectedProducts);
        System.out.println("actualProducts = " + actualProducts);
        //verification Assertion
        Assert.assertEquals("List of products are not as expected", expectedProducts,actualProducts);


    }
}