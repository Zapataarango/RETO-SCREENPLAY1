package co.adidas.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class BuscarProductoRandomUI {

    public final Target BTN_DEPORTES = Target.the("Botón categoria Deportes").locatedBy("//a[text() = 'DEPORTES']");
    public final Target BTN_RANDOM = Target.the("Botón para ingresar a un producto random").locatedBy("//div[@class='glass-product-card__assets']");
    public final Target BTN_ANUNCIO = Target.the("Botón cerrado de anuncio").locatedBy("(//div[@role='dialog']//button)[2]");


}
