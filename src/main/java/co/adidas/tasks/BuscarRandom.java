package co.adidas.tasks;

import co.adidas.Interactions.ClickRandom;
import co.adidas.userInterface.BuscarProductoRandomUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuscarRandom implements Task {
    private static final BuscarProductoRandomUI buscarProductoRandomUI = new BuscarProductoRandomUI();

    public BuscarRandom() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(buscarProductoRandomUI.BTN_DEPORTES),
                WaitUntil.the(buscarProductoRandomUI.BTN_ANUNCIO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(buscarProductoRandomUI.BTN_ANUNCIO),
                WaitUntil.the(buscarProductoRandomUI.BTN_RANDOM, isVisible()).forNoMoreThan(10).seconds(),
                ClickRandom.enCategoriaDeportes()
        );
    }

    public static Performable enAdidas() {
        return Instrumented.instanceOf(BuscarRandom.class).withProperties();
    }

}
