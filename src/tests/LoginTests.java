import PageObjects.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertTrue;

public class LoginTests {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        baseUrl = "http://www.hotwire.com/";
    }

    @Test
    public void successLogin() {
        driver.get(baseUrl);
        LoginPage loginPage = new LoginPage(driver, baseUrl);
        loginPage.open();

        loginPage.doLogin("testhotwireemail@gmail.com", "123456");

        assertTrue(loginPage.isUserWelcomeMessagePresent());
    }

    @Test
    public void testLogin() {
        driver.get(baseUrl);
        LoginPage loginPage = new LoginPage(driver, baseUrl);
        loginPage.open();
        loginPage.doLogin("testhotwireemail@gmail.com", "12345");
        assertTrue(loginPage.isLoginErrorMessagePresent());
        loginPage.doLogin("testhotwireemail@gmail.com", "123456");
        assertTrue(loginPage.isUserWelcomeMessagePresent());
    }

    @After
    public void tearDown() {
        driver.quit();
    }


}
