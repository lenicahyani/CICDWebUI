package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class registerPages extends PageObject {
    private By showHomePage(){return By.cssSelector("#app > div > header > div > div.v-toolbar__title > h3");}
    private By iconLogin(){
        return By.cssSelector("#app > div > header > div > button:nth-child(4) > span > i");
    }
    private By linkRegister(){
        return By.cssSelector("#app > div > main > div > div > div > div.v-card__text > div > a");
    }
    private By inputFullname(){return By.cssSelector("#input-18");}
    private By inputEmail(){return By.cssSelector("#input-46");}
    private By inputPsw(){return By.cssSelector("#input-49");}
    private By buttonRegister(){return By.cssSelector("#app > div > main > div > div > div > div.v-card__text > form > div.text-center > button > span");}

    @Step
    public boolean validateHomepage(){
        return $(showHomePage()).isDisplayed();
    }
    @Step
    public void clickIconLogin(){
        $(iconLogin()).click();
    }
    @Step
    public void clickLinkRegister(){
        $(linkRegister()).click();
    }
    @Step
    public void clickInputFullname(String fullname){
        $(inputFullname()).click();
        $(inputFullname()).type(fullname);
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
    public void clickButtonRegister(){
        $(buttonRegister()).click();
    }
    @Step
    public boolean validateAltashopPage(){
        return $(showHomePage()).isDisplayed();
    }




}
