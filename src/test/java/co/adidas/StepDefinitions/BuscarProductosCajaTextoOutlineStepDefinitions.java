package co.adidas.StepDefinitions;


import co.adidas.driver.DriverScreenplay;
import co.adidas.tasks.BuscarProductosCajaTextoOT;
import co.adidas.userInterface.BuscarProductosCajaTextoOT_UI;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import java.io.IOException;

public class BuscarProductosCajaTextoOutlineStepDefinitions {
    BuscarProductosCajaTextoOT_UI buscarProductosCajaTextoOT_ui = new BuscarProductosCajaTextoOT_UI();

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que me encuentro en adidas (.*)$")
    public void queMeEncuentroEnAdidasHttpsWwwAdidasCo(String url) {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(DriverScreenplay.chromeDrive(url)));
    }


    @When("^quiero buscar producto en la caja de texto (.*)$")
    public void quieroBuscarProductoEnLaCajaDeTexto(String Producto) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductosCajaTextoOT.enAdidas(Producto));
    }

    @Then("^encuentro el producto (.*)$")
    public void encuentroElProducto(String Validar) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion
                .the(buscarProductosCajaTextoOT_ui.LBL_PRODUCTO.of()), WebElementStateMatchers.containsText(Validar)));
    }
}

