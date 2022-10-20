package com.cyde.test.day7_windows_webtables;

import com.cyde.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_MultipleWindows {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(" https://practice.cydeo.com/windows");
    }

    @Test
    public void multiple_windows_test (){
//        3. Assert: Title is “Windows”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";

        Assert.assertEquals(actualTitle, expectedTitle);

//        4. Click to: “Click Here” link
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();


//        5. Click to: “CYDEO” link


//        6. Switch to Cydeo page.


//        7. Assert: Title is “Cydeo”



    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
