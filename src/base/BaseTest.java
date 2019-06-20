package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import static base.Settings.*;

public class BaseTest {

    public WebDriver driver = null;
    public ChromeOptions chromeOptions = null;


    @BeforeSuite
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", RESOURCES + CHROMEDRIVER);

        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);

        driver.navigate().to(BASE_URL);
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }

    //@BeforeMethod
    //public void navigateToBaseUrl(){
      //  driver.navigate().to(BASE_URL);
    //}

    public FacebookLoginPage initFacebookLoginPage (){
        return PageFactory.initElements(driver, FacebookLoginPage.class);
    }

    public FacebookLoginAttemptPage initFacebookLoginAttemptPage (){
        return PageFactory.initElements(driver, FacebookLoginAttemptPage.class);
    }

}
