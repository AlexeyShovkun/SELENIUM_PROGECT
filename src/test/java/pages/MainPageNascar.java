package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Admin on 06.11.2016.
 */
public class MainPageNascar {

    private WebDriver driver;

    private By pageHeader = By.id("pageHeader");
    private By buttonLOGIN = By.xpath(".//*[@id='registerOrLogin']/a[text()='LOGIN']");
    private By buttonREGISTER = By.xpath(".//*[@id='registerOrLogin']/a[text()='REGISTER']");
    private By fieldEmailInLoginForm = By.xpath(".//input[@name='username' and @type='text']");
    private By fieldPasswordInLoginForm = By.xpath(".//input[@name='password' and @type='password']");
    private By buttonSubmitInLoginForm = By.xpath(".//input[@type='submit']");
    private By errorMessage = By.xpath(".//div[text()='Invalid login or password']");
    private By fieldEmailRegistration =  By.xpath(".//*[@placeholder='Email Address']");
    private By fieldPasswordRegistration = By.xpath(".//*[@name='password' and @placeholder='Password']");
    private By fieldZipCodeRegistration = By.xpath(".//*[@name='zip' and @placeholder='ZIP Code']");
    private By receiveEmailConfirmationCheckBox = By.xpath(".//*[@name='data.newsLetterSub' and @type='checkbox']");
    private By privacyPolicyConfirmationCheckBox = By.xpath(".//*[@name='data.terms' and @type='checkbox']");
    private By submitRegistrationButton = By.xpath(".//*[@value='SUBMIT' and @type='submit']");


    public MainPageNascar(WebDriver driver){
        this.driver=driver;
    }


    public void callLoginForm(){
        driver.findElement(buttonLOGIN).click();
    }

    public void setEmailIntoEmailFieldInLoginForm(String text){
        driver.findElement(fieldEmailInLoginForm).sendKeys(text);
    }

    public void setPasswordIntoPasswordFieldInLoginForm(String text){
        driver.findElement(fieldPasswordInLoginForm).sendKeys(text);
    }

    public void submitLoginForm(){
        driver.findElement(buttonSubmitInLoginForm).click();
    }

    public boolean errorIsShow(){
        return driver.findElement(errorMessage).isEnabled();
    }

    public void clickRegistrationButton(){
        driver.findElement(buttonREGISTER).click();
    }

}
