package org.browserstack.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageObject {

    @FindBy(id = "firstNameInput")
    WebElement INPUT_FIRST_NAME;

    @FindBy(id = "lastNameInput")
    WebElement INPUT_LAST_NAME;

    @FindBy(id = "addressLine1Input")
    WebElement INPUT_ADDRESS;

    @FindBy(id = "provinceInput")
    WebElement INPUT_STATE;

    @FindBy(id = "postCodeInput")
    WebElement INPUT_POSTAL_CODE;

    @FindBy(id = "checkout-shipping-continue" )
    WebElement BTN_SUBMIT;

    @FindBy(className = "buy-btn")
    WebElement BTN_CHECKOUT;

    @FindBy(id = "confirmation-message")
    WebElement LBL_CONFIRMATION_MESSAGE;

    public WebElement getINPUT_FIRST_NAME() {
        return INPUT_FIRST_NAME;
    }

    public WebElement getINPUT_LAST_NAME() {
        return INPUT_LAST_NAME;
    }

    public WebElement getINPUT_ADDRESS() {
        return INPUT_ADDRESS;
    }

    public WebElement getINPUT_STATE() {
        return INPUT_STATE;
    }

    public WebElement getINPUT_POSTAL_CODE() {
        return INPUT_POSTAL_CODE;
    }

    public WebElement getBTN_SUBMIT() {
        return BTN_SUBMIT;
    }

    public WebElement getLBL_CONFIRMATION_MESSAGE() {
        return LBL_CONFIRMATION_MESSAGE;
    }

    public WebElement getBTN_CHECKOUT() {
        return BTN_CHECKOUT;
    }
}
