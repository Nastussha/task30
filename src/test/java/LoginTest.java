import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.NoSuchElementException;


public class LoginTest {
    private static final String URL = "https://www.tut.by/";
    private static final By LOGIN_LINK = By.className("enter");
    private static final By LOGIN = By.name("login");
    private static final By PASSWORD = By.name("password");
    private static final By LOGIN_BUTTON = By.xpath(".//input[contains(@class, 'button auth__enter')]");
    private static final By LOGGED_IN_RESULT = By.xpath(".//a[contains(@class, 'enter logedin')]");
    private WebDriver driver;

    @BeforeEach
    public void openBrowser(){
        driver = new FirefoxDriver();
        driver.get(URL);
    }

    @AfterEach
    public void closeBrowser(){
        driver.close();
    }

    @Test
    public void loginTest(){

        driver.findElement(LOGIN_LINK).click();
        driver.findElement(LOGIN).sendKeys("seleniumtests@tut.by");
        driver.findElement(PASSWORD).sendKeys("123456789zxcvbn");
        driver.findElement(LOGIN_BUTTON).click();
        Assertions.assertTrue(IsTestElementPresent(driver, LOGGED_IN_RESULT));

    }

    public boolean IsTestElementPresent(WebDriver driver, By by)
    {
        try
        {
            driver.findElement(by);
            return true;
        }
        catch (NoSuchElementException e)
        {
            return false;
        }
    }
}
