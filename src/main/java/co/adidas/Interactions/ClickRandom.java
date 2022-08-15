package co.adidas.Interactions;

import co.adidas.userInterface.BuscarProductoRandomUI;
import co.adidas.utils.VariableGlobal;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

public class ClickRandom implements Interaction {

    public ClickRandom() {
    }

    BuscarProductoRandomUI buscarProductoRandomUI = new BuscarProductoRandomUI();


    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Random random = new Random();
        List<WebElementFacade> listaBtnProductos = buscarProductoRandomUI.BTN_RANDOM.resolveAllFor(actor);
        int numRandom = random.nextInt(listaBtnProductos.size());
        VariableGlobal.productoAleatorio = listaBtnProductos.get(numRandom).getText();
        listaBtnProductos.get(numRandom).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Performable enCategoriaDeportes() {
        return Instrumented.instanceOf(ClickRandom.class).withProperties();
    }
}
