package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import tool.Jscript;

public class script_tv_element {

    Jscript jscript = new Jscript();

    @Test
    public void Chorme(){
        //webdriver object driver

        WebDriver driver;
        Jscript jscript = new Jscript();

        //Variables

        String baseURL = "http://live.guru99.com/index.php/";
        String actualResult;
        String expectedReuslt = "$615.00";
        String chromeMacOS72 = "";
        String chromeWin = "chromedriver.exe";


        //Driver Path

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/" + chromeWin);

        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();


        //Interaction

        WebElement  lnktv = driver.findElement(By.linkText("TV"));
        jscript.highLigth(lnktv);
        lnktv.click();
        WebElement btnAddToCart = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/button/span/span"));
        btnAddToCart.click();



    }
}
