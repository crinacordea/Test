package pages;

import HelperFunctions.ManipulateLocaters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.PageObject;


public class MyCommunityPage extends PageObject {
    public MyCommunityPage(WebDriver driver) {
        super(driver);
    }
    private By mycommunityTabBy = By.xpath("//div[contains(@class,'nav-bar-left-side-items-row')]//a[normalize-space(text())='My Community']");
    private By getinvolvedButtonBy = By.xpath("//button[contains(text(),'Get involved')]");
    private By createquestmodalBy = By.id("cdk-overlay-0");
    private By activitylistfilterbyLearnandteachBy =By.xpath(" //div[@class='activity activity-list']/descendant::gop-teach-learn");
    private By filterbyLearnandteachBy =By.xpath("//div[@class='filter-items']/descendant::div[3]");

    private By engagewithcommunitymodalBy = By.xpath("//div[contains(@class, 'engage-with-community-container')]");
    private By teachaskilltabBy = By.xpath("//div[@class='mat-tab-labels']/child::div[2]");
    private By closemodalBy = By.xpath("//div[@class= 'header__close']/child::material-icons");

    public void filterByLearnAndTeach() {
        driver.findElement(filterbyLearnandteachBy).click();
    }
    ManipulateLocaters waitForElement = new ManipulateLocaters(driver);


    public void clickOnMyCommunityTab(){
        waitForElement.clickOnElement(mycommunityTabBy);

    }

    public void clickOnGetInvolvedButton(){
     waitForElement.clickOnElement(getinvolvedButtonBy);

    }


    public void clickTeachASkillTabBy()
    {
        waitForElement.waitVisibilityOfElement(engagewithcommunitymodalBy);
        waitForElement.clickOnElement(teachaskilltabBy);

    }


public void closeEngageWithCommunityModal() {

       waitForElement.clickOnElement(closemodalBy);
       waitForElement.waitInvisibilityOfElement(engagewithcommunitymodalBy);
    }
}