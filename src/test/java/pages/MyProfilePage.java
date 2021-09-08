package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.PageObject;


public class MyProfilePage extends PageObject {

    private By entercommentBy = By.xpath("//div//input[contains(@class, 'notification-card-input')]");
    private By editprofiledotsmenuBy = By.xpath("//div[@class='follow-edit-wrapper']");
    private By editprofilelinkBy = By.xpath( "//a[text()='Edit']");
    private By sendcommnetbuttonby = By.xpath("//div[contains(@class,'new-comment')]//a");
    private static By navigationrightbarBy  = new By.ByCssSelector("div[class^='nav-bar-right']");
    private  static By myuserBy = new By.ByCssSelector("a[class^='my-user']");

    public MyProfilePage(WebDriver driver) {
        super(driver);
    }
    /**
     * enter a comment and submit it
     */
    public void leaveComment(String ar) {
        waitUntilCommentSectionIsDisplayed();
        driver.findElement(entercommentBy).sendKeys(ar);
        driver.findElement(sendcommnetbuttonby).click();


    }

    public void clickEditButton() {
        driver.findElement(editprofiledotsmenuBy).click();
        driver.findElement(editprofilelinkBy).click();
    }


    public  Boolean  waitUntilElementIsVisible(By locater)
    {
        Boolean status = false;
        WebDriverWait webDriverWait = new WebDriverWait(driver, 5);
        try {
            WebElement element = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locater));
            status = element.isDisplayed();

        }
        catch (Exception e)
        {
            System.out.println("Wait until element is visible: Element is not  visible" + e);

        }
        return status;

    }
public void waitUntilMyProfilePageDisplayed()
{
    if (waitUntilElementIsVisible(myuserBy))
        System.out.println("Main page is loaded: My profile page is loaded");

   else
    {
        System.out.println( "Main page is not loaded yet");
    }

}

    public void waitUntilCommentSectionIsDisplayed()
    {
        if (waitUntilElementIsVisible(entercommentBy))
            System.out.println("Main page is loaded: comment section is displayed");

        else
        {
            System.out.println( "Main page is not loaded yet");
        }
    }


}
