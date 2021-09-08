package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.CommonElementsInPage;
import pages.LogInPage;
import pages.MembersPage;
import pages.MyProfilePage;

import java.util.concurrent.TimeUnit;

public class MyProfileTests {
    private static final WebDriver driver = new ChromeDriver();


    @BeforeSuite()
    public  void LogIn() {
        // ChromeDriver location set up in Utils class

        ///System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        driver.get("https://test.gameofpods.com/login");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        LogInPage logIn = new LogInPage(driver);
       logIn.LogIn(Utils.username, Utils.password);

    }


   @Test()
    public  void leaveComment()
    {
        final String comment = "Here is my comment test";
        MyProfilePage myprofile = new MyProfilePage(driver);
        myprofile.waitUntilMyProfilePageDisplayed();
        myprofile.leaveComment(comment);
    }


    @AfterSuite
    public  void cleanUp(){
        ///driver.manage().deleteAllCookies();
      driver.quit();

    }

}
