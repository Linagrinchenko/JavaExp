package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

/**
 * Created by lhrynchenko on 14.04.2015.
 */
public class Page {
    protected WebDriver driver;
    protected String baseUrl;

    public Page (WebDriver driver, String baseUrl) {
        this.driver = driver;
        this.baseUrl = baseUrl;
    }


    public void type(By by, String textToType) {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(textToType);
    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
