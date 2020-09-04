package co.com.papajohns.stepdefinitions;

import co.com.papajohns.tasks.OpenThe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.Before;

public class Hooks {
    @Managed(driver = "chrome")
    private WebDriver browser;
    public static final Actor Daniel = Actor.named("Daniel");

    @Before
    public void prepararEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Before
    public void inicializacion() {
        Daniel.can(BrowseTheWeb.with(browser));
        Daniel.wasAbleTo(OpenThe.browser());
    }
}
