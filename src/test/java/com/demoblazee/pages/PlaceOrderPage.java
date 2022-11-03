package com.demoblazee.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class PlaceOrderPage extends BasePage{

    @FindBy(id = "name")
    public WebElement name;

    public WebElement _country;

    public WebElement _city;

    public WebElement _card;

    public WebElement _month;

    public WebElement _year;

    @FindBy(xpath = "//button[contains(.,'Purchase')]")
    public WebElement purchaseButton;

    public void randomText(){

        Faker faker = new Faker();
        name.sendKeys(faker.name().fullName());
        _country.sendKeys(faker.country().name());
        _city.sendKeys(faker.country().capital());
        _card.sendKeys(faker.finance().creditCard());
        _month.sendKeys(""+faker.number().numberBetween(1,12));
        _year.sendKeys(""+faker.number().numberBetween(2020,2030));
        purchaseButton.click();





    }
}
