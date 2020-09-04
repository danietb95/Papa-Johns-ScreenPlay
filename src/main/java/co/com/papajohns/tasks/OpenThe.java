package co.com.papajohns.tasks;

import co.com.papajohns.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenThe implements Task {
    private HomePage homePage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(homePage));
    }

    public static Performable browser(){
        return instrumented(OpenThe.class);
    }
}
