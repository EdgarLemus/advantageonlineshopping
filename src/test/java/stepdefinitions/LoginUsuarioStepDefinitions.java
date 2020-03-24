package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.Usuario;
import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.LoguearUsuario;
import tasks.LoguearUsuarioEnPagina;
import userinterface.LoginUserInterface;

import java.io.IOException;
import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginUsuarioStepDefinitions {

    @Before
    public void before() throws IOException {
        setTheStage(new OnlineCast());
    }

    @When("^ingrese en la pagina logueandose$")
    public void ingreseEnLaPaginaLogueandose(List<Usuario> data) {
        theActorInTheSpotlight().attemptsTo(LoguearUsuario.enPagina(data));
    }

    @When("^ingrese en la pagina logueandose a traves de la pagina de registro$")
    public void ingreseEnLaPaginaLogueandoseATravesDeLaPaginaDeRegistro(List<Usuario> data) {
        theActorInTheSpotlight().attemptsTo(LoguearUsuarioEnPagina.aTravesDePaginaRegistro(data));
    }

    @Then("^podra en pantalla el mensaje de error$")
    public void podraEnPantallaElMensajeDeError() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(LoginUserInterface.MSJ_ERROR), WebElementStateMatchers.isVisible()));
    }
}
