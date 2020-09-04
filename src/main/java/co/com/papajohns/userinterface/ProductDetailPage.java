package co.com.papajohns.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ProductDetailPage {
    public static final Target BTN_PIZZA_SIZE = Target.the("Pizza size button").locatedBy("//div[@class='pizza_size_item']/span[text()='{0}']/preceding-sibling::a");
    public static final Target RADIO_DOUGH_TYPE = Target.the("Dough type radio").locatedBy("//div[contains(@class,'type_of_mass')]/label[text()='{0}']/preceding-sibling::input");
    public static final Target BTN_ADD_CART = Target.the("Add to cart button").locatedBy("//input[@value='Añadir al carrito']");
    public static final Target BTN_CHANGE_INGREDIENTS = Target.the("Change ingredients button").locatedBy("//a[text()='Modificar ingredientes ']");
    public static final Target CHECK_INGREDIENTS = Target.the("Ingredients check").locatedBy("//label[text()='{0} ']/preceding-sibling::input");
    public static final Target BTN_ADD_INGREDIENT = Target.the("Add ingredient button").locatedBy("//a[text()='Agregar']");

    private ProductDetailPage() {
    }
}
