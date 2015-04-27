package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

/**
 * Created by lhrynchenko on 14.04.2015.
 *
 */
public class LoginPage extends Page{

    public static int stat = 234;

    public LoginPage(WebDriver driver, String baseUrl) {
        super(driver, baseUrl);

    }

    public static void staticmethod() {
        System.out.println("i am static");
    }

    public void open() {
        driver.get(baseUrl + "/uk/account-unverified/login");
    }

    public void doLogin(String emailToLogin, String password) {
        type(By.id("email"), emailToLogin);
        type(By.id("password"), password);

        clickLoginButton();
    }

    public void clickLoginButton() {

        driver.findElement(By.cssSelector(".logInModule  .btn")).click();
    }



    public boolean isUserWelcomeMessagePresent() {
        return isElementPresent(By.cssSelector(".hello"));
    }

    public boolean isLoginErrorMessagePresent() {
        return isElementPresent(By.cssSelector(".msgBoxHeader"));
    }
}
