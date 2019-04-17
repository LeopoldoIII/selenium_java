package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class script_tv {

    @Test
    public void testScriptTV(){

        WebDriver driver;

        String baseURL = "http://live.guru99.com/index.php/";
        String actualResult;
        String expectedReuslt = "$615.00";
        String chromeMacOS72 = "";
        String chromeWin = "chromedriver.exe";


        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/" + chromeWin);

        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();


        //Interaction

        driver.findElement(By.linkText("TV")).click();
        driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/button/span/span")).click();
        actualResult = driver.findElement(By.cssSelector("#shopping-cart-table>tbody>tr>td.product-cart-total>span>span")).getText();

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
