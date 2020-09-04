package co.com.papajohns.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.papajohns.userinterface.ProductDetailPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectExtra implements Interaction {
    private String[] ingredients;

    public SelectExtra(String[] ingredientsList) {
        this.ingredients = ingredientsList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (ingredients.length != 0) {
            actor.attemptsTo(Click.on(BTN_CHANGE_INGREDIENTS));
            for (String ingredient : ingredients) {
                actor.attemptsTo(
                        Click.on(CHECK_INGREDIENTS.of(ingredient.trim()))
                );
            }
            actor.attemptsTo(Click.on(BTN_ADD_INGREDIENT));
        }
    }

    public static SelectExtra ingredients(String[] ingredientsList) {
        return instrumented(SelectExtra.class, (Object) ingredientsList);
    }
}
