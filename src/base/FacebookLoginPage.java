package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLoginPage extends BasePage {

    @FindBy(id = "email")
    WebElement inputEmail;

    @FindBy(id = "pass")
    WebElement inputPassword;

    @FindBy(xpath = "//input[@value='Log In']")
    WebElement buttonLogIn;

    public FacebookLoginPage(WebDriver iDriver) {
        super(iDriver);
    }

    public FacebookHomePage clickLogInBtnSuccess(){
        webElement = buttonLogIn;
        clickButton();
        return initFacebookHomePage();
    }

    public FacebookLoginAttemptPage clickLogInBtnFail(){
        webElement = buttonLogIn;
        clickButton();
        return initFacebookLoginAttemptPage();
    }

    public void enterEmail(String userEmail){
        webElement = inputEmail;
        enterText(userEmail);
    }

    public void enterPassword(String userPassword){
        webElement = inputPassword;
        enterText(userPassword);
    }

}
