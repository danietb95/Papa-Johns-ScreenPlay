package co.com.papajohns.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.papajohns.com.co")
public class HomePage extends PageObject {
    public static final Target BTN_MAIN_MENU = Target.the("Main menu button").locatedBy("//nav[@id='main-menu']//a[@title='{0}']");
    public static final Target BTN_SUB_MENU = Target.the("Sub menu button").locatedBy("//nav[@id='main-menu']//a[@title='{0}']/following-sibling::div[1]//a[.//span[text()='{1}']]");

    private HomePage() {
    }
}
