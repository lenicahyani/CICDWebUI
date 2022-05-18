package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.transactionPages;

public class transactionStep {
    @Steps
    transactionPages pages;

    @Given("on Home page")
    public void iAmOnHomePage() {
        pages.validateIconUser();
    }

    @When("I click Icon User")
    public void iClickIconUser() {
        pages.clikIconUser();
    }

    @And("I Select Transaction")
    public void iSelectLogout() {
        pages.validateselectLogout();
    }

    @Then("Show Transaction Pages")
    public void showTransPage() {
        pages.validateshowTransPages();
    }

}