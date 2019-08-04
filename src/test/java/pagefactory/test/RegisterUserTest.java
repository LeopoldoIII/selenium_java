package pagefactory.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom.pages.HomePage;
import pom.pages.RegisterPage;

import java.util.concurrent.TimeUnit;

public class RegisterUserTest {
    WebDriver driver;
    String expectedResult = null;
    String actualResult = null;
    String webDriver = "chromedrivermacos";
    String baseURL = "http://newtours.deoaut.com/";
    HomePage objHome;
    RegisterPage objRegister;

    @BeforeTest
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//driver//" + webDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);
    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }

    //Home Page
    @Test(priority = 0)
    public void goToRegisterPage() {
        objHome = new HomePage(driver);
        objHome.clickRegisterLInk();

        expectedResult = "Register: Mercury Tours";
        actualResult = objHome.getHomePageTitle();
        Assert.assertEquals(actualResult, expectedResult);

    }

    //Register Page
    @Test(priority = 1)
    public void registerAnUser() {
        objRegister = new RegisterPage(driver);
        objRegister.setFirstName("Name");
        objRegister.selectCountry("MEXICO");
        objRegister.submituserInformation("correo@gmail.com", "123");

        WebElement textSuccess = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]"));
        System.out.println("Test passed! : " + textSuccess);


    }

}
