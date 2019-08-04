package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By lnkRegister = By.linkText("Register");

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }


    public void clickRegisterLInk() {

        driver.findElement(lnkRegister).click();

    }


    public String getHomePageTitle() {
        return driver.getTitle();
    }

}
