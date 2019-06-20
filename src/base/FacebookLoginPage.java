package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLoginPage extends BasePage{

    @FindBy(id = "email")
    WebElement inputEmail;

    @FindBy(id = "pass")
    WebElement inputPassword;

    @FindBy(xpath = "//input[@value='Log In']")
    WebElement buttonLogIn;

    public FacebookLoginPage(WebDriver iDriver) {
        super(iDriver);
    }

    public void inputEnterEmail(String userEmail){
        inputEmail.sendKeys(userEmail);
    }

    public void inputEnterPassword(String userPassword){
        inputPassword.sendKeys(userPassword);
    }

    public FacebookLoginAttemptPage btnLogInClick(){
        buttonLogIn.click();
        return new FacebookLoginAttemptPage(driver);
    }

}
