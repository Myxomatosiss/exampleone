package tests;

import base.BaseTest;
import base.FacebookHomePage;
import base.FacebookLoginAttemptPage;
import org.testng.annotations.Test;


public class FacebookTests extends BaseTest {

    private FacebookLoginAttemptPage facebookLoginAttemptPage;
    private FacebookHomePage facebookHomePage;

    String userEmail = "emailemail@address.com";
    String userPass = "pass";

    @Test
    public void loginFail (){

        facebookLoginPage.enterEmail(userEmail);
        facebookLoginPage.enterPassword(userPass);
        facebookLoginAttemptPage = facebookLoginPage.clickLogInBtnFail();

        facebookLoginAttemptPage.enterEmail(userEmail);
        facebookLoginAttemptPage.enterPassword(userPass);
        facebookLoginAttemptPage.clickLogInBtnFail();

        assert facebookLoginAttemptPage.isWrongCredentialsAlertDisplayed();

    }

  //  @Test
   // public void secondTest(){
   //     facebookLoginAttemptPage = initFacebookLoginAttemptPage();
   //     facebookLoginAttemptPage.inputEnterEmail("someemail@address.com");
   //     facebookLoginAttemptPage.inputEnterPassword("password");
//
   //     facebookLoginAttemptPage.btnClick();
  //  }
}