package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.selectcategoryPages;

public class selectcategoryStep {
    @Steps
    selectcategoryPages pages;

    @Given("On home page")
    public void iAmOnHomePage() {
        pages.validatefieldSelectCategory();
    }

    @When("I click Select Category button")
    public void iClickSelectCategory() {
        pages.clikFieldSelectCategory();
    }

    @And("I Select Category")
    public void iSelectCategory() {
        pages.validateselectCategory();
    }

    @Then("Show Product by Category")
    public void showProductbyCategory() {
        pages.validateshowCategory();
    }

}