package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class ChapterFirstPage {

    private WebDriver driver;

    @FindBy(id = "secondajaxbutton")
    WebElement secondajax;

    @FindBy(xpath = "//select[@id='selecttype']")
    WebElement dropdown;

    @FindBy(id = "verifybutton")
    WebElement verifybutton;

    public ChapterFirstPage(WebDriver driver){

        this.driver = driver;
    }


    public ChapterFirstPage clickSecondAjaxButton() {
        secondajax.click();
        return PageFactory.initElements(driver, ChapterFirstPage.class);

    }


    public ChapterFirstPage clickSecondAjaxButton1(String data1) {
        System.out.println(data1);
        return PageFactory.initElements(driver, ChapterFirstPage.class);
    }


    public ChapterFirstPage selectDropDown(String value) {
        new Select(dropdown).selectByVisibleText(value);
        return PageFactory.initElements(driver, ChapterFirstPage.class);

    }


    public ChapterFirstPage verifyButton() {
        verifybutton.click();
        return PageFactory.initElements(driver, ChapterFirstPage.class);
    }

}
