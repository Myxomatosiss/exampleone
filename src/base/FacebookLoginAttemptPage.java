package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLoginAttemptPage extends BasePage {

    @FindBy(id = "email")
    WebElement inputEmail;

    @FindBy(id = "pass")
    WebElement inputPassword;

    @FindBy(id = "loginbutton")
    WebElement buttonLogIn;

    @FindBy(xpath = "//div[@role='alert' and text()='The email or phone number you’ve entered doesn’t match any account. ']")
    public WebElement wrongCredentialsAlert;

    public FacebookLoginAttemptPage(WebDriver iDriver) {
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

    public boolean isWrongCredentialsAlertDisplayed(){
        webElement = wrongCredentialsAlert;
        return isElementDislplayed();
    }

    public void enterEmail(String userEmail){
        webElement = inputEmail;
        enterText(userEmail);
    }

    public void enterPassword(String userPass){
        webElement = inputPassword;
        enterText(userPass);
    }

}
