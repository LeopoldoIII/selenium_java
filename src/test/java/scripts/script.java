package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class script {

    // Verificación Basica

    @Test
    public void Chorme(){
        //webdriver object driver

        WebDriver driver;

        //Variables

        String baseURL = "http://newtours.demoaut.com/";
        String actualResult;
        String expectedReuslt = "Welcome: Mercury Tours";
        String macOS72 = "chromedrivermacOS72";
        String chromeWin = "chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/" + chromeWin);

        driver = new ChromeDriver();

        driver.get(baseURL);

        actualResult = driver.getTitle();

        System.out.println("###TEST###");
        System.out.println(actualResult.contentEquals(expectedReuslt)?"Prueba pasada! " + actualResult : "Prueba Fallada " + actualResult);

        driver.close();

    }
}
