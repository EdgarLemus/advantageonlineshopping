package interactions;

import driver.RemoteWebDriver;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import java.util.Iterator;
import java.util.Set;

import static driver.RemoteWebDriver.driver;

public class ClickPopup implements Interaction {

    private Target target;

    public ClickPopup(Target target) {
        this.target = target;
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

        actor.attemptsTo(Click.on(target));

        driver.switchTo().window(parentWindowHandler);
    }

    public static Performable on(Target target)
    {
        return Instrumented.instanceOf(ClickPopup.class).withProperties(target);
    }
}
