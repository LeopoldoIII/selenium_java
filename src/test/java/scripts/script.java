package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class script {

    @Test
    public void Chorme(){
        //webdriver object driver

        WebDriver driver;

        //Variables

        String baseURL = "http://live.guru99.com/index.php/";
        String actualResult;
        String expectedReuslt = "Welcome: Mercury Tour";
        String macOS72 = "chromedrivermacOS72";

        //Driver Path

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/" + macOS72);


        //Test

        driver = new ChromeDriver();


        //Interation
        driver.get(baseURL);

        actualResult = driver.getTitle();

        System.out.println();
        System.out.println(actualResult.contentEquals(expectedReuslt)?"Prueba pasada! " + actualResult : "Prueba Fallada " + actualResult);

        driver.close();



    }
}
