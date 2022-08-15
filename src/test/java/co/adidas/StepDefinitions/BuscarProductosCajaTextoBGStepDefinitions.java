package co.adidas.StepDefinitions;


import co.adidas.tasks.BuscarProductosCajaTextoBG;
import co.adidas.userInterface.BuscarProductosCajaTextoOT_UI;
import co.adidas.utils.BuscarProductosCajaTextoBGModels;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import java.io.IOException;
import java.util.List;

public class BuscarProductosCajaTextoBGStepDefinitions {
    BuscarProductosCajaTextoOT_UI buscarProductosCajaTextoOT_ui = new BuscarProductosCajaTextoOT_UI();
    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^quiero buscar el producto$")
    public void quieroBuscarElProducto(List<BuscarProductosCajaTextoBGModels> arg1) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductosCajaTextoBG.enAdidas(arg1.get(0).getProducto()));
    }


    @Then("^valido el producto$")
    public void validoElProducto(List<BuscarProductosCajaTextoBGModels> arg1) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion
                .the(buscarProductosCajaTextoOT_ui.LBL_PRODUCTO.of()), WebElementStateMatchers.containsText(arg1.get(0).getValidar())));
    }
}
