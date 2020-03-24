package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import driver.RemoteWebDriver;
import models.Usuario;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.CrearUsuario;
import userinterface.CrearUsuarioUserInterface;
import userinterface.PrincipalUserInterface;

import java.io.IOException;
import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CrearUsuarioStepDefinitions {

    @Before
    public void before() throws IOException {
        setTheStage(new OnlineCast());
    }

    @Given("^que el usuario se encuntra en la pagina$")
    public void queElUsuarioSeEncuntraEnLaPagina() {
        theActor("").can(BrowseTheWeb.with(RemoteWebDriver.hisBrowser().get("https://www.advantageonlineshopping.com/#/")));
    }

    @When("^cree un usuario nuevo en la pagina$")
    public void creeUnUsuarioNuevoEnLaPagina(List<Usuario> data) {
        theActorInTheSpotlight().attemptsTo(CrearUsuario.nuevo(data));
    }

    @Then("^podra verse logueado en el sistema (.*)$")
    public void podraVerseLogueadoEnElSistema(String nombreUsuario) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(PrincipalUserInterface.TXT_USUARIO.of(nombreUsuario)), WebElementStateMatchers.containsText(nombreUsuario)));
    }

    @Then("^podra ver en pantalla el mensaje de error$")
    public void podraVerEnPantallaElMensajeDeError() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(CrearUsuarioUserInterface.MSJ_ERROR), WebElementStateMatchers.isVisible()));
    }

}
