package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class transactionPages extends PageObject {
    private By iconUser(){
        return By.cssSelector("#app > div.v-application--wrap > header > div > button:nth-child(5) > span > i");
    }
    private By selectLogout(){return By.cssSelector("#list-item-21143 > div.v-list-item__title");}
    private By showTransPages(){return By.cssSelector("#app > div.v-application--wrap > main > div > div > h1");}

    @Step
    public void clikIconUser(){
        $(iconUser()).click();
    }
    @Step
    public boolean validateIconUser(){
        return $(iconUser()).isDisplayed();
    }
    @Step
    public boolean validateselectLogout(){
        return $(selectLogout()).isDisplayed();
    }
    @Step
    public boolean validateshowTransPages(){
        return $(showTransPages()).isDisplayed();
    }

}