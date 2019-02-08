package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class script_tv {

    @Test
    public void Chorme(){
        //webdriver object driver

        WebDriver driver;

        //Variables

        String baseURL = "http://live.guru99.com/index.php/";
        String actualResult;
        String expectedReuslt = "$615.00";
        String chromePath = System.getProperty("user.dir" + "\\driver\\chromedriver.exe");

        //Driver Path

        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();


        //Interaction

        driver.findElement(By.linkText("TV")).click();






    }
}
