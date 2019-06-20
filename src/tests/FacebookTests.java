package tests;

import base.BaseTest;
import base.FacebookLoginAttemptPage;
import base.FacebookLoginPage;
import org.testng.annotations.Test;


public class FacebookTests extends BaseTest {

    private FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
    private FacebookLoginAttemptPage facebookLoginAttemptPage = null;

    @Test
    public void loginFail (){
        facebookLoginPage = initFacebookLoginPage();
        facebookLoginPage.inputEnterEmail("someemail@address.com");
        facebookLoginPage.inputEnterPassword("password");

        facebookLoginAttemptPage = facebookLoginPage.btnLogInClick();
    }

    @Test
    public void secondTest(){
        facebookLoginAttemptPage = initFacebookLoginAttemptPage();
        facebookLoginAttemptPage.inputEnterEmail("someemail@address.com");
        facebookLoginAttemptPage.inputEnterPassword("password");

        facebookLoginAttemptPage.btnClick();
    }
}