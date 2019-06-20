package base;

import org.openqa.selenium.WebDriver;

public class BasePage extends BaseTest{

    public WebDriver driver;

    public BasePage(WebDriver iDriver){
        this.driver = iDriver;
    }

}
