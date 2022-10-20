package com.cyde.test.day8_webtable_utilities;

import com.cyde.test.base.TestBase;
import com.cyde.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Webtable_Practice extends TestBase {

//    WebDriver driver;
//
//    @BeforeMethod
//    public void setUp(){
//        driver = WebDriverFactory.getDriver("chrome");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//
//        //1. Go to: https://practice.cydeo.com/web-tables
//
//        driver.get("https://practice.cydeo.com/web-tables");
//
//    }
    @Test
    public void order_name_verify_test(){

        driver.get("https://practice.cydeo.com/web-tables");

        //     2. Verify Bob’s name is listed as expected. Expected: “Bob Martin”
        WebElement bobMartinName = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[text()='Bob Martin']"));
        String expectedBobName = "Bob Martin";
        String actualBobName = bobMartinName.getText();

        Assert.assertEquals(actualBobName,expectedBobName);

        //     3. Verify Bob Martin’s order date is as expected  Expected: 12/31/2021
        WebElement bobMartinOrderDate = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[text()='Bob Martin']/following-sibling::td[3]"));
        String expectedBobMartinDate = "12/31/2021";
        String actualBobMartinDate = bobMartinOrderDate.getText();

        Assert.assertEquals(actualBobMartinDate, expectedBobMartinDate);


    }

    @Test
    public void test2(){
        String costumerOrderDate1 = WebTableUtils.returnOrderDate(driver, "Alexandra Gray");
        System.out.println("costumerOrderDate1 = " + costumerOrderDate1);
    }

    @Test
    public void test3(){
WebTableUtils.orderVerify(driver, "Ned Stark", "05/12/2021");
    }


//@AfterMethod
//    public void tearDown(){
//        driver.close();
//}

}
