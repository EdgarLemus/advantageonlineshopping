package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.AgregarProducto;

import java.io.IOException;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static userinterface.PrincipalUserInterface.TXT_NOMBRE_PRODUCTO_CARRITO;
import static variables.VariablesProductos.descripcionProducto;

public class CarritoComprasStepDefinitions {

    @Before
    public void before() throws IOException {
        setTheStage(new OnlineCast());
    }

    @When("^agregue un articulo en el carrito de compra$")
    public void agregueUnArticuloEnElCarritoDeCompra() {
        theActorInTheSpotlight().attemptsTo(AgregarProducto.aCarritoDeCompras());
    }

    @Then("^podra verlo en la lista de compras$")
    public void podraVerloEnLaListaDeCompras() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(TXT_NOMBRE_PRODUCTO_CARRITO.of(descripcionProducto)), WebElementStateMatchers.containsText(descripcionProducto)));
    }
}
