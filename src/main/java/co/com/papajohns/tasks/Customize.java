package co.com.papajohns.tasks;

import co.com.papajohns.interactions.SelectExtra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.papajohns.Utils.Constant.MEGAFAMILIAR;
import static co.com.papajohns.Utils.Constant.FAMILIAR;
import static co.com.papajohns.userinterface.ProductDetailPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Customize implements Task {
    private String size;
    private String dough;
    private String[] extraIngredients;

    public Customize(String size, String dough, String extraIngredients) {
        this.size = size;
        this.dough = dough;
        this.extraIngredients = extraIngredients.split(",");
    }

    public Customize(String size, String dough) {
        this.size = size;
        this.dough = dough;
        this.extraIngredients = new String[0];
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_PIZZA_SIZE.of(size)),
                Check.whether(size.equals(FAMILIAR) || size.equals(MEGAFAMILIAR)).andIfSo(
                        Click.on(RADIO_DOUGH_TYPE.of(dough))
                ),
                SelectExtra.ingredients(extraIngredients),
                Click.on(BTN_ADD_CART)
        );
    }

    public static Performable pizza(String size, String dough) {
        return instrumented(Customize.class, size, dough);
    }

    public static Performable pizza(String size, String dough, String extraIngredients) {
        return instrumented(Customize.class, size, dough, extraIngredients);
    }

}
