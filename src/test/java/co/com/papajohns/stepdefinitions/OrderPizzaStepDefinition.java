package co.com.papajohns.stepdefinitions;

import co.com.papajohns.questions.ProductIn;
import co.com.papajohns.tasks.Customize;
import co.com.papajohns.tasks.SelectPizza;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static co.com.papajohns.stepdefinitions.Hooks.Daniel;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class OrderPizzaStepDefinition {
    @When("^The user buy a (.*) pizza from (.*) section$")
    public void theUserSelectPizzaFromSection(String subMenu, String mainMenu) {
        Daniel.attemptsTo(
                SelectPizza.fromMenu(mainMenu, subMenu)
        );
    }

    @When("^select a (.*) pizza with (.*)$")
    public void selectAPizza(String size, String doughType) {
        Daniel.attemptsTo(
                Customize.pizza(size, doughType)
        );
    }

    @When("^select a (.*) pizza, extra (.*) with (.*)$")
    public void selectAPizzaExtraIngredients(String size, String extraIngredients, String doughType) {
        Daniel.attemptsTo(
                Customize.pizza(size, doughType, extraIngredients)
        );
    }

    @Then("^The user should see the product in the cart list$")
    public void theUserShoulsSeeTheProductInTheCartList() {
        Daniel.should(
                seeThat(ProductIn.theCard())
        );
    }

}
