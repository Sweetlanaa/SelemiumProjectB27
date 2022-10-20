package com.cyde.test.day5_testesNG_dropdown;

import com.cyde.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T1_RadioButton {
    public static void main(String[] args) throws InterruptedException {
        //    1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//    2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

//    3. Click to “Hockey” radio button
        WebElement hockeyButton = driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyButton.click();

//    4. Verify “Hockey” radio button is selected after clicking.
        if (hockeyButton.isSelected()) {
            System.out.println("Hockey button is Selected!");
        } else {
            System.out.println("Hockey button is not Selected!");
        }

        List<WebElement> sportRadioButtons = driver.findElements(By.xpath("//input[@name='sport']"));

        for (WebElement eachSport : sportRadioButtons) {
            eachSport.click();
            if(eachSport.isSelected()){
                System.out.println(eachSport.getAttribute("id") + " Radio button is Selected!");
            }
            Thread.sleep(3000);
        }
    }
}


