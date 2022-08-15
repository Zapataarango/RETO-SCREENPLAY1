package co.adidas.StepDefinitions;

import co.adidas.tasks.BuscarRandom;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class BuscarProductoRandomStepDefinitions {

    @When("^quiero entrar en la tienda y comprar productos$")
    public void quieroEntrarEnLaTiendaYComprarProductos() {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarRandom.enAdidas());
    }


    @Then("^selecciono un prodcuto aleatorio$")
    public void seleccionoUnProducto() {
    }
}
