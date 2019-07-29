package com.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotApi{
 WebDriver driver;


public void robotAPITest() throws AWTException, InterruptedException {

    System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers");
    driver = null;
    driver.manage().window().maximize();
    driver.get("http://spreadsheetpage.com/index.php/file/C35/P10");

    driver.findElement(By.linkText("animatedcolors.xmls")).click();

    Robot robot = new Robot();

    Thread.sleep(2000);
    robot.keyPress(KeyEvent.VK_DOWN);


    Thread.sleep(2000);
    for(int i = 0; i<=2; i++){
        robot.keyPress(KeyEvent.VK_TAB);
    }

    Thread.sleep(2000);
    robot.keyPress(KeyEvent.VK_ENTER);

    Thread.sleep(2000);

    driver.quit();

}


}