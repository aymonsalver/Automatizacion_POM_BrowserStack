package org.browserstack.steps;

import net.serenitybdd.annotations.Step;
import org.browserstack.models.UserData;
import org.browserstack.pages.CheckoutPage;
import org.browserstack.pages.LoginPage;
import org.browserstack.utils.ExcelReader;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutStep {

    @Page
    CheckoutPage checkoutPage;

    String dataExcel = "src/test/resources/data/Credentials.xlsx";
    UserData userData = ExcelReader.readData(dataExcel);

    @Step("Realizar checkout" )
    public void checkout(){
        checkoutPage.getBTN_CHECKOUT().click();
        checkoutPage.getINPUT_FIRST_NAME().sendKeys(userData.getFirstName());
        checkoutPage.getINPUT_LAST_NAME().sendKeys(userData.getLastName());
        checkoutPage.getINPUT_ADDRESS().sendKeys(userData.getAddress());
        checkoutPage.getINPUT_STATE().sendKeys(userData.getState());
        checkoutPage.getINPUT_POSTAL_CODE().sendKeys(userData.getPostalCode());
        checkoutPage.getBTN_SUBMIT().click();
    }

    @Step("Validar compra")
    public void validarCompra(String text){
        WebDriverWait wait = new WebDriverWait(checkoutPage.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(checkoutPage.getLBL_CONFIRMATION_MESSAGE()));
        String actualText = checkoutPage.getLBL_CONFIRMATION_MESSAGE().getText();
        Assert.assertEquals("Error: los textos no coinciden", text, actualText);
    }
}
