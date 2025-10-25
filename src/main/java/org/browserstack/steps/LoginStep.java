package org.browserstack.steps;

import net.serenitybdd.annotations.Step;
import org.browserstack.models.UserData;
import org.browserstack.pages.HomePage;
import org.browserstack.pages.LoginPage;
import org.browserstack.utils.ExcelReader;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginStep {

    @Page
    HomePage homePage;

    @Page
    LoginPage loginPage;

    String dataExcel = "src/test/resources/data/Credentials.xlsx";

    UserData userData = ExcelReader.readData(dataExcel);

    @Step("Abrir navegador")
    public void abrirNavegador() {
        homePage.openUrl("https://www.bstackdemo.com/");
    }

    @Step("Logueo exitoso")
    public void loginUsuario(){
        homePage.getBTN_SIGNIN().click();
        loginPage.getINPUT_USERNAME().sendKeys(userData.getUserName());
        loginPage.getINPUT_USERNAME().sendKeys(Keys.ENTER);
        loginPage.getINPUT_PASSWORD().sendKeys(userData.getPassword());
        loginPage.getINPUT_PASSWORD().sendKeys(Keys.ENTER);
        loginPage.getBTN_LOGIN().click();
    }

    @Step("Espera elemento")
    public void esperaElemento(WebElement element) {
        WebDriverWait wait = new WebDriverWait(loginPage.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
