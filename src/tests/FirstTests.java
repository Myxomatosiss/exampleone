package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class FirstTests {
    private WebDriver driver = null;
    private ChromeOptions chromeOptions = null;

    @Test
    public void firstExampleTest (){

        System.setProperty("webdriver.chrome.driver","/Users/macbook/Documents/Repo Automation/exampleone/src/resources/chromedriver");

        chromeOptions = new ChromeOptions();

        driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://www.google.com");

        driver.quit();

    }
}
