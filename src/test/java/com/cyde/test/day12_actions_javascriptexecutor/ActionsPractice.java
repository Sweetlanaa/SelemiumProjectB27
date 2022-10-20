package com.cyde.test.day12_actions_javascriptexecutor;

import com.cyde.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractice {

    @Test
    public void task_4_and_5_test(){

        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

        Actions actions = new Actions(Driver.getDriver());

        //4- Scroll using Actions class “moveTo(element)” method
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        actions.moveToElement(cydeoLink).perform();

//        2- Scroll back up to “Home” link using PageUP button
      //  actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();
        actions.moveToElement(Driver.getDriver().findElement(By.linkText("Home"))).perform();

        Driver.closeDriver();
    }
}

