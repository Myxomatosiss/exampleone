package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;


public class FirstTests {
    private WebDriver driver = null;
    private ChromeOptions chromeOptions = null;

    @FindBy(id = "email")
    WebElement inputEmail;

    @FindBy(id = "pass")
    WebElement inputPassword;

    @FindBy(xpath = "//input[@value='Log In']")
    WebElement buttonLogIn;

    @Test
    public void firstExampleTest (){

        System.setProperty("webdriver.chrome.driver","/Users/macbook/Documents/Repo Automation/exampleone/src/resources/chromedriver");

        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);

        driver.navigate().to("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("someemail@address.com");

        driver.findElement(By.id("pass")).sendKeys("password");

        driver.findElement(By.xpath("//input[@value='Log In']")).click();

        //driver.quit();
    }
}
