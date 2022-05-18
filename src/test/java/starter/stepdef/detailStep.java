package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.detailPages;

public class detailStep {
    @Steps
    detailPages pages;

    @Given("on home page")
    public void iamOnHomePage() {
        pages.validatetombolDetail();
    }

    @When("I click detail button")
    public void iClickAnItem() {
        pages.clikTombolDetail();
    }

    @Then("Show Detail Product")
    public void showDetailProduct() {
        pages.validatenamaProduct();
    }

}

