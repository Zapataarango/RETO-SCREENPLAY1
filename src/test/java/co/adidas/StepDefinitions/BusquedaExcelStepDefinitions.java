package co.adidas.StepDefinitions;

import co.adidas.tasks.BusquedaExcel;
import co.adidas.userInterface.BuscarProductosCajaTextoOT_UI;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;


public class BusquedaExcelStepDefinitions {
    BuscarProductosCajaTextoOT_UI buscarProductosCajaTextoOT_ui = new BuscarProductosCajaTextoOT_UI();

    @When("^quiero comprar productos(.*)$")
    public void quieroComprarProductos(String termino) {
        OnStage.theActorInTheSpotlight().attemptsTo(BusquedaExcel.enAdidas(termino));

    }

    @Then("^selecciono una lista de productos(.*)$")
    public void seleccionoUnaListaDeProductos(String Validar) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion
                .the(buscarProductosCajaTextoOT_ui.LBL_PRODUCTO.of()), WebElementStateMatchers.containsText(Validar)));
    }
}
