package starter.demobank.tests;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import starter.demobank.actions.LoginActions;
import starter.demobank.actions.NavigateActions;
import starter.demobank.pages.HomePage;
import starter.demobank.utils.TestUtils;

import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(SerenityJUnit5Extension.class)
class WhenLoginToDemoBankTest {

//    @Managed(driver = "chrome", options = "headless")
//    WebDriver driver;

    NavigateActions navigate;
    LoginActions login;
    HomePage homePage;

    @Test
    void theUserShouldLoginWithValidCredentials() {
        navigate.goToDemoBankLoginPage();
        login.loginWithCredentials(TestUtils.generateRandomString(8), TestUtils.generateRandomString(8));

        Serenity.reportThat("The logged username should appear in account info section when login with valid credentials",
                () -> assertThat(homePage.getLoggedUsername()).isEqualTo("Jan Demobankowy")
        );
    }
}
