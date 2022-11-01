package com.demoblazee.pages;

import com.demoblazee.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPages extends BasePage{

@FindBy(xpath = "//a[.='Add to cart']")
public WebElement addToCart;




public void navigateTo(String product, String category){
    Driver.get().findElement(By.linkText(category)).click();
    Driver.get().findElement(By.linkText(product)).click();

}

public void addToCart(){
addToCart.click();

    WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofMillis(15));

    Alert alert = Driver.get().switchTo().alert();
    wait.until(ExpectedConditions.alertIsPresent());
    alert.accept();
}
}
