package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.MainPageNascar;

import java.util.concurrent.TimeUnit; //CONCIRENT TIME UNIT

/**
 * Created by Admin on 06.11.2016.
 main class
 */
public class TestNascarMainPage {
    private WebDriver driver;       /*WEBDRIVER OBJECT*/
    private String URL = "http://www.nascar.com/";

    @BeforeSuite
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\DEV_PROJECTS\\java\\seltests\\NascarPageObjectExampleJava-master\\src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to(URL); /*OPEN SITE*/
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void verifyLoginAsIncorrectUser(){
        MainPageNascar page = new MainPageNascar(driver);
        page.callLoginForm();
        page.setEmailIntoEmailFieldInLoginForm("Test1");
        page.setPasswordIntoPasswordFieldInLoginForm("P@ssw0rd");
        page.submitLoginForm();
        Assert.assertTrue(page.errorIsShow());// AR and ER
    }
    @Test
    public void  VerifyRegisterPage() {
        MainPageNascar page1 = new MainPageNascar(driver);
        page1.clickRegistrationButton();
        page1.setFieldEmailInRegistrationForm("rikvizdikciya17@gmail.com"); /*Пока перед каждым запуском изменяем вручную*/
        page1.setPasswordIntoPasswordFieldInRegisterForm("ad7672192");
        page1.setZipCodeIntoZipCodeFieldInRegisterForm("08000");
        page1.checkReceiveEmailConfirmationCheckBox();
        page1.checPprivacyPolicyConfirmationCheckBox();
        driver.navigate().to("http://www.nascar.com/en_us/ajax/dynamic/myNASCAR.html"); /*OPEN TWICE*/
        page1.clickLogOutButtonOnMyProfilePage();
        Assert.assertTrue(page1.errorIsShow());

    }


}
