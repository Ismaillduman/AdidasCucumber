package com.demoblazee.pages;

import com.demoblazee.utilities.BrowserUtils;
import com.demoblazee.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PublicKey;
import java.time.Duration;

public class ProductPage extends BasePage{

@FindBy(xpath = "//a[.='Add to cart']")
public WebElement addToCart;



@FindBy(xpath = "//button[.='Place Order']")
public WebElement placeOrder;

public void place(){
    WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(15));
    wait.until(ExpectedConditions.visibilityOf(cart));
    cart.click();
    wait.until(ExpectedConditions.visibilityOf(placeOrder));
   placeOrder.click();
}

    @FindBy(xpath = " //td[contains(.,'Sony vaio i5')]/../td[4]/a")
    public WebElement sonyvaioI5Delete;
public void deleteProduct(String product){
    WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(15));
    wait.until(ExpectedConditions.visibilityOf(cart));
    String locator= " //td[contains(.,'"+product+"')]/../td[4]/a";
    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(locator)));
    Driver.get().findElement(By.xpath(locator)).click();

}




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

