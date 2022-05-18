package starter.pages;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class beliPages extends PageObject {
    private By tombolBeli(){
        return By.cssSelector("//*[@class='button-beli ml-3 v-btn v-btn--outlined theme--light v-size--small primary--text']");
    }
    private By jumlahBarang(){return By.cssSelector("//*[@class='v-badge__wrapper']//*[@class='v-badge__badge primary']");}
    @Step
    public void clikTombolBeli(){
        $(tombolBeli()).click();
    }
    @Step
    public boolean validateTombolBeli(){
        return $(tombolBeli()).isDisplayed();
    }
    @Step
    public boolean validateJumlahBarang(int jumlah){
        return $(jumlahBarang()).getText().equals(jumlah);
    }




}
