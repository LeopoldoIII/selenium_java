package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LogsTest {

    WebDriver driver;
    String baseURL = "https://healthunify.com/bmicalculator/";

    @Test
    public void launchBrowser() {

        try {

            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedrivermacOS72");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(baseURL);
        } catch (WebDriverException we) {
        } catch (Exception e) {

        }
    }

    @Test(dependsOnMethods = {"BMICalculator"})
    public void tearDown() {
        driver.quit();
    }

    @Test(dependsOnMethods = "launchBrowser")
    public void BMICalculator() {
        try {
            driver.findElement(By.name("wg")).sendKeys("87");

            new Select(driver.findElement(By.name("optl"))).selectByVisibleText("Kilograms");
            driver.findElement(By.name("opt2")).sendKeys("5");
            driver.findElement(By.name("opt3")).sendKeys("10");
            driver.findElement(By.name("cc")).click();

            String SIunit = driver.findElement(By.name("si")).getAttribute("value");
            String USunit = driver.findElement(By.name("us")).getAttribute("value");
            String UKunit = driver.findElement(By.name("uk")).getAttribute("value");
            String noete = driver.findElement(By.name("desc")).getAttribute("value");

        } catch (NoSuchElementException ne) {

        } catch (WebDriverException we) {
        } catch (Exception ex) {
        }

    }
}
