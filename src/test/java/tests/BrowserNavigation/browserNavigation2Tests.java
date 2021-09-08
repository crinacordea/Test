package tests.BrowserNavigation;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.LogInPage;
import pages.browserNavigation;
import tests.Utils;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class browserNavigation2Tests {
    private static final WebDriver driver = new ChromeDriver();

   @Test(testName = "Open GoP")

        public static void OpenGoP() {
        driver.get(Utils.BASE_URL);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test(testName = "page info",dependsOnMethods= {"OpenGoP"})
public void test1()
        {
        browserNavigation nav= new browserNavigation(driver);
        nav.getURL();
        nav.getTitle();
        nav.getWindowHandle();

        }
    @Test(testName = "Get the window size",dependsOnMethods= {"OpenGoP"})
    public void test2()
    {
        browserNavigation nav= new browserNavigation(driver);
        nav.getWindowSize();

    }
    @Test(testName = "Resize the windw",dependsOnMethods= {"OpenGoP"})
    public void test3()
    {
        browserNavigation nav= new browserNavigation(driver);
        nav.makeFullScreen();
        int x= 1024;
        int y=768;
        nav.setScreenSize(x,y);
        nav.maximizeScreen();


    }

    @Test(testName = "Take element screenshot",dependsOnMethods= {"OpenGoP"})
    public void test4() throws IOException {
    LogInPage login= new LogInPage(driver);
    File srcfile = login.getEmail.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcfile, new File("Users/monica.cordea/desktop/image.png"));

    }

    @AfterSuite
    public static void cleanUp(){
        ///driver.manage().deleteAllCookies();
        driver.quit();


    }

}


