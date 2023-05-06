package starter.demobank.pages;

import net.serenitybdd.core.pages.PageComponent;

public class HomePage extends PageComponent {

    public String getLoggedUsername() {
        return $("#user_name").getText();
    }
}
