package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class cartPages extends PageObject {
    private By iconCart(){
        return By.cssSelector("#app > div > header > div > button:nth-child(3) > span > span > i");
    }
    private By buttonBayar(){return By.cssSelector("#button-bayar > span");}
    private By showTransactionPages(){return By.cssSelector("#app > div > main > div > div > h1");}

    @Step
    public void clikIconCart(){
        $(iconCart()).click();
    }
    @Step
    public boolean validateIconCart(){
        return $(iconCart()).isDisplayed();
    }
    @Step
    public boolean validateButtonBayar(){
        return $(buttonBayar()).isDisplayed();
    }
    @Step
    public boolean validateshowTransactionPages(){
        return $(showTransactionPages()).isDisplayed();
    }

}