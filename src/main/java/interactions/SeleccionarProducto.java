package interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import userinterface.PrincipalUserInterface;
import utils.NumeroAleatorio;

import java.util.List;

public class SeleccionarProducto implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listaCategoriaProducto = PrincipalUserInterface.BTN_SELECCIONAR_PRODUCTO.resolveAllFor(actor);
        listaCategoriaProducto.get(NumeroAleatorio.randomAleatorio(listaCategoriaProducto.size())).click();
    }

    public static Performable aCarrito()
    {
        return Instrumented.instanceOf(SeleccionarProducto.class).withProperties();
    }
}
