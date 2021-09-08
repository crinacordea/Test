package pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import pageObject.PageObject;

public class browserNavigation extends PageObject {
    public browserNavigation(WebDriver driver) {
        super(driver);
    }

    public void getURL() {
        System.out.println("url is:" + driver.getCurrentUrl());
    }

    public void getTitle() {
        System.out.println("title is:" + driver.getTitle());
    }

    public void getWindowHandle() {
        System.out.println("window handler" + driver.getWindowHandle());
    }

    public void getWindowSize() {
        int width = driver.manage().window().getSize().getWidth();
        int height = driver.manage().window().getSize().getHeight();
        System.out.println("Window width is:" + width + "Window height is:" + height);
    }

    public void makeFullScreen() {
        driver.manage().window().fullscreen();
        System.out.println("Now is full screen");
    }

    public void setScreenSize(int x, int y) {
        driver.manage().window().setSize(new Dimension(x, y));
        System.out.println("Screen size is " + x + "and" + y);
    }

    public void maximizeScreen() {
        driver.manage().window().maximize();
        System.out.println("Screen is maximized");
    }


}
