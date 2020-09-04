package co.com.papajohns.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.papajohns.Utils.Constant.PIZZA_TYPE;
import static co.com.papajohns.userinterface.CartPage.TXT_CART_ITEM;

public class ProductIn implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String pizzaType = actor.recall(PIZZA_TYPE);
        return TXT_CART_ITEM.of(pizzaType).resolveFor(actor).isVisible();
    }

    public static ProductIn theCard() {
        return new ProductIn();
    }
}
