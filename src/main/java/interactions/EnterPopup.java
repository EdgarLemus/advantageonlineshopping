package interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.Iterator;
import java.util.Set;

import static driver.RemoteWebDriver.driver;

public class EnterPopup implements Interaction {

    private Target target;
    private String texto;

    public EnterPopup(String texto) {
        this.texto = texto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String parentWindowHandler = driver.getWindowHandle();
        String subWindowHandler = null;

        Set<String> handles = driver.getWindowHandles();
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()){
            subWindowHandler = iterator.next();
        }
        driver.switchTo().window(subWindowHandler);

        actor.attemptsTo(net.serenitybdd.screenplay.actions.Enter.theValue(texto).into(target));

        driver.switchTo().window(parentWindowHandler);
    }

    public static EnterPopup theValue(String texto)
    {
        return Instrumented.instanceOf(EnterPopup.class).withProperties(texto);
    }

    public EnterPopup theTarget(Target target)
    {
        this.target = target;
        return this;
    }
}
