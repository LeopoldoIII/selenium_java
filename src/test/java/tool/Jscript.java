package tool;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Jscript {

    private WebDriver driver;
    private JavascriptExecutor js;
    String pageLoadStatus = "";


    public boolean highLigth(WebElement element) {

        js = (JavascriptExecutor) driver;
        for (int index = 0; index < 3; index++) {
            try {
                js.executeScript("arguments[0].setAttribute('style', 'background:red')", element);
                Thread.sleep(1000);
                js.executeScript("arguments[0].setAttribute('style', 'background')", element);

            } catch (Exception e) {

                System.err.println("JavaScript | Method; highLigth | Exception desc: " + e.getMessage());
                return false;
            }

        }
        return true;
    }

    public boolean scrollWindow(){

        try{
            js = (JavascriptExecutor)driver;
            //up Example (0, -250)/ down(0,250)
            js.executeScript("window.scrhollBy(0,250)");
        }catch (Exception e){
            System.err.println("JavaScript | Method; scrollWindow | Exception desc: " + e.getMessage());
            return false;
        }
     return true;
    }

    public boolean waitForPageToLoad(){
        try{
            do{
                js = (JavascriptExecutor)driver;
                pageLoadStatus = (String) js.executeScript("return document.readyState");
            }while (pageLoadStatus.equals("complete"));

        }catch(Exception e){
            System.err.println("JavaScript | Method; waitForPageToLoad | Exception desc: " + e.getMessage());
            return false;
        }
    return true;
    }
}
