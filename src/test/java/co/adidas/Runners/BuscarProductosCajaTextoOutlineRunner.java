package co.adidas.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@CucumberOptions(
        features = "src/test/resources/co.adidas/BuscarProductossCajaTextoOutline.feature",
        glue = "co.adidas.StepDefinitions",
        snippets = SnippetType.CAMELCASE

)

@RunWith(CucumberWithSerenity.class)
public class BuscarProductosCajaTextoOutlineRunner {
}
