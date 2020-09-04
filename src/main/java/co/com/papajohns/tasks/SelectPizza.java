package co.com.papajohns.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.papajohns.Utils.Constant.PIZZA_TYPE;
import static co.com.papajohns.userinterface.HomePage.BTN_MAIN_MENU;
import static co.com.papajohns.userinterface.HomePage.BTN_SUB_MENU;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectPizza implements Task {
    private String mainMenu;
    private String subMenu;

    public SelectPizza(String mainMenu, String subMenu) {
        this.mainMenu = mainMenu;
        this.subMenu = subMenu.toUpperCase();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_MAIN_MENU.of(mainMenu)),
                Click.on(BTN_SUB_MENU.of(mainMenu, subMenu))
        );
        actor.remember(PIZZA_TYPE, subMenu);
    }

    public static Performable fromMenu(String mainMenu, String subMenu){
        return instrumented(SelectPizza.class, mainMenu, subMenu);
    }
}
