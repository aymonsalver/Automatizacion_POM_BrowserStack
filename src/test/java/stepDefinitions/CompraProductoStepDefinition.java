package stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.annotations.Steps;
import org.browserstack.pages.HomePage;
import org.browserstack.pages.LoginPage;
import org.browserstack.steps.CheckoutStep;
import org.browserstack.steps.HomeStep;
import org.browserstack.steps.LoginStep;
import org.fluentlenium.core.annotation.Page;

public class CompraProductoStepDefinition {

    @Page
    HomePage homePage;

    @Page
    LoginPage loginPage;

    @Steps
    LoginStep loginStep;

    @Steps
    HomeStep homeStep;

    @Steps
    CheckoutStep checkoutStep;


    // ========== Escenario: @CompraExitosa ==========
    @Dado("que el usuario se encuentra autenticado")
    public void queElUsuarioSeEncuentraAutenticado() {
        loginStep.abrirNavegador();
        loginStep.loginUsuario();
    }

    @Cuando("el usuario filtra los productos por precio y marca {string}")
    public void elUsuarioFiltraLosProductosPorPrecioYMarca(String marca) {
        homeStep.filtroMarca(marca);
    }

    @Cuando("el usuario agrega al carrito el primer producto")
    public void elUsuarioAgregaAlCarritoElPrimerProducto() {
        homeStep.agregarAlCarrito();
    }

    @Cuando("realiza el proceso de checkout")
    public void realizaElProcesoDeCheckout() {
        checkoutStep.checkout();
    }
    @Entonces("el usuario debera ver el mensaje de comfirmacion {string}")
    public void elUsuarioDeberaVerElMensajeDeComfirmacion(String texto) {
        checkoutStep.validarCompra(texto);
    }


    // ========== Escenario: @CompraSinAutenticacion ==========
    @Dado("que el usuario NO se encuentra autenticado")
    public void queElUsuarioNOSeEncuentraAutenticado() {
        loginStep.abrirNavegador();
        loginStep.esperaElemento(homePage.getBTN_SIGNIN());
    }

    @Cuando("el usuario intenta agregar al carrito el primer producto")
    public void elUsuarioIntentaAgregarAlCarritoElPrimerProducto() {
        homeStep.agregarAlCarrito();
        homeStep.iniciarCheckout();
    }

    @Entonces("el usuario deberia ser redirigido a la pagina de login")
    public void elUsuarioDeberiaSerRedirigidoALaPaginaDeLogin() {
        loginStep.esperaElemento(loginPage.getBTN_LOGIN());

    }

}
