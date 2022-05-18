package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.cartPages;

public class cartStep {
    @Steps
    cartPages pages;

    @Given("on Home Page")
    public void iAmOnHomePage() {
        pages.validateIconCart();
    }

    @When("I click Icon Cart")
    public void iClickIconCart() {
        pages.clikIconCart();
    }

    @And("I click Button Bayar")
    public void iClickButtonBayar() {
        pages.validateButtonBayar();
    }

    @Then("Show Transactions Pages")
    public void showTransactionPages() {
        pages.validateshowTransactionPages();
    }

}