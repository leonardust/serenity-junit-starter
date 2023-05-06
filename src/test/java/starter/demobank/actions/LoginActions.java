package starter.demobank.actions;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class LoginActions extends UIInteractions {

    @Step("Login with username {username} and password{password}")
    public void loginWithCredentials(String username, String password) {
        $("#login_id").sendKeys(username);
        $("#login_password").sendKeys(password);
        $("#login-btn").click();
    }
}
