package com.cyde.my_own_practice;

import com.cyde.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_dont_click_button {
    public static void main(String[] args) {
        // 1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
//        2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons");

//        3. Click on Button 1
        WebElement dontClickBtn = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        dontClickBtn.click();


//        4. Verify text displayed is as expected:  Expected: “Clicked on button one!”
        WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
        String actualDontClickBtnResult = result.getText();
        String expectedDontClickBtnResult = "Clicked on button one!";

        System.out.println(actualDontClickBtnResult);

       if(actualDontClickBtnResult.equals(expectedDontClickBtnResult)){
           System.out.println("Button 1 click button text test passed!");
       }else {
           System.out.println("Button 1 click button text test failed!");
       }
    }
}
