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

    public FacebookLoginAttemptPage(WebDriver iDriver) {
        super(iDriver);
    }

    public void btnClick(){
        buttonLogIn.click();
    }

    public void inputEnterEmail(String userEmail){
        inputEmail.sendKeys(userEmail);
    }

    public void inputEnterPassword(String userPassword){
        inputPassword.sendKeys(userPassword);
    }
}
