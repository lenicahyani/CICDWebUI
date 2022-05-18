package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.beliPages;

public class beliStep {
    @Steps
    beliPages pages;

    @Given ("I am on home page")
    public void iAmOnHomePage() {
        pages.validateTombolBeli();
    }

    @When ("I click buy button")
    public void iClickAnItem() {
        pages.clikTombolBeli();
    }

    @Then ("Product added to cart")
    public void theNumberOfProductsIncreases() {
        pages.validateJumlahBarang(1);
    }

}
