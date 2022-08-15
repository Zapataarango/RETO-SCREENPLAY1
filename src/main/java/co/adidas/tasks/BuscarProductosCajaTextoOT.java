package co.adidas.tasks;

import co.adidas.userInterface.BuscarProductosCajaTextoOT_UI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuscarProductosCajaTextoOT implements Task {
    BuscarProductosCajaTextoOT_UI buscarProductosCajaTextoOTUI = new BuscarProductosCajaTextoOT_UI();

    private final String Producto;

    public BuscarProductosCajaTextoOT(String Producto) {
        this.Producto = Producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(Producto).into(buscarProductosCajaTextoOTUI.TXT_BARRA_BUSQUEDA),
                Enter.keyValues(Keys.ENTER).into(buscarProductosCajaTextoOTUI.TXT_BARRA_BUSQUEDA),
                WaitUntil.the(buscarProductosCajaTextoOTUI.LBL_PRODUCTO, isVisible()).forNoMoreThan(10).seconds()
                );
    }

    public static Performable enAdidas(String Producto) {
        return Instrumented.instanceOf(BuscarProductosCajaTextoOT.class).withProperties(Producto);
    }

}
