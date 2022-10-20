package com.cyde.test.day10_javafaker_driver_util;

import com.cyde.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MyOwnPractice {

    @Test
    public void test(){
        Driver.getDriver().get("env");
        Driver.getDriver().findElement(By.xpath(""));

    }
}
