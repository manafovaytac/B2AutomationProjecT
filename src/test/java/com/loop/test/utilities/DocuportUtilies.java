package com.loop.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.InputMismatchException;

public class DocuportUtilies {
    /**
     * logins to the docuport application
     *
     * @param driver     ,which initialized in test base
     * @param role,comes from docuport constants
     * @author Aytaj
     */

    public static void login(WebDriver driver, String role) throws InterruptedException {

        driver.get("https://beta.docuport.app/");
        WebElement username = driver.findElement(By.xpath("//label[.='Username or email']//following-sibling::input"));
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

        switch (role.toLowerCase()) {
            case "client":
                username.sendKeys(DocuportsConstants.USERNAME_CLIENT);
                password.sendKeys(DocuportsConstants.PASSWORD);
                break;
            case "supervisor":
                username.sendKeys(DocuportsConstants.USERNAME_SUPERVISOR);
                password.sendKeys(DocuportsConstants.PASSWORD);
                break;
            case "advisor":
                username.sendKeys(DocuportsConstants.USERNAME_ADVISOR);
                password.sendKeys(DocuportsConstants.PASSWORD);
                break;
            case "employeet":
                username.sendKeys(DocuportsConstants.USERNAME_EMPLOYEE);
                password.sendKeys(DocuportsConstants.PASSWORD);
                break;
            default:
                throw new InputMismatchException("There us not such a role: " + role);
        }
        loginButton.click();

        if (role.toLowerCase().equals("client")){
           ;
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            Thread.sleep(5000);
            WebElement cont=driver.findElement(By.xpath("//button[@type='submit']"));
            cont.click();
            Thread.sleep(5000);
        }

    }


    /**
     * logs out from the application
     * @param driver
     * @author nadir
     */
    public static void logOut(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement userIcon = driver.findElement(By.xpath("//div[@class='v-avatar primary']"));
        userIcon.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement logOut = driver.findElement(By.xpath("//span[contains(text(),'Log out')]"));
        logOut.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
}