package com.cyde.test.day12_actions_javascriptexecutor;

import com.cyde.utilities.BrowserUtils;
import com.cyde.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_JavascriptExecutor_Scroll {

    @Test
    public void tack7_javascriptExecutor_scroll_test(){
//        1- Open a chrome browser
//        2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get("https://practice.cydeo.com/large");

        // We have to downcasting (typecasting) to JavascriptExecutor interface
        // for using methods coming from this interface
        JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());

//        3- Scroll down to “Cydeo” link
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));

        BrowserUtils.sleep(2);

        js.executeScript("arguments[0].scrollIntoView(true)", cydeoLink);

      //  Actions actions = new Actions(Driver.getDriver());

        BrowserUtils.sleep(2);
//        4- Scroll up to “Home” link
        js.executeScript("arguments[0].scrollIntoView(true)", homeLink);

    }
}
