package com.cyde.test.day3_locators_cssSelector_xpath;

import com.cyde.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {
//        1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

//        2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

//        3- Verify “remember me” label text is as expected: Expected: Remember me on this computer
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));
        String expectedRememberLabel = "Remember me on this computer";
        String actualRememberLabel = rememberMeLabel.getText();

        if(actualRememberLabel.equals(expectedRememberLabel)){
            System.out.println("Remember me label text verification is passed!");
        }else {
            System.out.println("actualRememberLabel = " + actualRememberLabel);
            System.out.println("expectedRememberLabel = " + expectedRememberLabel);
            System.out.println("Remember me label text verification is failed!");
        }

//        4- Verify “forgot password” link text is as expected: Expected: FORGOT YOUR PASSWORD?
        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgotPasswordLink = "FORGOT YOUR PASSWORD?";
        String actualForgotPasswordLink = forgotPasswordLink.getText();

        if(actualForgotPasswordLink.equals(expectedForgotPasswordLink)){
            System.out.println("Forgot password link text verification is passed!");
        }else {
            System.out.println("actualForgotPasswordLink = " + actualForgotPasswordLink);
            System.out.println("expectedForgotPasswordLink = " + expectedForgotPasswordLink);
            System.out.println("Forgot password link text verification is failed!");
        }

//        5- Verify “forgot password” href attribute’s value contains expected:  Expected: forgot_password=yes
        String expectedInHref = "forgot_password=yes";
        String actualInHref = forgotPasswordLink.getAttribute("href");

        if(actualInHref.contains(expectedInHref)){
            System.out.println("Href attribute value verification passed!");
        }else{
            System.out.println("Href attribute value verification failed!");
        }

    }
}
