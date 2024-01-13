package com.loop.test.day7_windows;

import com.loop.test.utilities.BrowserUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import  com.loop.test.base.TestBase;

import java.util.Set;

public class T2_windows extends TestBase {
    /*
    1. Create new test and make set ups
    2. Go to : https://www.amazon.com
    3. Copy paste the lines from below into your class
    4. Create a logic to switch to the tab where Etsy.com is open
    5. Assert: Title contains “Etsy”
    Lines to be pasted:
    ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
    ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
    ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
    These lines will simply open new tabs using something called JavascriptExecutor
    and get those pages. We will learn JavascriptExecutor later as well.

     */

    @Test
    public void windowHanleTest() {
        driver.get("https://www.amazon.com");
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

//        Set<String> windowHandles = driver.getWindowHandles();
//
//        for (String window : windowHandles) {
//            driver.switchTo().window(window);
//            System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
//            if (driver.getCurrentUrl().toLowerCase().contains("google")) {
//                break;
//            }
//        }

        BrowserUtils.switchWindowAndValidate(driver, "facebook.com", "facebook");
    }

    /**
     * switches to the new window by the exact title
     * return to roiginal windiw if the window with given title not found
     * @param driver
     * @param targetTitle
     */
    public  static void switchToWindow(WebDriver driver,String targetTitle) {
            String origin = driver.getWindowHandle();
            for (String handle : driver.getWindowHandles()){
                driver.switchTo().window(handle);
                if(driver.getTitle().contains(targetTitle)){
                    return;
                }
            }
            driver.switchTo().window(origin);
    }


}
