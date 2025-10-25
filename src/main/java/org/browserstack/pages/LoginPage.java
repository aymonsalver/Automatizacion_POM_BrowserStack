package org.browserstack.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

    @FindBy(id = "react-select-2-input")
    WebElement INPUT_USERNAME;

    @FindBy(id = "react-select-3-input")
    WebElement INPUT_PASSWORD;

    @FindBy(id = "login-btn")
    WebElement BTN_LOGIN;

    public WebElement getINPUT_USERNAME() {
        return INPUT_USERNAME;
    }

    public WebElement getINPUT_PASSWORD() {
        return INPUT_PASSWORD;
    }

    public WebElement getBTN_LOGIN() {
        return BTN_LOGIN;
    }
}
