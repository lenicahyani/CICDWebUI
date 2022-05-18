package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.loginPages;

public class loginStep {
    @Steps
    loginPages loginpages;

    @Given ("user on Home Page")
    public void userOnHomePage() {
        loginpages.validateHomepage();
    }
    @When ("user tap icon login")
    public void userTabIconLogin() {
        loginpages.clickIconLogin();
    }
    @And  ("user input {string} on email field")
    public void userInputEmail(String email) {
        loginpages.clickInputEmail(email);
    }
    @And("user input {string} on password field")
    public void userInputPsw(String password) {
        loginpages.clickInputPsw(password);
    }
    @And  ("user tab button login")
    public void userTabButtonLogin() {
        loginpages.clickButtonLogin();
    }
    @Then ("android user on altashop page")
    public void userOnAlthashopPage() {
        loginpages.validateAltashopPage();
    }


}
