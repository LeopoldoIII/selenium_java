package scripts;

import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import tool.TestBase;

public class Test extends TestBase {

    public void testPageObject() {

        homePage = PageFactory.initElements(driver, HomePage.class);

        driver.get(baseURL);

        chapterSecond = homePage.clickChapterSecond();
        chapterSecond.clickbuton2();
        chapterSecond.clickRandom();
        String data  = chapterSecond.getTest();
        homePage = chapterSecond.clickIndex();


        chapterFirstPage = homePage.clickChapterFirst();
        chapterFirstPage.clickSecondAjaxButton();



    }



}
