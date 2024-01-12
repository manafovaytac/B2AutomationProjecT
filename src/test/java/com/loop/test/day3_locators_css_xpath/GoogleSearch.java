package com.loop.test.day3_locators_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    /**
     * Navigate to Google search
     * maximize the page
     * get title of the page
     * validate the title,expected url is "Google"
     * validate the url of the page,expected url is "https://www.google.com/"
     * close the browser
     */

    public static void main(String[] args) {
        //set up the driver
        WebDriverManager.chromedriver().setup();

        //create driver object
        //interface            class
        WebDriver driver=new ChromeDriver();

        //navigate to Google
        driver.get("https://www.google.com/");

        //maximaze the window
        driver.manage().window().maximize();

        String expectedTitle= "Google";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Actual title: " +actualTitle + ", matches expected title: "+ expectedTitle + ", => TEST PASS");
        }else {
            System.err.println("Actual title: " +actualTitle + "DOES NOT match expected title: "+expectedTitle+ ", => TEST FAIL");
        }

        String expectedURL= "https://www.google.com/";
        String actualURL=driver.getCurrentUrl();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Actual URL: " +actualURL + ", matches expected URL: "+ expectedURL + ", => TEST PASS");
        }else {
            System.err.println("Actual URL: " +actualURL + "DOES NOT match expected URL: "+expectedURL+ ", => TEST FAIL");
        }


        //driver.quit();
    }

}
