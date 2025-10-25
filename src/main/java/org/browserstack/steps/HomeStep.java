package org.browserstack.steps;

import net.serenitybdd.annotations.Step;
import org.browserstack.pages.CheckoutPage;
import org.browserstack.pages.HomePage;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.By;

import static net.serenitybdd.core.Serenity.getDriver;

public class HomeStep {

    @Page
    HomePage homePage;

    @Page
    CheckoutPage checkoutPage;


    private By getMarca(String marca) {
        return By.xpath(String.format("//span[normalize-space()='%s']", marca));
    }

    @Step("Filtro de productos por marca")
    public void filtroMarca(String marca) {
        getDriver().findElement(getMarca(marca)).click();
        homePage.getOPT_LOWEST_PRICE().click();
    }

    @Step("Agregar al carrito")
    public void agregarAlCarrito() {
        homePage.getBTN_ADD_TO_CART().click();
    }

    @Step("iniciar checkout")
    public void iniciarCheckout() {
        checkoutPage.getBTN_CHECKOUT().click();


    }
}
