package tasks;

import variables.VariablesProductos;
import interactions.SeleccionarCategoria;
import interactions.SeleccionarProducto;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.PrincipalUserInterface;

import static userinterface.PrincipalUserInterface.*;
import static variables.VariablesProductos.descripcionProducto;

public class AgregarProducto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SeleccionarCategoria.deProducto(),
                SeleccionarProducto.aCarrito());
        descripcionProducto = TXT_NOMBRE_PRODUCTO.resolveFor(actor).getText();
        actor.attemptsTo(Click.on(BTN_ANADIR_PRODUCTO),
                Click.on(BTN_CARRITO));
    }

    public static AgregarProducto aCarritoDeCompras()
    {
        return Instrumented.instanceOf(AgregarProducto.class).withProperties();
    }
}
