package pages;

import HelperFunctions.ManipulateLocaters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.PageObject;


public class LogInPage extends PageObject {

    private final String Email = "monica.cordea@softvision.com";
    private final String Password = "Testing11";
    private By emailBy = By.id("username");
    private By passwordBy = By.id("password");
    private By loginBy= By.id("kc-login");
    private By loadingbackgroundimageBy = By.xpath("div[@class='spinner-container']");

    //background ng-start-inserted
    ManipulateLocaters waitelement = new ManipulateLocaters(driver);
    public LogInPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getEmail = driver.findElement(emailBy);

    public  void enterEmail(String Email){
        waitelement.waitVisibilityOfElement(emailBy);
        driver.findElement(emailBy).sendKeys(Email);
    }

    public   void enterPassword(String Password){

        waitelement.waitVisibilityOfElement(passwordBy);
        driver.findElement(passwordBy).sendKeys(Password);
    }

    public  void pressLogInButton(){
       waitelement.clickOnElement(loginBy);
    }
    /**
     * Login as valid user
     *
     * @param username
     * @param password
     */


     public  void LogIn(String username, String password){
          enterEmail(username);
          enterPassword(password);
          pressLogInButton();
          waitelement.waitInvisibilityOfElement(loadingbackgroundimageBy);
    }





    }




