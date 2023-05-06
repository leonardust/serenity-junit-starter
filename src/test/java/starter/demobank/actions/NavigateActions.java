package starter.demobank.actions;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class NavigateActions extends UIInteractions {

    @Step("Navigate to the login page")
    public void goToDemoBankLoginPage() {
        openUrl("https://demo-bank.vercel.app/");
    }
}
