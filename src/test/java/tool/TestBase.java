package tool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.ChapterFirstPage;
import pages.ChapterSecondPage;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;
    protected String baseURL;
    protected HomePage homePage;
    protected ChapterFirstPage chapterFirstPage;
    protected ChapterSecondPage chapterSecond;


    public void setUp() {
        baseURL = "http://book.theautomatedtester.co.uk/";
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void tearDown() {

        driver.quit();
    }

}
