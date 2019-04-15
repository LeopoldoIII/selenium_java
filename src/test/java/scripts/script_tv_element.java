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

        //Variables

        String baseURL = "http://live.guru99.com/index.php/";
        String actualResult;
        String expectedReuslt = "$615.00";
        String chromePathmacOS72 = System.getProperty("user.dir") + "/driver/chromedrivermacOS72";


        //Driver Path

        System.setProperty("webdriver.chrome.driver", chromePathmacOS72);
        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();

        
        //Interaction

        WebElement  tv = driver.findElement(By.linkText("TV"));
        tv.click();
        WebElement elemento = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/button/span/span"));
        elemento.click();
        WebElement shopinCard = driver.findElement(By.cssSelector("#shopping-cart-table>tbody>tr>td.product-cart-total>span>span"));
        actualResult =  shopinCard.getText();

        if(actualResult.contentEquals(expectedReuslt)){
            System.out.println();
            System.out.println("OK El resultado actual es: " + actualResult + " igual a " + expectedReuslt);
        }else {
            System.out.println();
            System.out.println("NOK el resultado actual es" + actualResult + "  igual a " + expectedReuslt);
        }

        driver.close();

    }
}
