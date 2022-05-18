package starter.stepdef;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.loginPages;
import starter.pages.registerPages;

public class registerStep {
    @Steps
    registerPages registerpages;

    @Given ("User on Home Page")
    public void userOnHomePage() {
        registerpages.validateHomepage();
    }
    @When ("User tap icon login")
    public void UsertabIconLogin() {
        registerpages.clickIconLogin();
    }
    @And ("user click link register")
    public void userClickRegister() {
        registerpages.clickLinkRegister();
    }
    @And  ("user input {string} on fullname field")
    public void userinputFullname(String fullname) {
        registerpages.clickInputFullname(fullname);
    }
    @And  ("user input {string} field")
    public void userinputEmail(String email) {
//        Faker faker = new Faker();
//        registerpages.clickInputEmail(faker.internet().emailAddress());
        registerpages.clickInputEmail(email);
    }
    @And("user input {string} On password field")
    public void userinputPsw(String password) {
        registerpages.clickInputPsw(password);
    }
    @And  ("user tab button register")
    public void userTabButtonRegister() {
        registerpages.clickButtonRegister();
    }
    @Then ("android user on Altashop page")
    public void useronAlthashopPage() {
        registerpages.validateAltashopPage();
    }


}
