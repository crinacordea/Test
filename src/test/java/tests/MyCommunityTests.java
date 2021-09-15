package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObject.PageObject;
import pages.LogInPage;
import pages.MyCommunityPage;

import javax.annotation.RegEx;
import java.awt.color.ICC_ColorSpace;
import java.util.concurrent.TimeUnit;

public class MyCommunityTests {
    private  WebDriver driver = new ChromeDriver();
    MyCommunityPage mycomm = new MyCommunityPage(driver);



    @BeforeSuite()
    public  void LogIn() {
        // ChromeDriver location set up in Utils class

        ///System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        driver.get("https://test.gameofpods.com/login");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        LogInPage logIn = new LogInPage(driver);
        logIn.LogIn(Utils.username, Utils.password);
        /*
         * navigate to My commynity page
         */
        mycomm.clickOnMyCommunityTab();

    }


  /*  @Test()
    public void showInterestInSkills()
    {
        mycomm.filterByLearnAndTeach();
        Assert.assertEquals(mycomm.checkActivityListLoaded(),true );

    }*/

    //Open Engage with the community and click on Teach a skill tab
    // Close the modal
    @Test
    public void test1()
    {
        //MyCommunityTests mycomm2 = new MyCommunityTests(driver);
        mycomm.clickOnGetInvolvedButton();
        mycomm.clickTeachASkillTabBy();
        mycomm.closeEngageWithCommunityModal();

    }



    @AfterSuite
    public  void cleanUp(){
        ///driver.manage().deleteAllCookies();
       driver.quit();
        System.out.println( "version b");

    }

}
