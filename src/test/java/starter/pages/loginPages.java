package starter.pages;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class loginPages extends PageObject {
    private By showHomePage(){return By.cssSelector("#app > div > header > div > div.v-toolbar__title > h3");}
    private By iconLogin(){
        return By.cssSelector("#app > div > header > div > button:nth-child(4) > span > i");
    }
    private By inputEmail(){return By.cssSelector("#input-1669");}
    private By inputPsw(){return By.cssSelector("#input-1672");}
    private By buttonLogin(){return By.cssSelector("#app > div > main > div > div > div > div.v-card__text > form > div.text-center > button > span");}

    @Step
    public boolean validateHomepage(){
        return $(showHomePage()).isDisplayed();
    }
    @Step
    public void clickIconLogin(){
        $(iconLogin()).click();
    }
    @Step
    public void clickInputEmail(String email){
        $(inputEmail()).click();
        $(inputEmail()).type(email);
    }
    @Step
    public void clickInputPsw(String password){
        $(inputPsw()).click();
        $(inputPsw()).type(password);
    }
    @Step
    public void clickButtonLogin(){
        $(buttonLogin()).click();
    }
    @Step
    public boolean validateAltashopPage(){
        return $(showHomePage()).isDisplayed();
    }




}
