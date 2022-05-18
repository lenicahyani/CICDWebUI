package starter.pages;

import net.serenitybdd.core.pages.PageObject;
        import net.thucydides.core.annotations.Step;
        import org.openqa.selenium.By;

public class detailPages extends PageObject {
    private By tombolDetail(){
        return By.cssSelector("#\\31 468 > div > div.v-card__actions.d-block > div.mt-3 > button:nth-child(1) > span");
    }
    private By namaProduct(){return By.cssSelector("#app > div > main > div > div > div > div > p.text-h4.text--primary");}

    @Step
    public void clikTombolDetail(){
        $(tombolDetail()).click();
    }
    @Step
    public boolean validatetombolDetail(){
        return $(tombolDetail()).isDisplayed();
    }
    @Step
    public boolean validatenamaProduct(){
        return $(namaProduct()).isDisplayed();
    }


}