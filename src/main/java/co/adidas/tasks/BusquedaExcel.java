package co.adidas.tasks;

import co.adidas.utils.Read;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.adidas.userInterface.BuscarProductosCajaTextoOT_UI.TXT_BARRA_BUSQUEDA;

public class BusquedaExcel implements Task {
    private String termino;

    public BusquedaExcel(String termino) {
        this.termino = termino;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(
                    Enter.keyValues(Read.excel(termino)).into(TXT_BARRA_BUSQUEDA),
                    Enter.keyValues(Keys.ENTER).into(TXT_BARRA_BUSQUEDA));

    }

    public static Performable enAdidas(String termino) {
        return Instrumented.instanceOf(BusquedaExcel.class).withProperties(termino);
    }
}
