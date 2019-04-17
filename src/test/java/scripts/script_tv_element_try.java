package scripts;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class script_tv_element_try {

    private static WebDriver driver;


    @Test
    public void Chorme(){

        //webdriver object driver


        //Variables

        String baseURL = "http://live.guru99.com/index.php/";
        String actualResult;
        String expectedReuslt = "$615.00";
        String chromeWin = "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/" + chromeWin);


        try {

            //Driver Path

            driver = new ChromeDriver();
            driver.get(baseURL);
            driver.manage().window().maximize();


            //Interaction

            WebElement tv = driver.findElement(By.linkText("TV"));
            tv.click();
            WebElement btn = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/button/span/span"));
            btn.click();
            WebElement shopinCard = driver.findElement(By.cssSelector("#shopping-cart-table>tbody>tr>td.product-cart-total>span>span"));
            actualResult = shopinCard.getText();

            if (actualResult.contentEquals(expectedReuslt)) {
                System.out.println();
                System.out.println("OK El resultado actual es: " + actualResult + " igual a " + expectedReuslt);
            } else {
                System.out.println();
                System.out.println("NOK el resultado actual es" + actualResult + "  igual a " + expectedReuslt);
            }


        }catch (NoSuchElementException ne) {

            ne.printStackTrace();
            ne.getMessage();


        }catch (WebDriverException we) {

            we.getMessage();

        }catch (Exception e){

            e.getMessage();

        }finally {

            driver.close();

        }

    }
}
