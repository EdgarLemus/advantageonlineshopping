package tasks;

import interactions.ClickPopup;
import interactions.EnterPopup;
import interactions.Esperar;
import models.Usuario;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.CrearUsuarioUserInterface;

import java.util.List;

import static userinterface.LoginUserInterface.*;

public class LoguearUsuarioEnPagina implements Task {

    private List<Usuario> data;

    public LoguearUsuarioEnPagina(List<Usuario> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Esperar.unTiempo(2500),
                Click.on(BTN_USUARIO),
                ClickPopup.on(BTN_CREAR_USUARIO),
                Esperar.unTiempo(1500),
                Click.on(CrearUsuarioUserInterface.BTN_LOGUEAR_USUARIO),
                Esperar.unTiempo(2000),
                EnterPopup.theValue(data.get(0).getNombreUsuario()).theTarget(TXT_USUARIO),
                EnterPopup.theValue(data.get(0).getContrasena()).theTarget(TXT_CONTRASENA),
                ClickPopup.on(BTN_INGRESAR),
                Esperar.unTiempo(1500));
    }

    public static LoguearUsuarioEnPagina aTravesDePaginaRegistro(List<Usuario> data)
    {
        return Instrumented.instanceOf(LoguearUsuarioEnPagina.class).withProperties(data);
    }
}
