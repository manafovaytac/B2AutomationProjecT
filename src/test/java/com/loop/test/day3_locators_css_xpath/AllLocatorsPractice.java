package com.loop.test.day3_locators_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocatorsPractice {
    public static void main(String[] args) {

        //set up driver
        WebDriverManager.chromedriver().setup();

        //create the driver object
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to https://loopcamp.vercel.app/registration_form.html
        driver.get("https://loopcamp.vercel.app/registration_form.html");

        WebElement firstName=driver.findElement(By.name("firstname"));
        firstName.sendKeys("Loop");

        //this will return us 3 elements,and always will click the first one,that why we should pay attention to locate unique element
        WebElement lastName=driver.findElement(By.name("lastname"));
        lastName.sendKeys("Academy");







    }

}
