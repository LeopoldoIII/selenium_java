package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChapterSecondPage {

    private WebDriver driver;


    @FindBy(xpath = "//input[@name='but2']")
    WebElement but2;

    @FindBy(xpath = "//input[@id='random']")
    WebElement random;

    @FindBy(linkText = "Index")
    WebElement index;

    public ChapterSecondPage(WebDriver driver) {
            this.driver = driver;

    }


    public ChapterSecondPage clickRandom(){
        random.click();
        return PageFactory.initElements(driver, ChapterSecondPage.class);
    }

    public ChapterSecondPage clickbuton2() {
        but2.click();
        return PageFactory.initElements(driver, ChapterSecondPage.class);

    }

    public HomePage clickIndex() {
        index.click();
        return PageFactory.initElements(driver, HomePage.class);
    }

   public String getTest() {
        return index.getText();
   }

}
