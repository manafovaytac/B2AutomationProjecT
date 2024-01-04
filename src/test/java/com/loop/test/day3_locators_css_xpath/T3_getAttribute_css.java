package com.loop.test.day3_locators_css_xpath;

import com.loop.test.utilities.DocuportsConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_css {
    public static void main(String[] args) {
        /*
         * go to docuport application
         * identify docuport with css
         * get value of the attribute
         * Validate if  it is "Docuport"
         */

        //go to URl

        WebDriver driver= WebDriverFactory.getDriver("Chtome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app/login?redirect=%2F");

        //identify logo with css
        WebElement logo=driver.findElement(By.cssSelector("img[src='img/logo.d7557277.svg']"));
        String docuport=logo.getAttribute("alt");

        if (DocuportsConstants.LOGO_DOCUPORT.equalsIgnoreCase(docuport)){
            System.out.println("Expected logo text : "+DocuportsConstants.LOGO_DOCUPORT+",matches actual logo text: "+docuport);
        }else {
            System.out.println("Expected logo text : "+DocuportsConstants.LOGO_DOCUPORT+",DOES NOT match actual logo text : "+docuport);
        }


        //locate username with css
        //locate password with us
        //locate login with css
        //login to docuport
        //locate home icon of docuport after login or any element
    }
}

