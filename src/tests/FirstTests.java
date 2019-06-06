package tests;

import base.BaseTest;
import base.BasePage;
import org.openqa.selenium.By;
import org.testng.annotations.*;


public class FirstTests extends BaseTest {

    @Test
    public void firstExampleTest (){

        faceBookPage.inputEnterEmail("someemail@address.com");
        faceBookPage.inputEnterPassword("password");
        faceBookPage.btnClick();

    }

    @Test
    public void secondTest(){

        faceBookPage.inputEnterEmail("someemail@address.com");
        faceBookPage.inputEnterPassword("password");
        faceBookPage.btnClick();
    }
}