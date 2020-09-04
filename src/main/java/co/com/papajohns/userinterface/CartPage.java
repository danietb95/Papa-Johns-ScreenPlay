package co.com.papajohns.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {
    public static final Target TXT_CART_ITEM = Target.the("Cart item").locatedBy("//tr[@class='itemsMiniCart']//label[text()='{0}']");

    private CartPage() {
    }
}
