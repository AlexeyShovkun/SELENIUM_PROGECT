package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Admin on 06.11.2016.
 */
public class MainPageNascar {

    private WebDriver driver;  /*SUPER*WEBDRIVER*/

    private By pageHeader = By.id("pageHeader");
    private By buttonLOGIN = By.xpath(".//*[@id='registerOrLogin']/a[text()='LOGIN']");//*[@id="registerOrLogin"]/a[1]
    private By buttonREGISTER = By.xpath(".//*[@id='registerOrLogin']/a[text()='REGISTER']");
    private By buttonMYPROFILE = By.xpath(".//a[@id='myProfileLink']");//*[@id="myProfileLink"]
    private By fieldEmailInLoginForm = By.xpath(".//input[@name='username' and @type='text']");
    private By fieldPasswordInLoginForm = By.xpath(".//input[@name='password' and @type='password']");
    private By buttonSubmitInLoginForm = By.xpath(".//input[@value='Submit' and @type='submit']");
    private By errorMessage = By.xpath(".//div[text()='Invalid login or password']");
    private By fieldEmailRegistration =  By.xpath("//*[@id=\"gigya-register-screen\"]/form/div[3]/div[1]/div[1]/div/input");
    private By fieldPasswordRegistration = By.xpath("//*[@id=\"gigya-register-screen\"]/form/div[3]/div[1]/div[2]/div/input");
    private By fieldZipCodeRegistration = By.xpath("//*[@id=\"gigya-register-screen\"]/form/div[3]/div[1]/div[3]/div/input");
    private By receiveEmailConfirmationCheckBox = By.xpath("//*[@id=\"gigya-register-screen\"]/form/div[3]/div[1]/div[4]/div[1]/input[1]");
    private By privacyPolicyConfirmationCheckBox = By.xpath("//*[@id=\"gigya-register-screen\"]/form/div[3]/div[1]/div[4]/div[2]/input");
    private By buttonSubmitInRegisterForm = By.xpath("//*[@id=\"gigya-register-screen\"]/form/div[3]/div[1]/div[5]/div[1]/div/input");

    private By buttonLOGOUT = By.xpath(".//*[@value='Logout' and @type='button']/a[text()='Logout']");







    public MainPageNascar(WebDriver driver){
        this.driver=driver;
    }  /*DRIVER KONSTRUKTOR THE DRIVER*/


    public void callLoginForm(){
        driver.findElement(buttonLOGIN).click();
    }
    public void clickRegistrationButton(){
        driver.findElement(buttonREGISTER).click();
    }
    public void clickMyProfileButton(){
        driver.findElement(buttonMYPROFILE).click();
    }
    public void setEmailIntoEmailFieldInLoginForm(String text){driver.findElement(fieldEmailInLoginForm).sendKeys(text);}
    public void setFieldEmailInRegistrationForm(String text){driver.findElement(fieldEmailRegistration).sendKeys(text);}
    public void setPasswordIntoPasswordFieldInLoginForm(String text){driver.findElement(fieldPasswordInLoginForm).sendKeys(text);}
    public void setPasswordIntoPasswordFieldInRegisterForm(String text){driver.findElement(fieldPasswordRegistration).sendKeys(text);}
    public void setZipCodeIntoZipCodeFieldInRegisterForm (String text){driver.findElement(fieldZipCodeRegistration).sendKeys(text);}
    public void submitLoginForm(){driver.findElement(buttonSubmitInLoginForm).click();    }
    public void clickButtonSubmitInRegisterForm(){ driver.findElement(buttonSubmitInRegisterForm).click();}
    public boolean errorIsShow(){return driver.findElement(errorMessage).isEnabled();}
    public void clickLogOutButtonOnMyProfilePage(){ driver.findElement(buttonLOGOUT).click();}




    public void checkReceiveEmailConfirmationCheckBox(){
        driver.findElement(receiveEmailConfirmationCheckBox).click();
    }
    public void checPprivacyPolicyConfirmationCheckBox(){
        driver.findElement(privacyPolicyConfirmationCheckBox).click();
    }

    /*MY TESTS*/


}
