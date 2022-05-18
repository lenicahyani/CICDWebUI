package starter.pages;

        import net.serenitybdd.core.pages.PageObject;
        import net.thucydides.core.annotations.Step;
        import org.openqa.selenium.By;

public class selectcategoryPages extends PageObject {
    private By fieldSelectCategory(){
        return By.cssSelector("#app > div.v-application--wrap > main > div > div > div.v-input.v-input--is-focused.theme--light.v-text-field.v-text-field--single-line.v-text-field--solo.v-text-field--is-booted.v-text-field--enclosed.v-select.v-select--is-menu-active.primary--text > div > div.v-input__slot > div.v-select__slot > div.v-select__selections");
    }
    private By selectCategory(){return By.cssSelector("#list-item-13480-0 > div > div");}
    private By showCategory(){return By.cssSelector("#app > div.v-application--wrap > main > div > div > div.v-alert.v-sheet.theme--light.elevation-2.v-alert--border.v-alert--border-top");}

    @Step
    public void clikFieldSelectCategory(){
        $(fieldSelectCategory()).click();
    }
    @Step
    public boolean validatefieldSelectCategory(){
        return $(fieldSelectCategory()).isDisplayed();
    }
    @Step
    public boolean validateselectCategory(){
        return $(selectCategory()).isDisplayed();
    }
    @Step
    public boolean validateshowCategory(){
        return $(showCategory()).isDisplayed();
    }

}