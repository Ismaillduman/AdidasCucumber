package com.demoblazee.pages;

import com.demoblazee.utilities.BrowserUtils;
import com.demoblazee.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage extends BasePage{

@FindBy(xpath = "//a[.='Add to cart']")
public WebElement addToCart;




public void navigateTo(String product, String category){
    Driver.get().findElement(By.linkText(category)).click();
    BrowserUtils.sleep(1);
    Driver.get().findElement(By.linkText(product)).click();

}

public void addToCart(){


    WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(15));
    wait.until(ExpectedConditions.visibilityOf(addToCart));
    addToCart.click();

    wait.until(ExpectedConditions.alertIsPresent());
    Alert alert = Driver.get().switchTo().alert();

    alert.accept();
}
}
