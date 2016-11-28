package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.MainPageNascar;

import java.util.concurrent.TimeUnit;

/**
 * Created by Admin on 06.11.2016.
 */
public class TestNascarMainPage {
    private WebDriver driver;
    private String URL = "http://www.nascar.com/";

    @BeforeSuite
    public void setup(){
        driver = new ChromeDriver();
        driver.navigate().to(URL);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    @Test
    public void verifyLoginAsIncorrectUser(){
        MainPageNascar page = new MainPageNascar(driver);
        page.callLoginForm();
        page.setEmailIntoEmailFieldInLoginForm("Test1");
        page.setPasswordIntoPasswordFieldInLoginForm("P@ssw0rd");
        page.submitLoginForm();
    }


}
