package tasks;

import interactions.ClickPopup;
import interactions.Esperar;
import models.Usuario;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static userinterface.CrearUsuarioUserInterface.*;
import static userinterface.LoginUserInterface.*;

public class CrearUsuario implements Task {

    private List<Usuario> data;

    public CrearUsuario(List<Usuario> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Esperar.unTiempo(2500),
                Click.on(BTN_USUARIO),
                ClickPopup.on(BTN_CREAR_USUARIO),
                Esperar.unTiempo(1500),
                Enter.theValue(data.get(0).getNombreUsuario()).into(TXT_NOMBRE_USUARIO),
                Enter.theValue(data.get(0).getCorreoElectronico()).into(TXT_CORREO_ELECTRONICO_USUARIO),
                Enter.theValue(data.get(0).getContrasena()).into(TXT_CONTRASENA_USUARIO),
                Enter.theValue(data.get(0).getContrasena()).into(TXT_CONFIRMAR_CONTRASENA_USUARIO),
                Enter.theValue(data.get(0).getPrimerNombre()).into(TXT_PRIMER_NOMBRE_USUARIO),
                Enter.theValue(data.get(0).getPrimerApellido()).into(TXT_APELLIDO_USUARIO),
                Enter.theValue(data.get(0).getNumeroTelefono()).into(TXT_TELEFONO_USUARIO),
                Click.on(CMB_PAIS_USUARIO),
                Esperar.unTiempo(1500),
                Click.on(BTN_PAIS_USUARIO.of(data.get(0).getPaisResidencia())),
                Enter.theValue(data.get(0).getCiudadResisdencia()).into(TXT_CIUDAD_USUARIO),
                Enter.theValue(data.get(0).getDireccionResidencia()).into(TXT_DIRECCION_USUARIO),
                Enter.theValue(data.get(0).getDepartamentoResidencia()).into(TXT_DEPARTAMENTO_USUARIO),
                Enter.theValue(data.get(0).getCodigoPostal()).into(TXT_CODIGO_POSTAL_USUARIO),
                Click.on(CHECK_TERMINO_CONDICIONES_USUARIO),
                Esperar.unTiempo(1500),
                Click.on(BTN_REGISTRAR_USUARIO),
                Esperar.unTiempo(2000)
        );
    }

    public static CrearUsuario nuevo(List<Usuario> data)
    {
        return Instrumented.instanceOf(CrearUsuario.class).withProperties(data);
    }
}
