package HelperFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.PageObject;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class ManipulateLocaters extends PageObject {

    public ManipulateLocaters(WebDriver driver) {
        super(driver);
    }
     public   WebDriverWait waitelement = new WebDriverWait(driver, 5, 500 );


    public  boolean isElementDisplayed(By locater){

       WebElement element = null;
        try
        {
             element = waitelement.until(ExpectedConditions.visibilityOfElementLocated(locater));
        }

        catch(Exception e) {

            return false;
        }
       return true;
    }

    public  void clickOnElement(By locater)
    {
            WebElement element = waitelement.until(ExpectedConditions.elementToBeClickable(locater));
            driver.findElement(locater).click();
    }

    public void waitVisibilityOfElement(By locater)
    {
        WebElement element = waitelement.until(ExpectedConditions.visibilityOfElementLocated(locater));

    }

    public void waitInvisibilityOfElement(By locater)
    {
        boolean status =  waitelement.until(ExpectedConditions.invisibilityOfElementLocated(locater));

        System.out.println( "Is element"+" " + locater + " " +"invisible? " +" " + status);
    }

    public void waitListDisplayed(By locater, Integer nr){

        WebDriverWait waitForLoadingList = new WebDriverWait(driver,1 );
        Boolean status= true;
        waitForLoadingList.until(ExpectedConditions.numberOfElementsToBeMoreThan(locater, 1));

    }


}
