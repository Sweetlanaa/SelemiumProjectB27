package com.cyde.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        // 1. set up web driver manager
        WebDriverManager.chromedriver().setup();

        // 2. opening an empty browser with creating instance driver
        WebDriver driver = new ChromeDriver();
        // Session id = 72ABYHUKH86

        // making window full screen/ maximizing
        driver.manage().window().maximize();

        // 3. go to "https://www.tesla.com"
        // driver.get("https://www.tesla.com");

        driver.navigate().to("https://www.tesla.com");


        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        String CurrentUrl = driver.getCurrentUrl();
        System.out.println("CurrentUrl = " + CurrentUrl);

        // stops execution of code for 3 sec.
        Thread.sleep(3000);

        // navigate().back() method will take previous page
        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();

        driver.navigate().to("https://www.google.com");
        //System.out.println("driver.getTitle() = " + driver.getTitle());
        currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        CurrentUrl = driver.getCurrentUrl();
        System.out.println("CurrentUrl = " + CurrentUrl);
       

        // close() method will close current opened page
        driver.close();

        // quit() method will close all opened pages
        //driver.quit();

    }
}
