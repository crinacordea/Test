package pages;

import HelperFunctions.ManipulateLocaters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.PageObject;


public class MembersPage extends PageObject {


    private By membersTabBy = By.xpath("//div[contains(@class,'nav-bar-left-side-items-row')]//a[normalize-space(text())='Members']");


    public MembersPage(WebDriver driver) {
        super(driver);
    }
    ManipulateLocaters waitelement  = new ManipulateLocaters(driver);
    public void selectMembersTab(){
        waitelement.clickOnElement(membersTabBy);
    }


    }

