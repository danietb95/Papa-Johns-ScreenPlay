package co.com.papajohns.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/buy_pizza.feature",
        glue = "co.com.papajohns.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class BuyPizzaRunner {
}
