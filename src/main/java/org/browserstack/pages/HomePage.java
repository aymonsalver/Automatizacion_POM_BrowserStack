package org.browserstack.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {

    @FindBy(id = "signin")
    WebElement BTN_SIGNIN;

    @FindBy(className = "username")
    WebElement LBL_USERNAME;

    @FindBy(xpath = "//option[@value='lowestprice']")
    WebElement OPT_LOWEST_PRICE;

    @FindBy(xpath = "(//*[@class='shelf-item__buy-btn'])[1]" )
    WebElement BTN_ADD_TO_CART;


    public WebElement getBTN_SIGNIN() {
        return BTN_SIGNIN;
    }

    public WebElement getLBL_USERNAME() {
        return LBL_USERNAME;
    }

    public WebElement getOPT_LOWEST_PRICE() {
        return OPT_LOWEST_PRICE;
    }

    public WebElement getBTN_ADD_TO_CART() {
        return BTN_ADD_TO_CART;
    }

}
